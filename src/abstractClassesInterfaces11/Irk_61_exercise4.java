package abstractClassesInterfaces11;

class Library{
    String[] books;
    int no_of_books = 0;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
    }
}
public class Irk_61_exercise4 {
    public static void main(String[] args) {
        //you have to implement a library using java class "Library"
        //Methods : addBook, issueBook,returnBook,showAvailableBooks
        //Properties : Array to store the available books,
        // Array to store the issued books

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow rich");
    }
}
