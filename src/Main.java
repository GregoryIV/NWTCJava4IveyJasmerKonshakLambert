public class Main {
    public static int maxStatLevel = 25;

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

        System.out.println("-----");

        try {
            validateCharacterStats(50);
        }
        catch(Exception ex) {
            System.err.println(ex.toString());
        }

    }

    }
