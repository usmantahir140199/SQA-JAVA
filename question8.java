import java.io.*;
import java.util.Scanner;
 
class question8 {
 
    // Naive iterative solution to calculate pow(x, n)
    public static long power(int x, int n)
    {
        // Initialize result by 1
        long pow = 1;
 
        // Multiply x for n times
        for (int i = 1; i <= n; i++) {
            pow = pow * x;
          
        }
        return pow;
     
    }
 
    // Driver code
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int x = sc. nextInt();
       int n = sc.nextInt();
        System.out.println(power(x, n));
    }
};