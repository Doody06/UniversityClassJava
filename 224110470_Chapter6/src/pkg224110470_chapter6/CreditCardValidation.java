package pkg224110470_chapter6;

import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the credit card number as a long integer: ");
        if(isValid(input.nextLong()))
            System.out.println("The credit card is valid");
        else
            System.out.println("The credit card is not valid");
    }
    
    public static boolean isValid(Long number) {
        boolean valid = true;
        int numberLength = getSize(number);
        if(numberLength < 13 || numberLength > 16)
            valid = false;
        boolean prefixValid = false;
        
        if (prefixMatched(number, 4))
            prefixValid = true;
        if (prefixMatched(number, 5))
            prefixValid = true; 
        if (prefixMatched(number, 37))
            prefixValid = true; 
        if (prefixMatched(number, 6))
            prefixValid = true;
        
        int sum4 = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        
        if(sum4%10 != 0)
            valid = false;
        return valid;
    }
    public static int getSize(long d) {
        String a = "" + d;
        return a.length();
    }
    public static boolean prefixMatched(long number, int d) {
        String dString = ""+d;
        int lengthD = dString.length();
        String numberString = ""+number;
        
        boolean isPrefix = true;
        for (int i = 0; i < lengthD; i++) {
            if (numberString.charAt(i) != dString.charAt(i)) 
                isPrefix = false;
        }
        return isPrefix;
    }
    public static int sumOfDoubleEvenPlace(long number) { //use debugger to check the for loop in detai;
        String numberString = ""+number;
        int sumOfDoubleEvenPlace = 0;
        
        for (int i = 0; i < numberString.length() ; i +=2) {
            int digit = numberString.charAt(i);
            if(2*digit>=10) {
                int digitDouble = 2*digit;
                String digitDoubleString = ""+digitDouble;
                digit = ((int)digitDoubleString.charAt(0) + (int)digitDoubleString.charAt(1));
                System.out.println(digit);
            }
            else
                digit = 2*digit;
            sumOfDoubleEvenPlace += digit;
        }
        return sumOfDoubleEvenPlace;
    }
    public static int sumOfOddPlace(long number) { //I STOPPED HERE
        return 38;
    }
}
