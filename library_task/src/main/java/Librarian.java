import enums.Books;
import models.Library;
import models.LibraryUsers;
import services.impl.LibraryServicesImpl;

public class Librarian {
    public static void main(String[] args) {
        LibraryUsers l1 = new LibraryUsers("Teacher Delia Uzo", 01, true, false, false);
        LibraryUsers l2 = new LibraryUsers("Snr. Onyi Onky", 76, false, true, false);
        LibraryUsers l3 = new LibraryUsers("Jnr. Chris Eche", 64, false, false, true);

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();
        Library library = new Library(Books.A_MOCKINGBIRD_BY_CIEL_BELLE);

        libraryServices.addReadersToQueue(l3);
        libraryServices.addReadersToQueue(l2);
        libraryServices.addReadersToQueue(l1);

        System.out.println(libraryServices.borrowBook(library));
        System.out.println(libraryServices.borrowBook(library));
        System.out.println(libraryServices.borrowBook(library));
        System.out.println(libraryServices.borrowBook(library));


        System.out.println("");
        System.out.println("-------------------------");
        System.out.println(libraryServices.borrowBookInOrder(library));
        System.out.println(libraryServices.borrowBookInOrder(library));
        System.out.println(libraryServices.borrowBookInOrder(library));
        System.out.println(libraryServices.borrowBookInOrder(library));

    }
}

