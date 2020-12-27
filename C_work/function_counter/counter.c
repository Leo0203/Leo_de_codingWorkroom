//count the number of function calls

extern int whilecount;
void counter();

void counter(int i) //calculate the calls of counter funtion
{
    static int subtotal = 0; //only doing this line for once, and distribute a space in memory, won't destribute again
    subtotal ++;
    
    return count;
}