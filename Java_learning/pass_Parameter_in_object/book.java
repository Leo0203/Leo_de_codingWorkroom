package Java_learning.pass_Parameter_in_object;

public class book {


    //MVC: model view controller

    private String name;
    private double price;
    private String isbn;    //code for checking the book
    private int count;
    private boolean isborrow;   //weather is it available for borrow



    

    public book(){

    }


    public book(String name, String isbn, double price, int count) {
        this.name = name;
        this.price = price;
        this.isbn = isbn;
        this.count = count;
        this.isborrow = isborrow;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        if(price < 0){
            price  = 0;

        }else{
            this.price = price;
        }
        this.price = price;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        if(count < 0){
            count = 0;

        }else{
            this.count = count;
        }

        this.count = count;
    }

    public boolean isIsborrow() {
        return isborrow;
    }


    public void setIsborrow(boolean isborrow) {
        this.isborrow = isborrow;
    }

}
