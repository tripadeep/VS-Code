package hackerearth;

import java.util.Scanner;

class Swayamwar{
   static  int findPairs (int bitarr[], int N)	{
        int pairarr[]=new int[N],
        i, pairs = 0, msb; 
        for(i=0; i<N; i=i+2)	{
            msb = bitarr[i] / 10;
            for(int j =i+2; j<N; j=j+2){
                if(msb == bitarr[j]/10){
                    if(pairarr[msb] < 2)	{
                        pairarr[msb]++;
                    }
                }
            }
            
        }
        
        for(i=1; i<N; i=i+2)	{
            msb = bitarr[i] / 10;
            for(int j =i+2; j<N; j=j+2){
                if(msb == bitarr
                [j]/10){
                    if(pairarr[msb] < 2)	{
                        pairarr[msb]++;
                    }
                }
            }
        }
    
        for(i=0; i<N; i++)	{
            pairs = pairs + pairarr[i];
        }
    
        return pairs;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pair=0;
        int size=sc.nextInt();
        int arr[]=new int[size];
        int bitArr[]=new int[size];
        for(int i=0;i<size;i++){
           arr[i] =sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int temp=arr[i];
            int max=0,min=9,mod=0,count=3;
            while(count>0){
                mod =temp%10;
           temp/=10;
           if(mod>max)
           max=mod;
           if(mod<min)
           min=mod;
           count--;
            }           
           int bitSum=max*11+min*7;
           
            String tempBitSum=Integer.toString(bitSum);
           
            if(tempBitSum.length()==3)
            tempBitSum=tempBitSum.substring(1, tempBitSum.length());
            bitSum=Integer.parseInt(tempBitSum);
            bitArr[i]=bitSum;




        }
        int pairs=findPairs(bitArr, size);
        System.out.println(pairs);
    
     sc.close();   
    }

}
//     int pairarr[]=new int[size];
    //    for (int  i =0;i<size;i++) {
    //       pairarr[i]= bitArr[i]/10;

    //    }
    //    for (int i=0;i<size;i++) {
    //        for(int j=i+1;j<size;j++){
    //            if(bitArr[i]==bitArr[j])
    //            {
    //                if((i%2==0&&j%2==0)||(i%2==0&&j%2==0))
    //                pair++;
    //            }                          
    //        }
    //    }
    //     String []str=new String[size];
        
    //     for(int i=0;i<size;i++){
    //         String temp=Integer.toString(bitArr[i]);
    //         str[i]=sc.next(temp);
    //     }
    //     // for(int i=0;i<size;i++){
    //     //     int tempPair=0;
    //     //     for(int j=0;j<size;j++){
    //     //         if((i%2==0&&j%2==0)||(i%2==0&&j%2==0)){
    //     //             if(str[i].substring(0)==str[j].substring(0))
    //     //             tempPair++;

    //     //         }
    //     //     }
    //     //     pair=tempPair;
    //     // }
    //     // System.out.println(pair);
    //     for (String string : str) {
    //         System.out.println(string);
    //     }
        