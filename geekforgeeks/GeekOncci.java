package geekforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class GeekOncci {
    private static final Scanner sc=new Scanner(System.in);
	public static void main (String[] args) {
		//code
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int N=sc.nextInt();
		int sum=geekOncci(A,B,C,N);
		System.out.println(sum);
	}
	static int geekOncci(int a,int b,int c,int n){
	  int sum=a+b+c;
	    if(n==4)
	    return sum;
	    else
	    return geekOncci(b,c,sum,n-1);
	    
	}
}