package DemoCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String args[]){
        HashSet hs=new HashSet();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("one");//again duplicate is not allowded in linkedhash set also.
        LinkedHashSet lk=new LinkedHashSet(hs);
        System.out.println(lk);


    }
    
}