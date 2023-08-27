#include <stdio.h>

//search an element in an array, return the index of the element
int search();
//buble sort, and retunr the sorted array
double sort();
//enter passord, return and print the right password 
char* passord();

int main()
{
    int index = search();
    printf("the element index is: %d\n", index);
    return 0;
}

int search()
{
    int nums[5] = {34, 35, 36, 37, 38};
    int search = 0;
    int index = -1; //if search is not there, the index would be -1
    int i = 0;
    printf("please enter the number you would like to search: ");
    scanf("%d", &search);
    for (i = 0; i < 5; i++)
    {
        if (search == nums[i])
        {
            index = i;
            break;
        }
    }
    return index;
}