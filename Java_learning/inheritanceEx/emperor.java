package Java_learning.inheritanceEx;

public class emperor extends person_superclass {

    private String epithet;
    private int reigningPeriod;

    
    

    public emperor(String name, String color, int age, String nationality, String job, String epithet,
            int reigningPeriod) {
        super(name, color, age, nationality, job);
        this.epithet = epithet;
        this.reigningPeriod = reigningPeriod;
    }

    public emperor() {
        
    }

    public int getReigningPeriod() {
        return reigningPeriod;
    }

    public void setReigningPeriod(int reigningPeriod) {
        this.reigningPeriod = reigningPeriod;
    }

    public String getEpithet() {
        return epithet;
    }

    public void setEpithet(String epithet){
        this.epithet = epithet;
    }

    public void makeAppearance(){
        System.out.println("The emperor, " + getName() + " " + getEpithet() + " is here!");
    }
    
    //use override to capsulate println

    @Override
    public String toString(){
        StringBuffer str = new StringBuffer(getName());
        str.append("\t");
        str.append(getEpithet());
        str.append("\t");
        str.append(getAge());
        str.append("\t");
        str.append(getNationality());
        str.append("\t");
        str.append(getReigningPeriod());

        
        return str.toString();

        
    }
}
