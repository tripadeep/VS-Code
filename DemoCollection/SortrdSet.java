package DemoCollection;

import java.util.TreeSet;

public class SortrdSet {
 public  static void main(String []args){
     TreeSet t=new TreeSet();
     t.add("e");
     t.add("a");
     t.add("c");
     t.add("b");
    // t.add(null); cannot store null values NullPointer Exception.
     System.out.println(t);
     System.out.println(t.higher("e"));//null
     System.out.println(t.ceiling("e"));// e
     System.out.println(t.first());//a
     System.out.println(t.floor("c"));// c
     System.out.println(t.lower("c"));//b
     System.out.println(t.pollFirst()+"\n"+t);

 }
}
