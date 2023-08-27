typedef struct _job
{
    int id;         //job number
    char * name;    //job name
    char * desc;    //job describe
}Job;

typedef struct _ability
{
    int id;         //ability number
    char * name;    //ability name
    char * intro;   //ability describe
}Ability;

typedef struct _hero
{
    int id;         //hero number
    char * name;    //hero name
    char sex;       //hero sex
    Job job;        //hero job (use of struct)
    double hp;      //hero health point
    double speed;   //hero speed
    Ability ability;//hero ability (similarr to job)
}Hero;

void inputHero();
void outputHerro();