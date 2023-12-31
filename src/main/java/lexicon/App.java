package lexicon;

import lexicon.model.Book;
import lexicon.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // Create person object
        Person person = new Person("Anders", "Loren");

        // Create book object
        Book book1 = new Book("Pippi", "Astrid");
        Book book2 = new Book("Millenium", "Stieg");

        // person borrows the book
        System.out.println("loanBook method");
        person.loanBook(book1, person);
        person.loanBook(book2, person);

        System.out.println("\n");

        // display books
        System.out.println("displayBooks");
        person.displayBooks(person);

        System.out.println("\n");

        // show person
        System.out.println("showPerson");
        System.out.println(book1.getBorrower().getFullName());

        System.out.println("\n");

        // remove books
        System.out.println("removeBooks");
        person.removeBook(book1, person);

        System.out.println("\n");

        // display books
        System.out.println("displayBooks");
        person.displayBooks(person);

        System.out.println("\n");
    }
}
