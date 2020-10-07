package exceptions;

public class GenderException extends Exception{
    public GenderException(){
        super("\nGender must be Male, Female or Unknown.");
    }
}
