package Java_learning.inheritanceEx;

public class hero extends person_superclass{

    //can only inherit one superclass
    //for a inheritance to make sense, there must be a "is a" relationship
    //private variable and method cannot be inherited, superclass's constructor cannnot be inherited
    //the special variable of hero. The legend (story) they have
    private String legend;

    public String getLegend() {
        return legend;
    }

    public void setLegend(String legend) {
        this.legend = legend;
    }

    public hero(){
        super();    //automatically call the constructor of the super class
    }

    public hero(String name, String color, int age, String nationality, String job, String legend){
        setAge(age);
        setColor(color);
        setJob(job);
        setName(name);
        setNationality(nationality);
        setLegend(legend);

    }

    //override the superclass's method
    public void move(){
        System.out.println("The hero can FLY!!!");
    }
    

    @Override
    public boolean equals(Object obj){
        //if the obj is a 实例 of the hero
        if(!(obj instanceof hero)){
            return false;
        }
        hero compareHero = (hero)obj;
        //comapre the variables
        if(getName().equals(compareHero.getName()) && getNationality().equals(compareHero.getNationality())){
            return true;
        }
        return false;
    }
}
