# Variables

## Constant
1. for macro constant: #define name value
2. for constant: const type name = value;
```c++
#define daysInWeek 7
//or
const int WeeksInMonth = 4;
```

## Variable
1. for variables: type name = value;
2. naming: 
    cannot use keywords
    only consist of letter/underscore + letter/underscore/number
    differentialize upper and lower cases
```c++
    int num_1 = 10;
```
3. types of variables: 
    for integers
        int ------- 4 bytes ---- -2^31 ~ 2^31 - 1
        short ----- 2 bytes ---- -2^15 ~ 2^15 - 1
        long ------ 8 bytes ---- -2^31 ~ 2^31 - 1
        long long - 8 bytes ---- -2^63 ~ 2^63 - 1

    for decimals
        float ----- 4 bytes ---- 7 sigfigs (need f at the end of the decimals)
        double ---- 8 bytes ---- 15-16 sigfigs
        outputing a decimal only print out 6 sigfigs
        scientific number
            3e2 = 200
            3e-2 = 0.03

    for characters
        char ------ 1 byte ---- only one letter
            use ''
            saving ASCII of the letter

    for string
   
        char name[] = "value";
        or
        # include <string>
        string name = "value";
    
    for boolean
        bool ------ 1 byte ---- true or false

        != 0 for true, 0 for false
    
    sizeof(type or variables) can be used to find the bytes of types
  
4. escape character
    same as c language


## output a variable or constant
```c++
    cout << "num = " << num_1 << endl;
    cout << "There are " << daysInWeek << " days in a week." << endl;

    //input a variable
    cout << "Enter an integer: ";
    cin >> num_1;
    cout << "current value for the integer is: " << num_1 << endl;

    string str = "hi";
    cout << "Enter an sentence: ";
    cin >> str;
    cout << "current input sentence is : " << str << endl;
```