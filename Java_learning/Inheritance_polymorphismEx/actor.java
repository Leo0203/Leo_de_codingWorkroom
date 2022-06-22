package Java_learning.Inheritance_polymorphismEx;

public abstract class actor {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public actor(){

    }

    public actor(String name){
        this.name = name;
    }
    /**
     * an actor can perform
     */
    public void perform(){
        System.out.println("actor: " + name + "is performing! Woho!");
    }
    
}
