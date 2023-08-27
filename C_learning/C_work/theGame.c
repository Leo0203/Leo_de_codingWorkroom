#include <stdio.h>
#include <stdlib.h>

/*
    create a simple shop for the game
        equip: equip num,name, price, stock, description
        bag: player num, equips[10], equips num, max equips num
        player: player num, name, password, coins, bag
    create a player and buy some equip
        choose the equip player wants
        confirm and pay the coins
        stock   -1
        bag     +1
*/

//equip
typedef struct _equip
{
    int id;             //equip num
    char name[50];      //equip name
    double price;       //equip price
    int stock;          //equip stock
    char describe[200]; //equip describe
}Equip;

//bag
typedef struct _bag
{
    int playerid;       //player num
    int count;          //count player owned equip 
    int max;            //max num of equips
    Equip equips;       //player owned equips struct
}Bag;

//player
typedef struct _player
{
    int id;
    char name[50];
    char pass[50];      //password
    Bag bag;
    double coin;
    double gem;
}Player;

Equip *equips;
int equipsCount = 0;
int playerCount = 0;
Player *players;
void init();            //initialize data
void showequips();
void showplayers();

int main()
{   
    init();
    showequips();
    return 0;
}

void init()
    {
        //initialize
        static Equip equipArray[] = 
        {
            {1, "Double experience", 200, 10, "as you know by names..."},
            {2, "Armor", 500, 5, "basic armor, weak protection"},
            {3, "Dopo", 1000, 5, "hard to find, medium protection"},
            {4, "Heavy armor", 2000, 3, "hard to find, but do not protect user from magic attack"},
            {5, "Tantō", 500, 5, "basic weapon, sell by pairs"},
            {6, "Bagh nakh", 1500, 4, "better weapon, cost a lot damage by using well"},
        };
        equipsCount = 6;
        equips = equipArray;        //pointer pointing to
        
        static Player playerArray[] = 
        {
            {1, "Leo", "Mmm050203", .coin = 1000},
            {2, "Merlin", "Jh890728", .coin = 1000},
            {3, "Bhav", "Ya506783", .coin = 1000},
            {4, "Jack", "De258693", .coin = 1000},
            {5, "Noah", "Susa0421", .coin = 1000},
            {6, "Lisa", "Zzz0726", .coin = 1000},
            {7, "Serena", "Zzz3824", .coin = 1000},
        };
        playerCount = 7;
        players = playerArray;
    }

void showequips()
    {
        int i = 0;
        if(equips == NULL) return;
        printf("%-5s%-14sprice\tstock\tdescribtion\n");
        for (i = 0; i < equipsCount; i++)
        {
            printf("%-5d%-14s\t%.2lf\t%d\t%s\n", equips[i].id, equips[i].name, equips[i].price, equips[i].stock, equips[i].describe);
        }
    }
void showplayers()
    {

    }