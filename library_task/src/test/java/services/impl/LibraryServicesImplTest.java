package services.impl;

import enums.Books;
import models.Library;
import models.LibraryUsers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryServicesImplTest {

    @Test
    void borrowBook() {

        Library libraryInput = new Library(Books.A_MOCKINGBIRD_BY_CIEL_BELLE);
        LibraryUsers users = new LibraryUsers("Isioma", 101);

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();
        libraryServices.addReadersToQueue(users);


        String expected = libraryServices.borrowBook(libraryInput);
        String actual = "Isioma has taken A_MOCKINGBIRD_BY_CIEL_BELLE";
        assertEquals(expected, actual);
    }

    @Test
    void borrowBookInOrder() {

        Library libraryInput = new Library(Books.A_MOCKINGBIRD_BY_CIEL_BELLE);
        LibraryUsers users = new LibraryUsers("Stella",102);

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();
        libraryServices.addReadersToQueue(users);

        String expected = libraryServices.borrowBookInOrder(libraryInput);
        String actual = "Stella has taken A_MOCKINGBIRD_BY_CIEL_BELLE";
        assertEquals(expected, actual);

    }
}