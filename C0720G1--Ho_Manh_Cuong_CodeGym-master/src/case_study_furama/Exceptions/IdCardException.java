package case_study_furama.Exceptions;

public class IdCardException extends Exception {
    public IdCardException() {
        super("Id card must be 9 digits and format : XXX XXX XXX.");
    }
}
