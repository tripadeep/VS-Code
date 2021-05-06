package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacter {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String string1 = "Greatterr";  
        int count;   
        char string[] = string1.toCharArray();  
        HashMap<Character,Integer>hs=new HashMap<>();
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;   
                    string[j] = '0';  
                }  
            }  
            if(count > 1 && string[i] != '0'){
                System.out.println(count+"-" +string[i]);  
                hs.put(string[i],count);
            }
                
        }  
        System.out.println(hs);
        Collection<Integer> val=hs.values();
        ArrayList<Integer> list
            = new ArrayList<>(val);
            Collections.sort(list);
           System.out.println(list.get(list.size()-2));
    }
}
