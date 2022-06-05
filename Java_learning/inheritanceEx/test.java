package Java_learning.inheritanceEx;


public class test {

    public static void main(String args[]){
        hero Adam = new hero("Adam", "white", 35, "earth high level mammal male", "enjoy the life", "first human on the world");

        System.out.println(Adam.getLegend());

        //子类实现父类
        person_superclass Tom = new hero();
        Tom.move();

        hero Adam2 = new hero("Adam", "white", 35, "earth high level mammal male", "enjoy the life", "first human on the world");
        System.out.println(Adam.equals(Adam2));
        //return false, compare the address. effect same as "=". 
        //to make adam2 = adam return true, overrride the method
        //everything is object. superclass is also a subclass of object class


        hero Adam3 = new hero("Adam", "white", 10, "earth high level mammal male", "enjoy the life", "first human on the world");
        System.out.println(Adam3.comapreAge(Adam));

        emperor Alexander = new emperor("Alexander", "white", 50, "Britain", "Emperor", "The Great", 13);
        Alexander.makeAppearance();

        System.out.println(Alexander);
        
    }
    
}
