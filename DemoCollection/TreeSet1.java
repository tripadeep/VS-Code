package DemoCollection;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;
class Book{
    private String title;
    private double price;
    public Book(String title, double price){
        this.title=title;
        this.price=price;
    }
    public String getTilte(){
        return title;
    }
    public double getPrice(){
        return price;
    }
}
class MyComparator implements Comparator{
    @Override
public int compare(Object o1,Object o2){
Book book1=(Book)o1;
Book book2=(Book) o2;
if(book1.getPrice()<book2.getPrice() )
return -1;
else return 1;

}
}
public class TreeSet1 {
    public static void main(String[] args) {
        Book b1,b2,b3;
        b1=new Book("PHP",300);
        b2=new Book("java",556.0);
        b3=new Book("C",897);
        MyComparator obj=new MyComparator();
        TreeSet t=new TreeSet(obj); 
        
        t.add(b1);
        t.add(b2);
        t.add(b3);
        Iterator itr=t.iterator();
        while(itr.hasNext()){
            Book b=(Book)itr.next();
            System.out.println(b.getTilte() +" "+b.getPrice());
        }
    } 
}
