package exceptions;

public class BirthdayException extends Exception {
    public BirthdayException(){
        super("Birthday > 1800, less than current year is 18 year old.\n And format : dd/MM/yyyy or MM/dd/yyyy.");
    }

}
