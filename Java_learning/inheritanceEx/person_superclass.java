package Java_learning.inheritanceEx;

public class person_superclass {

    private String name;
    private String color;
    private int age;
    private String nationality;
    private String job;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public person_superclass(String name, String color, int age, String nationality, String job) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.nationality = nationality;
        this.job = job;
    }


    public person_superclass() {
        super();
    }

    public void move(){
        System.out.println("The person can WALK.");
    }
    
    /**
     * compare which person is older
     * @param person person that is compared with
     * @return
     */
    public int comapreAge(person_superclass person){

        if(this.age > person.age) return 1;
        if(this.age == person.age) return 0;

        return -1;

    }
    

    
}
