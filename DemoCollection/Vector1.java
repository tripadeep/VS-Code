package DemoCollection;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
 public static void main(String[] args) {
    Vector<String> vec=new Vector<>();
    vec.addElement("one");
    vec.addElement("two");
    vec.addElement("three");
    System.out.println(vec);
    Enumeration< String> e=vec.elements();
    while(e.hasMoreElements()){
        String s=(String)e.nextElement();
        System.out.println(s +" "+s.length());
    }
    }
    
    
}
