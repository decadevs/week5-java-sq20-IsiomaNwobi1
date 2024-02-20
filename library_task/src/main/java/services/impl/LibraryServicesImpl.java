package services.impl;

import models.Library;
import models.LibraryUsers;
import models.LibraryUsersComparator;
import services.LibraryServices;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LibraryServicesImpl implements LibraryServices {


    PriorityQueue<LibraryUsers> readersOnQueue;
    Queue<LibraryUsers> orderedUsersQueue;

    public LibraryServicesImpl(){
        readersOnQueue = new PriorityQueue<>(new LibraryUsersComparator());
        orderedUsersQueue = new LinkedList<>();

    }
    @Override
    public void addReadersToQueue(LibraryUsers users) {
        readersOnQueue.add(users);
        orderedUsersQueue.add(users);
    }

    @Override
    public String borrowBook(Library bk) {
        if(readersOnQueue.isEmpty()) {
            return "No reader is on the queue";
        }
        LibraryUsers users = readersOnQueue.poll();
        return users.getName() + " has taken " + bk.getBooks();
    }

    @Override
    public String borrowBookInOrder(Library bk) {
        if(orderedUsersQueue.isEmpty()) {
            return "No reader is on the queue";
        }
        LibraryUsers users = orderedUsersQueue.poll();
        return users.getName() + " has taken " + bk.getBooks();
    }
}
