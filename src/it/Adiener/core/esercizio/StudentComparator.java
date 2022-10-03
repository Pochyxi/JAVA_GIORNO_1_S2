package it.Adiener.core.esercizio;

public class StudentComparator {
    Student s1;
    Student s2;

    public StudentComparator(Student s1, Student s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int compare() {
        if ( s1.calcolaMedia() < s2.calcolaMedia ()) {
            return -1;
        } else if ( s1.calcolaMedia () > s2.calcolaMedia () ) {
            return 1;
        }
        return 0;
    }

}
