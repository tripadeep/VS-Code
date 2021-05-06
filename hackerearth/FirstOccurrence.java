package hackerearth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class FirstOccurrence {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t-->0){
            String name = sc.next(); 
            char []str=new char[name.length()];
        for(int i=0;i<name.length();i++){
            for(int j=0;j<name.length();j++){
                if(str[j]==name.charAt(i)){
                    count=1;
                }           
            }
           
            if(count==0)
                str[i]=name.charAt(i);                     
              count=0;
        }
    
        for(int i=0;i<str.length;i++){
           
           
            if((int)str[i]==0) continue;
            else
            System.out.print(str[i]);
        }

        }
       
    
sc.close();*/
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
String str=sc.next();
LinkedHashSet<Character> s=new LinkedHashSet<Character>();
for(int i=0;i<str.length();i++){
    s.add(str.charAt(i));
}
for (Character character : s) {
    System.out.println(character);
}
    }
}