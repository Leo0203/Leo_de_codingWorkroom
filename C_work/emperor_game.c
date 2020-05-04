#include <stdio.h>
#include <stdlib.h>
#include <string.h>             //支持字符串操作

int main()
{

    char emperor_name[50];      //皇帝名称
    int choose = 0;             //皇帝的选择1-4之间
    int count = 4;              //拥有妃子个数
    int search = -1;             //存放查找到元素下标
    const MAX = 6;              //常量max表示最大妃子数量
    char temp_name[10];         //存放临时字符串字符数组
    char names[MAX][20] = {"貂蝉", "西施", "杨玉环", "甄嬛", "郭德纲"};
    //级别
    char level_names[5][10] = {"贵人","嫔妃","贵妃","皇贵妃","皇后"}; 
    //每个妃子的级别
    int levels[MAX] = {2, 1, 0, 0, 0, -1};
    //每个妃子的好感度，初始值100
    int loves[MAX] = {100, 100, 100, 100, 100, -1};
   
    printf("请输入当前登基皇帝字号：");
    scanf("%s", emperor_name);  //录入字符串，不需要&
    printf("%s皇帝驾临！one three! one three! one one three!\n",emperor_name);

    printf("\n*****************************************************\n");
    printf("%s \t级别\t好感度\n", "姓名");
    for (int i = 0; i < count; i++)
    {
    printf("%s\t%s\t%d\n", names[i], level_names[levels[i]], loves[i] );
    }
    printf("\n*****************************************************\n");

    printf("1.皇帝下旨选妃 \n");
    printf("2.翻牌宠幸 \n");
    printf("3.打入冷宫 \n");
    printf("4.召见爱妃 \n");
    printf("陛下请选择：");
    scanf("%d", &choose);
    switch (choose)
    {
    case 1: //皇帝选妃，增加数组：loves, names, levels.
            //判断数组空间足不足够
        if (count < MAX)
        {
            //执行添加妃子
            printf("请输入娘娘名讳：");
            //把新妃子存在第count个元素
            scanf("%s", names[count]);
            //级别初始值：0
            levels[count] = 0;
            //好感度初始值：100
            loves[count] = 100;
            count++;

        }
        else
        {
            printf("陛下要注意龙体啊，后宫已经人满为患了。\n");
        }
    break;
    case 2: //找到元素，修改状态：好感+10，级别+1
            //修改其他状态：好感-10
        printf("陛下今天要翻牌哪位娘娘呢？\n");
        scanf("%s", temp_name);
            //查找strcmp，引用string头文件
        for (int i = 0; i < count; i++)
        {
            if (strcmp(temp_name, names[i]) == 0)
            {
                loves[i] += 10;
            //级别不能超过5级(0-4)
                levels[i] = levels[i] >= 4 ? 4 : levels[i] + 1;
            }
            else
            {
                loves[i] -= 10;
            }
        }
    break;
    case 3: //查找，后面一个赋值给前面一个，总数 - -, 修改其他妃子状态
        printf("陛下今天要把哪位娘娘打入冷宫？\n");
        scanf("%s", temp_name);
        for(int i = 0; i < count; i++)
        {
            if (strcmp(temp_name, names[i]) == 0) 
            {
                search = i;
                break;
            }
        }
        if (-1 == search)
        {
            printf("虚惊一场，无人打入冷宫！\n");
        }
        else
        {
            for(int i = search; i < count - 1; i++)
            {
                //names[i] = names[i + 1]; 不可以，C不支持数组直接赋值
                strcpy(names[i], names[i + 1]);
                loves[i] = loves[i + 1];
                levels[i] = levels[i + 1];

                loves[i] += 10;
            }
            count--;
        }
        
    break;
    case 4: //查找，增加好感度   
    break;
    default:
        printf("君无戏言，陛下请再次确认。");
  }
// 打印之前以级别排序

for(int i = 0; i < count - 1; i ++)
{
    for(int j = 0; j < count - i - 1; j++)
    {
        if(levels[j] < levels[j + 1])
        {
            int temp = levels[j];
            levels[j] = levels[j + 1];
            levels[j + 1] = temp; 
            
            temp = loves[j];
            loves[j] = loves[j + 1];
            loves[j + 1] = temp; 

            strcpy(temp_name, names[j]);
            strcpy(names[j], names[j + 1]);
            strcpy(names[j + 1], temp_name);
        }
    
    }
}

printf("\n*****************************************************\n");
printf("%s \t级别\t好感度\n", "姓名");
for (int i = 0; i < count; i++)
{
    printf("%s\t%s\t%d\n", names[i], level_names[levels[i]], loves[i] );
}
printf("\n*****************************************************\n");
  return 0;
}
