package hackerearth;

import java.util.Scanner;

public class StringPair {
    private static final String[] tensNames = {
        "",
        "ten",
        "twenty",
        "thirty",
        "forty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety"
      };
    
      private static final String[] numNames = {
        "",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen"
      };
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        String str[]=new String[n];
        int total[]=new int[n];
        int D=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++) {
            String soFar;
            
            if(arr[i]==100)
            str[i]="hundred";
            else if (arr[i] == 0)
            str[i]="zero";
           else if (arr[i] % 100 < 20){
                soFar = numNames[arr[i] % 100];
                str[i]=soFar;
            }   
           
            else {
            soFar = numNames[arr[i] % 10];
            arr[i] /= 10;

            soFar = tensNames[arr[i] % 10]+soFar;
            str[i]=soFar;
            }

            
        }
        
        
        for (int i=0;i<str.length;i++) {
            String word=str[i];
            int count=0;

            for (int k=0 ; k<word.length(); k++){
                char ch = word.charAt(k);
                    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                        count ++;
                    }
                    
            }
            total[i]=count;
            D+=total[i];
        }
        int pair=0;
      for(int i=0;i<arr.length-1;i++){
           int sum=arr[i]+arr[++i];
           if(sum==D)//1 2 3 4 5
                    //0  1 2 3 4
           pair++;
        }
       if(arr[n-2]+arr[n-1]==D)
       pair++;
        //System.out.print(pair);
        String soFar;
        if (pair == 0)
         System.out.println("zero");

        if (pair % 100 < 20){
            soFar = numNames[pair % 100];
            System.out.println(soFar);
        }
        else if(pair>100)
        System.out.print("greater 100");
        else {
            soFar = numNames[pair % 10];
            pair /= 10;

            soFar = tensNames[pair % 10] + soFar;
            System.out.println(soFar);
        }
        
    
   
  
        
    }
    
}