import java.util.Scanner;

public class Main {
    public static int maxStatLevel = 25;
   // eeeeeeeeeeee
    public static void validateCharacterStats(int statToValidate)
            throws UnsupportedOperationException {

        if(statToValidate > maxStatLevel) {
            // throw new exception
            throw new UnsupportedOperationException();
        }
    }
    public static void main(String[] args) {
        // Example Try-Block
        try {
            // Throw an error
            System.out.println(5/0);
        }catch(ArithmeticException ex) {
            // Catch specific Exception
            System.err.println("Divide by zero error!");
        }catch(Exception ex){
            // Do something useful with the exception
            System.err.println(ex.toString());
        }finally {
            // Code in this block executes regardless if an error is found
            System.out.println("Finally block hit!");
        }

        System.out.println("------");
        // Another Try Catch block.
        try {
            validateCharacterStats(50);
        }
        catch(Exception ex) {
            System.err.println(ex.toString());
        }





        // GAME IS HERE -------------------- Play in the Console --------------------------------------------------
        Scanner input = new Scanner(System.in); // import that allows user to type input
        String usersInput = ""; // var for user text input

        System.out.println("-- CAVE ESCAPE --");
        System.out.println("You walk into an abandon mine to go exploring. The entrance collapses once you enter. You're in a small cave room and it's dark.");


        System.out.println("What do you do??");
        usersInput = input.next(); // get input

        if (usersInput == "feel") { System.out.println("you feel around and find an old steel pickaxe..."); }
        else {System.out.println(usersInput + " is not recognized");}



        System.out.println("What do you do??");
        usersInput = input.next(); // get input



        System.out.println("What do you do??");
        usersInput = input.next(); // get input






    }

    }
