package hackerearth;

import java.util.*;

class Zoo {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int price[]=new int[3];
		int land[]=new int[3];
		int a1[]=new int[2];
		int a2[]=new int[2];
		int a3[]=new int[2];
		int totalLand=0;
		for (int i=0;i<3 ;i++ ){
		    price[i]=sc.nextInt();
        } 
		for (int i=0;i<3 ;i++ ){
		    land[i]=sc.nextInt();
		} 
		for (int i=0;i<2 ;i++ ){
		    a1[i]=sc.nextInt();
		}
		for (int i=0;i<2 ;i++ ){
		    a2[i]=sc.nextInt();
		} 
		for (int i=0;i<2 ;i++ ){
		    a3[i]=sc.nextInt();
        } 
        totalLand=sc.nextInt();
		int totalprice=0; //10000 1000 1500 //
		int max=price[0];
		int index=0;
		for(int i=0;i<3;i++)
		{
		    if (max < price[i]) 
			{
				max = price[i];
				index = i;
			}
		}
		System.out.println(max+" "+index);
		int a=0,b=0,c=0;
		    if(index==0){
		         a+=a1[0]*a1[1];
		        if(price[1]>price[2]){
		         c+=land[2];
		         b+=totalLand-(a+c);
		            totalprice+=(a*price[0])+(b*price[1])+(c*price[2]);
		            System.out.println(a+" "+b+" "+c);
		        }
		        else{
		            b+=land[1];
		            c+=totalLand-(a+b);
		            totalprice+=(a*price[0])+(b*price[1])+(c*price[2]);
		            System.out.println(a+" "+b+" "+c);
		        }
		        
		        
		    }
		    if(index==1){
		        b+=a2[0]*a2[1];
		        if(price[0]>price[2]){
		         c+=land[2];
		         a+=totalLand-(b+c);
		            totalprice+=(a*price[0])+(b*price[1])+(c*price[2]);
		            System.out.println(a+" "+b+" "+c);
		        }
		        else{
		            a+=land[1];
		            c+=totalLand-(a+b);
		            totalprice+=(a*price[0])+(b*price[1])+(c*price[2]);
		            System.out.println(a+" "+b+" "+c);
		            
		        }
		    }
		    if(index==2){
		        c+=a3[0]*a3[1];
		        if(price[0]>price[1]){
		         b+=land[1];
		         a+=totalLand-(b+c);
		            totalprice+=(a*price[0])+(b*price[1])+(c*price[2]);
		            System.out.println(a+" "+b+" "+c);
		        }
		        else{
		            a+=land[1];
		            b+=totalLand-(a+c);
		            totalprice+=(a*price[0])+(b*price[1])+(c*price[2]);
		            System.out.println(a+" "+b+" "+c);
		            
		        }
		    }
		System.out.println(totalprice);
	}
}