package practice;
import java.util.*;
  class perfectSquare {
     static boolean isPerfectSquare(int num){
         int sq=(int)Math.sqrt(num);
         if(sq*sq == num) return true;
         return false;
     }
    public static void main(String args[]) {
      
      Scanner sc  = new Scanner(System.in);
      System.out.println("enter testcase");
      int testCase=sc.nextInt();
      int n=0;
         
        
        for(int i=1;i<=testCase;i++){
            System.out.println("enter array");
             n=sc.nextInt(); 
             int prefixSum[] = new int[n + 1];
        int count = 0;
        int running_total = 0;
            for (int index = 1; index <= n; index++) {
                int element = sc.nextInt();
                running_total += element;
                prefixSum[index] = running_total;
            }
            for (int prev = 0; prev < n; prev++) {
                for (int index = prev+1; index <= n; index++) {
                   if (isPerfectSquare(prefixSum[index] - prefixSum[prev])) {
                       count++;
                  }
              }
            }
          System.out.println("Case #"+i+": "+count);

        }
        
      
      
      
    }
}