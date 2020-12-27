#ifndef HOTEL_H_INCLUDED
#define HOTEL_H_INCLUDED

#define HOTEL1 872.0 //original cost of each hotel
#define HOTEL2 1838.0
#define HOTEL3 789.0
#define HOTEL4 1658.0
#define DISCOUNT 0.95

//menu funtion: shows the menu, return the input
//getnights funtion: return the nigts costomers are going to live
// showprize funtion: return the prize the customer is goinng to pay
int menu(void);
int getnights(void);
void showprize(double);

#endif //HOTEL_H_INCLUDED