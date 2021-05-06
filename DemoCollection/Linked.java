package DemoCollection;
import java.util.*;
public class Linked {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add(0,"Rampur");
        list.addFirst("Deeptanshu");
        
        list.addLast("Tripathi");
        list.add(list.size()-1,"Naikin");
       // list.remove("Rampur");
        // System.out.println(list.getFirst());
        // System.out.println(list.getLast());
       System.out.println(list);
       System.out.println(list.element());
      Iterator itr=list.descendingIterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
      
          
      }
    } 
 