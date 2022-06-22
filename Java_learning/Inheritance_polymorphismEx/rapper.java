package Java_learning.Inheritance_polymorphismEx;

public class rapper extends actor{

    public rapper() {
    }

    public rapper(String name) {
        super(name);
    }

    @Override
    public void perform(){
        System.out.println("rapper: " + getName() + " is rapping like a stammer! YOYoYOYoYoYOO!");
    }
    
}
