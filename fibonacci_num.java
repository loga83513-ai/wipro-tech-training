import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        
        if (n < 1 || m < 1 || n > 20 || m > 20) {
            System.out.println("Invalid Input");
            return;
        }

        int a = 0, b = 1, c = 0;
        double sum = 0;

       
        for (int i = 1; i <= m; i++) {

            if (i == 1)
                c = 0;
            else if (i == 2)
                c = 1;
            else {
                c = a + b;
                a = b;
                b = c;
            }

            
            if (i >= n && i <= m) {
                sum += c;
            }
        }

        System.out.println("The Sum of Fibonacci value is " + sum);
    }
}
