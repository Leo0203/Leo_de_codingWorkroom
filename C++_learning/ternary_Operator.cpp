#include <iostream>
using namespace std;

int main() {
  int a = 10;
  int b = 20;
  int c = 0;

  c = (a > b ? a : b);  // c = 20

  // ternary operator returns a variable which mean it can be assigned a value

  (a > b ? a : b) = 100;

  cout << "a = " << a << endl;
  cout << "b = " << b << endl;
  cout << "c = " << c << endl;
}