package Java_learning.inheritanceEx;

public class objectArraySort {

    public static void main(String[] args){

        hero hero1 = new hero();
        hero hero2 = new hero();
        hero hero3 = new hero();
        hero hero4 = new hero();
        hero hero5 = new hero();
        emperor emperor1 = new emperor();
        emperor emperor2 = new emperor();
        emperor emperor3 = new emperor();
        emperor emperor4 = new emperor();
        emperor emperor5 = new emperor();

        person_superclass[] personArray = {hero1, hero2, hero3, hero4, hero5, emperor1, emperor2, emperor3, emperor4, emperor5};

        for(int i = 0; i < personArray.length; i++){
            for(int j = 0; j < personArray.length; j++){
                if(personArray[j].compareName(personArray[j+1]) < 0){
                    person_superclass person = personArray[j];
                    personArray[j] = personArray[j+1];
                    personArray[j+1] = person;
                }
            }
        }
        for(person_superclass person : personArray){
            System.out.println(person);
        }



        
    }
    
}
