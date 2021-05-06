package DemoCollection;
import java.util.*;


public class ListIteratr {
    public static void main(String[] args){
        try{
            LinkedList<String> list=new LinkedList<>();
            list.addFirst("one");
            list.addFirst("two");
            list.addFirst("three");
            //list.add(5,"five");
            list.addLast("ten");
            
            System.out.println(list);
            ListIterator<String> listItr=list.listIterator();
            while(listItr.hasNext()){
                String s=(String)listItr.next();
                if(s.equals("two"))
                listItr.set("two 2");
                else if(s.equals("one"))
                listItr.add("six");
                else if(s.equals("three"))
                listItr.remove();
    
            }
            System.out.println(list);
            ListIterator itr=list.listIterator();
            while(itr.hasPrevious()){
                System.out.println(itr.hasPrevious());
            }


        }
        catch(Exception e){
        e.printStackTrace();
            System.out.println(e+"Exception caught");
        }
       

    }
}
