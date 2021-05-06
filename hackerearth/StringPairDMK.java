package hackerearth;
import java.util.*;

class StringpairDMK{
    static String numToword(int n){
        if(n==0)return "zero";
        if(n==100)return "hundred";
        if(n>0 && n<10){
            String s=getOne(n);
            return s;
        }
        if(n>9 && n<20){
            String s1=tens(n);
            return s1;
        }
        if(n>19 && n<100){
            String s2=getTens(n);
            return s2;
        }
        return "greater 100";
        
    }
    static String getOne(int num){
        switch(num){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            //case 0: return "";
            //default : return "";
        } 
        return "xyz";       
    }
     static String getTens(int num){
        int k=num%10;
        String d="";
        if(k!=0)
         d=getOne(k);
        num = num/10;
        switch(num){
            case 2: return "twenty"+d;
            case 3: return "thirty"+d;
            case 4:return "forty"+d;
            case 5: return "fifty"+d;
            case 6: return "sixty"+d;
            case 7: return "seventy"+d;
            case 8: return "eighty"+d;
            case 9: return "ninety"+d;
            default: return "";
        }        
    }
    static String tens(int num){
        switch(num){
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }        
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int D=0;
        int pair=0;
        int total[]=new int[n];
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++){
       String Word=numToword(arr[i]);
            int count=0;
            for(int k=0 ; k<Word.length(); k++){
                char ch = Word.charAt(k);
                    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                        count++;
                    }     
            }
            total[i]=count;
            //System.out.println(count);
            D+=total[i];

        }
        //System.out.println(D);
       for(int x=0;x<arr.length;x++){
           if(x!=arr.length){
            for(int j=x+1;j<arr.length;j++){
                int sum= arr[x]+arr[j];
                if(sum==D)//1 2 3 4 5
             pair++; 
            }
           }
           
        }
        System.out.println(numToword(pair));

    }       
}