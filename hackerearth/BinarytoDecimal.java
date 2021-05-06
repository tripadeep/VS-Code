package hackerearth;

import  java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
    //     String str="1111";
    //    // int decimal=Integer.parseInt(str,2);
    //     System.out.println(Long.parseLong(str,2));
    //     //System.out.println(decimal);
    //     String s=Integer.toBinaryString(62376);
    //     System.out.println(s);
        Scanner sc=new Scanner(System.in);
       String bin=sc.nextLine();
        int decimal=Integer.parseInt(bin,2);
        System.out.println(decimal);

    }
    
}