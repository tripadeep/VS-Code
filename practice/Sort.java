package practice;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0) {
            int count=0;
			String str=sc.next();
			str=str.toLowerCase();
			for(int i=0;i<str.length();i++)
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
			count++;
		}
        System.out.println(count);
	}
    }

}