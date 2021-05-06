package hackerearth;
import java.util.*;


public class Reverse32bitBInary {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> li=new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
           
        }
        for (Integer t : list) {
            int i = t.intValue();
            String temp=Integer.toBinaryString(i);
            int res=reverseBits(i);
            li.add(res);
        }
       
        for (Integer object : li) {
            System.out.print(object+",");
        }
        sc.close();
    }
   public static int reverseBits(int num)
{
    int reverse = 0;

    for (int i = 0 ; i < 32 ; i++, num >>= 1)
    {
        reverse <<= 1;
        if (num % 2 == 1) reverse += 1;
    }
    return reverse;

}

    
}