package practice;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class PalindromeString {
    public static void main(String args[]){
        /*String str="abba";
        char[] ch=str.toCharArray();
        StringBuilder temp=new StringBuilder();
        for(int i=ch.length-1;i>=0;i--)
        temp.append(ch[i]);
       //  temp.reverse();
        if(str.equals(temp.toString()))
        System.out.print("palindrome");*/
        Calendar ins= Calendar.getInstance();
        Calendar date=new GregorianCalendar(2021,1,30);
        

        //ins.set(year, month, date, hourOfDay, minute);
        //ins.set(2021, , 30);
        int day=date.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);

         

      

    }
    
}
