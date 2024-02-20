package models;

public class LibraryUsers extends Person{
    private boolean isTeacher;
    private boolean isSenior;
    private boolean isJunior;

    public LibraryUsers(String name, int id) {
        super(name, id);
    }

    public LibraryUsers(String name, int id, boolean isTeacher, boolean isSenior, boolean isJunior) {
        super(name, id);
        this.isTeacher = isTeacher;
        this.isSenior = isSenior;
        this.isJunior = isJunior;
    }

    public boolean isTeacher() {
        return isTeacher;
    }

    public boolean isSenior() {
        return isSenior;
    }

    public boolean isJunior() {
        return isJunior;
    }

    @Override
    public String toString() {
        return "LibraryUsers{" +
                "isTeacher=" + isTeacher +
                ", isSenior=" + isSenior +
                ", isJunior=" + isJunior +
                '}';
    }
}
