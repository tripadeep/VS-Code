package DemoCollection;

import java.util.ArrayList;
import java.util.Collections;

class permutationNumber
{ 

	// Function to count the total number 
	// of digits in a number. 
	static int countdigits(int N) 
	{ 
		int count = 0; 
		while (N>0) { 
			count++; 
			N = N / 10; 
		} 
		return count; 
	} 

	// Function to generate all cyclic 
	// permutations of a number 
	static int cyclic(int N) 
	{ 
        ArrayList<Integer> l1=new ArrayList<>();
		int num = N; 
        int n = countdigits(N);
         int count=0; 

		while (true) { 
            //System.out.println(num); 
            l1.add(num);
            
            count++;
			// Following three lines generates a 
			// circular pirmutation of a number. 
			int rem = num % 10; 
			int dev = num / 10; 
			num = (int)((Math.pow(10, n - 1)) * 
								rem + dev); 

			// If all the permutations are 
			// checked and we obtain original 
			// number exit from loop. 
			if (num == N) 
				break; 
        }
        for (Integer integer : l1) {
            System.out.println(integer);
        }
        
        System.out.println(Collections.max(l1));
        return count;
        
	} 

	// Driver Program 
	public static void main (String[] args) { 
    int N = 1214; 
    int count=	cyclic(N); 
	System.out.println(","+count);
	

	} 
} 


