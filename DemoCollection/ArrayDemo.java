package DemoCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Scanner;

public class ArrayDemo { 
    public static ArrayList<String> parseArray(ArrayList<String> inArray,char numStr){
        ArrayList<String> outArray=new ArrayList<String>();
        for (String elm : inArray) {
            Boolean flag=true;
            for(int index=0;index<elm.length();index++){
                if(elm.charAt(index)==numStr){
                    outArray.add(0,elm+":"+index);
                    flag=false;
                    break;

                }

            }
            if(flag){
                outArray.add(elm);
            }


        }
        return outArray;
    }
    public static void main(final String[] args) {
//         ArrayList<Integer> l1 = new ArrayList<Integer>();
//         l1.add(5);
//         l1.add(4);
//         l1.add(6);
//        l1.remove(0);

//         int r = l1.size();
//         System.out.println(l1);
//         System.out.println(l1.get(1));
//         System.out.println(r);
// Scanner sc=new Scanner(System.in);

        ArrayList<String> inArray = new ArrayList<String>();
        inArray.add("25");
        inArray.add("14");
        inArray.add("5");
        inArray.add("62");
        inArray.add("79");
        System.out.println(parseArray(inArray, '2'));
        
       

    }

}