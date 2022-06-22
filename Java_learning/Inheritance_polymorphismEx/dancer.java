package Java_learning.Inheritance_polymorphismEx;

public class dancer extends actor{

    public dancer() {
    }

    public dancer(String name) {
        super(name);
    }

    @Override
    public void perform(){
        System.out.println("dancer: " + getName() + " is dancing like a hippo! Lets goooooo!");
    }
    
}
