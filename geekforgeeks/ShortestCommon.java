package geekforgeeks;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ShortestCommon {
    public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		String str="";
		String str1="";
		while(test-->0){
		    str=sc.next();
		    str1=sc.next();
        }
        HashSet hs=new HashSet<>();
		 
        String s=str+str1;
        System.out.println(s);
		char[] ch1=s.toCharArray();
		for(char c:ch1){
		    hs.add(c);
        }
        
		System.out.print(hs+"\n"+hs.size());
		
	}
    
}