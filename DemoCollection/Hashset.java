package DemoCollection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
    hs.add("one");
    hs.add("twoo");
    hs.add("three");
    hs.add(null);
    boolean b=hs.add("one");
    //System.out.println(hs);// insertion order is not preserved.
    //System.out.println(b);//repeated value is not allowed 
    Iterator itr=hs.iterator(); 
    while(itr.hasNext()){
       System.out.println(itr.next());
          }
    }
    

} 