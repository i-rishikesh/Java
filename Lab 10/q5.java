
// Create an user defined exception named Check Argument to check the number of arguments passed through command line. 
//If the number of arguments is less than four, throw the Check Argument exception, else print the addition of squares of all the four elements.
// ited States)
import java.util.*;

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class q5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgumentException("At least four arguments required.");
            }
            int sumOfSquares = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sumOfSquares += num * num;
            }
            System.out.println("The addition of squares of all four elements is " + sumOfSquares);
        } catch (CheckArgumentException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Arguments must be integers.");
        }
    }
}