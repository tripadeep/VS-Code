package practice;

import java.util.Scanner;

public class Array {
    private static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int res=(n*(n+1))/2;
        System.out.println(res+1);
    }

}
