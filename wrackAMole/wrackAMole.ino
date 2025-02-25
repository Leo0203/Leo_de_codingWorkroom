#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_RESET    -1
#define SCREEN_ADDRESS 0x3C  // 可能是 0x3D


#define NUM_LEDS 5
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);
// 定义 LED GPIO 引脚
const int ledPins[NUM_LEDS] = {16, 17, 18, 19, 5};

// 定义 按钮 GPIO 引脚
const int buttonPins[NUM_LEDS] = {32, 33, 25, 26, 27};

void setup() {
    Serial.begin(115200);
    randomSeed(analogRead(0));  // 初始化随机数种子
    Wire.begin(21, 22);

    if (!display.begin(SSD1306_SWITCHCAPVCC, SCREEN_ADDRESS)) {
        Serial.println(F("OLED fail"));
        for (;;);
    }

    // 设置 LED 为输出模式
    for (int i = 0; i < NUM_LEDS; i++) {
        pinMode(ledPins[i], OUTPUT);
        digitalWrite(ledPins[i], LOW);  // 先关闭 LED
    }

    // 设置按钮为输入模式 + 内部上拉
    for (int i = 0; i < NUM_LEDS; i++) {
        pinMode(buttonPins[i], INPUT_PULLUP);
    }
}

void loop() {
    display.begin(SSD1306_SWITCHCAPVCC, SCREEN_ADDRESS);

    display.clearDisplay();
    display.setTextSize(2);
    display.setTextColor(SSD1306_WHITE);
    display.setCursor(10, 10);
    display.display();
    Serial.println("Game Start");
    delay(1000);

    // 选择随机 LED
    int randomIndex = random(0, NUM_LEDS);  // 生成 0~4 的随机数
    int chosenLed = ledPins[randomIndex];
    int chosenButton = buttonPins[randomIndex];

    Serial.print("turn on LED: GPIO ");
    Serial.println(chosenLed);

    // 亮灯
    digitalWrite(chosenLed, HIGH);

    // 等待玩家反应，最多 1 秒
    unsigned long startTime = millis();
    bool success = false;

    // 亮灯 & OLED 显示“地鼠出现”
    digitalWrite(chosenLed, HIGH);
    display.clearDisplay();
    display.setCursor(10, 10);
    display.println("Hit the Mole!");
    display.display();

    while (millis() - startTime < 1000) { // 1秒内等待输入
        if (digitalRead(chosenButton) == LOW) { // 按钮按下
            success = true;
            break;
        }
    }

    // 关灯
    digitalWrite(chosenLed, LOW);

    display.clearDisplay();
    if (success) {
        showSuccessAnimation();  // 显示动画
    } else {
        showFailAnimation();  // 显示失败动画
    }
    display.display();

    delay(2000);  // 休息 2 秒后开始下一轮
}



// 成功动画：显示+1得分
void showSuccessAnimation() {
    for (int i = 0; i < 5; i++) {
        display.clearDisplay();
        // display.setCursor(10, 10);
        // display.println("Victory!");
        display.setCursor(10, 10);
        display.println("+1 Point!");
        display.fillCircle(64, 50, i * 3, SSD1306_WHITE);  // 逐渐扩大的圆
        display.display();
        delay(100);
    }
}

// 失败动画：显示“没打中”
void showFailAnimation() {
        display.clearDisplay();
        display.setCursor(10, 10);
        // display.println("Defeat!");
        display.println("Try Again!");
        display.display();
        delay(200);

}