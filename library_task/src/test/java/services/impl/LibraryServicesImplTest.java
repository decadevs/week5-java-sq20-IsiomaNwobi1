package services.impl;

import enums.Books;
import models.Library;
import models.LibraryUsers;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServicesImplTest {

    @Test
    void addReadersToQueue() {

        LibraryUsers pL = new LibraryUsers("Teacher Delia Uzo", 01);

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        libraryServices.addReadersToQueue(pL);

        String expected = "";
        assertEquals(expected, actualContent.toString());


    }

    @Test
    void borrowBook() {

        Library libraryInput = new Library(Books.A_MOCKINGBIRD_BY_CIEL_BELLE);

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        libraryServices.borrowBook(libraryInput);

        String expected = "";
        assertEquals(expected, actualContent.toString());

    }

    @Test
    void borrowBookInOrder() {

        Library libraryInput = new Library(Books.A_MOCKINGBIRD_BY_CIEL_BELLE);

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));

        libraryServices.borrowBook(libraryInput);

        String expected = "";
        assertEquals(expected, actualContent.toString());

    }
}