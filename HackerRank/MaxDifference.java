package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements; // 1    2   5   
  	public int maximumDifference;
      public Difference(int[] a){
          elements=a;
      }

      public void computeDifference() {
          int difference=0;
         Arrays.sort(elements);
         maximumDifference=elements[elements.length-1]-elements[0];
              
        }

	// Add your code here

} // End of Difference class

public class MaxDifference{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

         Difference difference = new Difference(a);

       difference.computeDifference();

        System.out.print(difference.maximumDifference);
        

    }
}