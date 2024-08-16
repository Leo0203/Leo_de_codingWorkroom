# Everything C++ is the same with C
## if, else if
## switch
## while, for, do while
## break, continue, goto
```c++
int main(){

    cout << "1" << endl;
    goto FLAG;
    cout << "2" << endl;
    FLAG:   // need a token for goto to jump to
    cout << "3" << endl;
    system("pause");
    return 0;
}
```
## random number
```c++
rand()%100 + 1 // random number between 1 - 100
```
## array
1. initialize an array
```c++
int arr1[10];
int arr2[] = {1,2,3,4};
int arr3[3] = {1};
```
2. array save the data within consecutive memories
3. you can use for loop to print out the array
4. using sizeof to find number of elements in the array
```c++
int numberOfElement = sizeof(arr)/sizeof(arr[0]);
```
5. the array name is also a pointer to the first element， thus is a constant
```c++
cout << arr << endl;
```
6. 2D array initialize: 
    1) type name [rows][cols]
    2) type name [rows][cols] = {{ele1, ele2, ...}, {ele3, ele4}};
    3) type name [rows][cols] = {ele1, ele2, ele3, ele4, ...};
    4) type name [][cols] = {{ele1, ele2, ele3, ele4, ...}};
7. 2D array name can be used to find size of array, size of one row, size of one element
```c++
sizeof(arr); 
sizeof(arr[0]); //size of one row
sizeof(arr[0][0]); //size of one element

sizeof(arr) / sizeof(arr[0]); //number of rows
sizeof(arr[0]) / sizeof(arr[0][0]); //number of cols
```
## function
1. define a function:
    return type name (parameters){

        code;
        return variable;
    }
```c++
int add(int num1, int num2){

    int sum = num1 + num2;
    return sum;
}
```
2. use address to change variables passed to functions

## structure
## Memories
1. code memory: store zeros and ones that complier have translate for computer to execute
2. global memory: store global variables, static variables and constant
3. stack memory: complier managed, store parameters and local variables
4. pile memory: programmer managed, require programmer to release (new, delete)