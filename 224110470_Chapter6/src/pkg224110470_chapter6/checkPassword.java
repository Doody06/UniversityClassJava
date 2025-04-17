package pkg224110470_chapter6;

import java.util.Scanner;

public class checkPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password for validation: ");
        if(passwordValidate(input.nextLine()))
            System.out.println("The password is valid");
        else 
            System.out.println("The password is invalid");
    }
    public static boolean passwordValidate(String password) {
        boolean valid = true;
        int numDigits = 0;
        //check if length is less than 8
        if(password.length() < 8)
            valid = false;
        
        //check for special characters AND count number of digits
        for (int i = 0; i < password.length(); i++) {
            if(!(Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i))))
                valid = false;
            if(Character.isDigit(password.charAt(i)))
                numDigits++;
        }
        //check if digits are less than 2 
        if(numDigits < 2)
            valid = false;
        return valid;
    }
}
