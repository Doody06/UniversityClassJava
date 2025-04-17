
package pkg224110470_chapter6;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(sum(10,100));
    }
    
    public static int sum(int i1, int i2) {
        int total = 0;
        for (int i = i1; i <= i2; i++) {
            total = total + i;
        }
        return total;
    }
}
