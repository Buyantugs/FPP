package day5;

/**
 * Write a method to display the digits of a given integer value n in reverse order.
 * @author Buyantugs
 * @since 06/02/2023
 */
public class Prog1 {

    public static void main(String[] args) {

        reversDigit(356472);
    }

    public static void reversDigit(long digits){

        if(digits<10){ //base case
            System.out.print(digits);
        }else {
            System.out.print(digits%10); //print the last digit
            reversDigit(digits/10); // Recursive call with the remaining digits
        }

    }
}
