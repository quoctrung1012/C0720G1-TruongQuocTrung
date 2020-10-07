package controllers;

public class MainTest {
    public static void main(String[] args) {
        try{
            MainController.displayMainMenu();
        } catch (NumberFormatException e){
            System.err.println("Input Number not Input String");

        }

    }
}
