package models;

import java.util.Comparator;

public class LibraryUsersComparator implements Comparator<LibraryUsers> {
    @Override
    public int compare(LibraryUsers p1, LibraryUsers p2) {

        if(p1.isTeacher() && !p2.isTeacher()){
            return -1;
        } else if (!p1.isTeacher() && p2.isTeacher()) {
            return 1;
        } else if (p1.isSenior() && !p2.isSenior()) {
            return -1;
        } else if (!p1.isSenior() && p2.isSenior()) {
            return 1;
        } else if (p1.isJunior() && !p2.isJunior()) {
            return -1;
        } else if (!p1.isJunior() && p2.isJunior()) {

    }
        return 0;
    }
}
