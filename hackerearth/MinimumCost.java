package hackerearth;
import java.util.*;
public class MinimumCost {
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             int test=sc.nextInt();
             while(test-->0){
                 int N=sc.nextInt();
                 int M=sc.nextInt();
                 int res=minimum(N,M);
                 System.out.println(res);
             }
    }
    public static int minimum(int N,int M){
        ArrayList<Integer> N_List=new ArrayList<Integer>();
        ArrayList<Integer> div_List=new ArrayList<Integer>();
        Integer sum=0;
        if(N%2!=0&& M%2!=0)
        return -1;
        while(N!=M){
            
            for(int i=N/2;i>1;i--){
                if(i%2==0 && N%i==0 ){
                    N_List.add(N);
                    div_List.add(i);
                    N+=i;
                    break;
                }
                else continue;
            }
        }
        for(int i=0;i<N_List.size();i++){
            Integer temp= N_List.get(i)/div_List.get(i);
           sum+=temp;
        }
        
        return sum;
    }
}