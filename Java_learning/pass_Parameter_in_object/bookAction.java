package Java_learning.pass_Parameter_in_object;

/**
 * include the actions avaible to made to books: add a book, delete a book, change the elements, check the elements
 */
public class bookAction {
    
    /**
     * sell a book
     * @param book book for sale
     * @return number of books sold if sales are made, -1 if sale is unsucessful
     */
    public int sellBook(book book){
        //check stock of the book (> 1)
        //reduce stock by 1
        //return number of book sold
        if(!(book.getCount() > 1)){
            return -1;
        }

        book.setCount(book.getCount() - 1);
        return 1;
    }

}
