package hackerearth;

import java.util.*;
class FactorOf3{
    private static final String[] tensNames = {
        "",
        " ten",
        " twenty",
        " thirty",
        " forty",
        " fifty",
        " sixty",
        " seventy",
        " eighty",
        " ninety"
      };
    
      private static final String[] numNames = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
      };
	public static void main(String []args){
        
          int pair=0;
      
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
		// Scanner sc = new Scanner(System.in);
		// int t=sc.nextInt();
		// for(int i=1;i<=t;i++){
		// 	int n=sc.nextInt();
		// 	int arr[]=new int[n];
		// 	for(int j=0;j<n;j++){
		// 		arr[j]=sc.nextInt();
		// 	}
		// 	ArrayList<Integer>l=new ArrayList<Integer>(); //1 2 3 3
		// 	l.add(arr[0]);
			
		// 	for(int x=0;x<l.size();x++){
		// 	for(int k=1;k<n;k++){
		// 		if((l.get(x)+arr[k])%3!=0 && !l.contains(arr[k]))
		// 			l.add(arr[k]);

		// 	}}
		// 	System.out.println(l);
        // }
        
	}
}