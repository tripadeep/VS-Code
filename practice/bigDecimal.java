
package practice;
import java.util.*;
class bigDecimal{
    public static void main(final String[] args) {
        // Input
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final String[] s = new String[n + 2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s);
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}