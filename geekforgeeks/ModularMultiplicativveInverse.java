/** 
 * multiplicative inverse approcaach
 * a*v=1(mod m)
 * where 0<=v<m
 */
package geekforgeeks;
import java.util.*;
class ModularMultiplicativeInverse{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	int test=sc.nextInt();
    while(test-->0){

        int a=sc.nextInt();
        int m=sc.nextInt();
        int res=gcd(a,m);
        if(res==1)
        moduler(a,m);
        else
        System.out.println(-1);
    
        
        
    }
    
}

private static void moduler(int a, int m) {
    for(int i=0;i<m;i++){
        if((a*i)%m==1){
            System.out.println(i);
            break;
        }
    }
}

private static int gcd(int a, int m) {
    int mod=0;
    while(true){
        mod=a%m;
        if(mod==0)        
        return m;
        else{
            a=m;
            m=mod;            
        }
    }
  
}
}