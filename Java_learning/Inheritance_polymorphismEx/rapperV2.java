package Java_learning.Inheritance_polymorphismEx;


public class rapperV2 extends actor{

    public rapperV2() {
    }

    public rapperV2(String name) {
        super(name);
    }

    @Override
    public void perform(){

        System.out.println(getName() + "YeaYeaYeaYEAyeayeayeaYEA!");
    }
    
}
