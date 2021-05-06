package DemoCollection;

import java.util.*;
import java.util.PriorityQueue;

public class Queue <E>{
    public static void main(String... args) {
        System.out.println("fghjbklhvhbjhkvhbjkvhbjkl");PriorityQueue pq=new PriorityQueue();
        pq.add("a");
        //pq.offer("a");
        pq.offer("b");
        pq.offer("d");
        pq.offer("c");
//System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.print(pq.poll());
       

           
    }
    
}
