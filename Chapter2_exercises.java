// last accessed 1/14/2025
package pkg224110470_chapter2;
import java.util.Scanner;

public class Chapter2_exercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of total seconds");
        int totalSeconds = input.nextInt();
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds - minutes*60; //with modulus totalSeconds % minutes
        
        System.out.println("the total number of minutes is : "+ minutes);
        System.out.println("The number of remaining seconds is : "+ seconds);
           
    }
}
