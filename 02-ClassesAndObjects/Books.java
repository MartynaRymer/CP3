public class Books {

    public static void main(String args[]) {
        Book bookOne = new Book("Lord of the rings");
        Book bookTwo = new Book("The godfather");
 

        bookOne.author = "J.R.R. Tolkien";
        bookOne.noOfPages = 1000;
        bookOne.publishYear = 1954;
        bookOne.publisher = "ABCD";
        bookOne.isPaper = true;
        bookOne.price = 300;

        bookTwo.author = "Mario Puzo";
        bookTwo.noOfPages = 100;
        bookTwo.publishYear = 1969;
        bookTwo.publisher = "ABCD";
        bookTwo.isPaper = true;
        bookTwo.price = 100.50;


        bookOne.displayInfo();
        bookOne.openBook();
        bookOne.displayCurrentPageNo();
        bookOne.goToNextPage();
        bookOne.closeBook();
    }
    
 }