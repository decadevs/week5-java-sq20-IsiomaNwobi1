package services;

import models.Library;
import models.LibraryUsers;

public interface LibraryServices {
    public void addReadersToQueue (LibraryUsers users);
    public String borrowBook (Library bk);
    public String borrowBookInOrder (Library bk);
}
