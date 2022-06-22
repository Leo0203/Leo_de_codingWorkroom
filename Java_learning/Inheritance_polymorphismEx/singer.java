package Java_learning.Inheritance_polymorphismEx;

public class singer extends actor{

    public singer (){
        super();

    }

    public singer (String name){
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("singer: " + getName() + " is singing like a dying bird! What a show!");
    }
    
}
