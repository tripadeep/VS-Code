package DemoCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=10;i++){
            arr.add(i);
        }
        System.out.println(arr);
        Iterator itr= arr.iterator();
        while(itr.hasNext()){
            Integer i=(Integer)itr.next();
            if(i>7&&i<9)
            itr.remove();
            System.out.println(i);
        }
System.out.println(arr);

    }
    
}
