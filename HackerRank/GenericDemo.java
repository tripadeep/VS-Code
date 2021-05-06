package HackerRank;

import java.lang.reflect.Method;
import java.util.*;
class Printer{
    public <E> void printArray(E []s){
        for(E i:s){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       Printer p=new Printer();
       int count=0;
        String []s=new String[]{"Delhi","Mumbai","Nagpur"};
        Integer []a={1,2,3,4,5,6,7};
        p.printArray(s);
        p.printArray(a);
        for(Method method:Printer.class.getDeclaredMethods()){
            if(method.getName()=="printArray"){
                count++;

            }
            if(count>1)
            System.out.println("Method Overloading is not allowed");

        }


    } 
}