package practice;
import java.math.*;
public class bigInteger {
    public static void main(String[] args) {
        String input1="1234567891011";
        String input2="5555646231232";
        BigInteger bg=new BigInteger(input1);
        BigInteger b=new BigInteger(input2);
        BigInteger sum=bg.add(b);
        BigInteger prod=bg.multiply(b);
        System.out.println(sum+"\n"+prod);



    }
    
}