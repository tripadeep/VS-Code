package HackerRank;

import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        String first=null,second=null;
        while(n-->0){
            int count=0;
             first=sc.next();
             second=sc.next();
             for(int i=0;i<first.length();i++){
                for(int j=0;j<second.length();j++){
                    char ch=first.charAt(i);
                    if(second.charAt(j)==ch)
                    count++;
                    else continue;
                }
                
            }
            if(count>=1)        System.out.println("True");
            else System.out.println("False");

        }
        
        
    }
}
