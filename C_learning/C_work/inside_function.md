<ctype.h> 
int isupper(int) : return input is a UPPER character or not (0 false)
e.g. printf("%d\n", isupper("a"));
int islower(int) : return input is a lower character or not
e.g. printf("%d\n", islower("a"));
int isalpha(int) : return input is a character or not
int isdigit(int) : return input is a number or not
note: simply number means ascii, need a pair of single qutation mark 
e.g. printf("%d\n", isdigit('9'));
int toupper(int) : return correspound UPPER character
int tolower(int) : retunr correspound lower character

<math.h>
double ceil(double) :   to the next num(进一)
double floor(double):   to the previous num
double sqrt(double) :   return the squre root
double pow(double, double) : return the n's power of a num
int abs(int)        :   return the absolute value

<stdlib.h>
int srand(unsigned int) :   random number's seed, usually times (time(NULL))
int rand(void)          :   give a number between 0-36767, normally use with srand
void exit(int)          :   stop the code (0: exit normally; not 0: not normal)
viod system(const char*):   do dos commend