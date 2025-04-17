package pkg224110470_chapter6;

public class GCDUsingMethods {
    public static void main(String[] args) {
        System.out.println(gcd(10,15));
    }
    public static int gcd(int a, int b) {
        int counter;
        int gcd = 1;
        if(a < b)
            counter = a;
        else
            counter = b;
        
        for (int i = counter; i > 1; i--) {
            if(a%i==0 && b%i==0) {
                gcd = i;
                break;
            }
        }
            return gcd;
        }
    
}
