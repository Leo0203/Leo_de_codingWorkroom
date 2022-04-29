package Java_learning.pass_Parameter_in_object;

public class bookTest {

    public static void main(String[]args){
        
        book book = new book("The Kite Runner", "00236", 15.00, 5);
        //the information stored in JVM pass its hashcode (address) to the storage of main -> 引用传递

        bookAction bookAction = new bookAction();
        bookAction.sellBook(book);

        System.out.println(book.getCount());
    }
    
}
