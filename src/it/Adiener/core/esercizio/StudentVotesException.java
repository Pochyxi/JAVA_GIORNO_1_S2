package it.Adiener.core.esercizio;

public class StudentVotesException extends Exception{

    private int errVote;

    public StudentVotesException(String message, int eV){
        super(message);
        this.errVote = eV;
    }

    public int getErrVote () {
        return errVote;
    }
}
