package HackerRank;
import java.util.*;
public class substring4 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        String str1=sc.next();
        String str2=sc.next();
        boolean res=isSubstring(str1,str2);
       String str= res==true?"YES! it is a substring.":"NO! it is not a substring"; 
        System.out.print(str);
       


    }
    private static boolean isSubstring(String str1,String str2){
        //boolean res=false;
        int count=0;
      // for(int i=0;i<str1.length();i++){
           int i=0;
           for(int j=0;j<str2.length();j++){
               if(str2.charAt(j)==str2.charAt(i))
               count++;
               else{ continue; }
               i++;

           //}
       }
      if (count!=str2.length()) return false; else return true;
    }
    
}