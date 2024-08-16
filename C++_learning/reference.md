# Reference
## Initialization
```c++
int a = 10;
int &b = a;
int c = 20;
b = c; //all a, b, and c are of value 20
```
1. once initialized the reference cannot be changed
2. any change to b variable will change variable a in the same way
3. the basic of referencing is a constant pointer, the pointer point to the referenced variabel address

## Used in Function for Passing Values
1. recall passing address
```c++
void swap(int *a, int *b){

    int temp = a;
    a = b;
    b = temp;
}
```
2. passing reference can also change variables outside of the function
```c++
void swap2(int &a, int &b){

    int temp = a;
    a = b;
    b = temp;
}
```

## Reference as the Return of Function
1. Do not return reference of local variables
2. calling a function can be on the left
```c++
int& test(){

    static int a = 10;  //static variable saved in global memory, can be accessed in other functions
    return a;
}
int main(){

    test() = 1000;  //the variable a is now of value 1000  
    int& ref2 = test();
    return 0;
}
```

## Referencing a constant
1. used for parameters in funcions to avoid error
```c++
const int & ref = 10;
/*
    this line is the same as
    int temp = 10;
    const int & reft = temp;

    this prevent the value of ref being changed --- read only
*/
```c++
void printOut(int & num){

    num = 100;  //change in the function will also change the variable passed to the function
    cout<< num << endl;
}

void printOut(const int & num){

    //the passed variable cannot be changed within the function
    cout<< num << endl;
}

int main(){

    int a = 10;
    printOut(a);
}
```
