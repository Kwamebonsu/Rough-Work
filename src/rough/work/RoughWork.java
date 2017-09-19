/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rough.work;

/**
 *
 * @author bonsk5852
 */
public class RoughWork {

    /**
     * @param args the command line arguments
     */
    public int convert(int n, int b) {
        // Create a variable for the binary number
        int remainder = 0;
        // If the number = 1 end the loop
        if (n == 1) {
            remainder = n;
            System.out.print(remainder);
            return remainder;
        } else {
            // Find the remainder of the number and output it. Then divide the number by b
            remainder = n % b;
            n = n / b;
            b = b;
            if (remainder < 10) {
                System.out.print(remainder);
            }
            convert(n, b);
            return remainder;
        }
    }

    public static void main(String[] args) {
        // Test the method
        RoughWork test = new RoughWork();
        test.convert(1000, 16);
        System.out.println("");
    }
}
