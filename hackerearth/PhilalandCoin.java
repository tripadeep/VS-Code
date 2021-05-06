package hackerearth;
//This is The Coding Area
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
class PhilalandCoin
{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
      ArrayList<Integer> l1=new ArrayList<Integer>();
  
    int n=sc.nextInt();
  	int count=0;
    for(int i=0;i<n;i++){
    	int maxNum=sc.nextInt();
    	while(maxNum>=1){
        maxNum=maxNum/2;
          //int temp=count++;
        l1.add(maxNum);
        }
      Iterator itr=l1.iterator();
      while(itr.hasNext()){
     System.out.println(itr.next()); 
      }
        
    }
   int arr[]={1,2,3,4,5};
   String str[]=new Arrays.toString(arr);
   }
}