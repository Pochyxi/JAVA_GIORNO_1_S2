package it.Adiener.core.esercizio;

public class Student {

    private String name;
    private int age;

    private int[] votes;
    private int media;

    public Student(String name, int[] votes) {
        setName(name);
        setVotes ( votes );
        media = calcolaMedia ();
    }

    public String getName () {
        return name;
    }

    public void setVotes ( int[] votes ) {
        this.votes = votes;
        calcolaMedia ();
    }

    public int calcolaMedia() {
        int s = 0;
        for ( int vote : votes ) {
            s += vote;
        }
        media = s / votes.length;
        return media;
    };

    public void setName ( String name ) {
        this.name = name;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getDescription() {
        return this.name + " is " + this.age + " years old.";
    }


}
