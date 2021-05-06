package practice;
import java.util.*;
public class StoneSequence {
private static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String input=sc.next();
        String ins=sc.next();
        int j=0;
        for(int i=0;i<ins.length();i++){
            for( j=0;j<input.length();j++){
                if(ins.charAt(i)==input.charAt(j)){
                    j+=2;
                }
                else continue;

            }
        }
        System.out.println(j-1);
    }
    
}
