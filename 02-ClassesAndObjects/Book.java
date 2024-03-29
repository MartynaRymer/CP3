/*
 Define a class for describing books.
 Then, define fields and methods in the class that represent the attributes and behaviors of the book objects.
 Finally, create two books, assign them attribute values, and call defined methods. 
 */

public class Book
{
    String title;
    String author;
    int noOfPages;
    int publishYear;
    String publisher;
    boolean isPaper;
    double price;
    boolean isOpen = false;
    int currentPage = 1;
    
    public Book(String title) {
      this.title = title;
   }
   
    void displayInfo(){
        System.out.println("Title is: " + title + "\n"
        + "Author is: " + author + "\n"
        + "Number of pages is: " + noOfPages + "\n"
        + "Publish year is: " + publishYear + "\n"
        + "Publisher is: " + publisher + "\n"
        + "It is a " + ((isPaper == false) ? "digital" : "paper") + " book." + "\n"
        + "The price is: " + price);
    }
    
    void openBook(){
        isOpen = true;
    }
    
    void closeBook(){
        isOpen = false;
    }    
    
    void goToNextPage(){
        if (isOpen) {
            currentPage += 1;
        }
    }
    
    void goToPreviousPage(){
        if (isOpen) {
            currentPage -= 1;
        }
    }
    
    void displayCurrentPageNo(){
        System.out.println("Current page is: " + currentPage);
    }
}
