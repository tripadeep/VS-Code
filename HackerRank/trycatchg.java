package HackerRank;
import java.io.*;
import java.util.*;

public class trycatchg {
    trycatchg(int a, int b) {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }

    trycatchg(float a, float b) {
        try {
            float c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        trycatchg s = new trycatchg(a, b);
       
    }
}
