package pkg224110470_chapter6;

import java.util.Scanner;

public class CountLettersInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        System.out.println("The number of letters in this string is: "+ countLetters(in.nextLine()));
    }
    
    public static int countLetters(String s) {
        int numLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                numLetters++;
        }
        return numLetters;
    }
}

//if(Character.isAlphabetic(s.charAt(i)))