package hackerearth;

// JAVA Code For Find minimum cost to 
// buy all books 
import java.util.*; 

class BoxInsideBox { 
	
	static int minimumBox(int []arr, int n) 
    { 
          
        // New Queue of integers. 
        Queue<Integer> q = new LinkedList<>(); 
      
        // sorting the array 
        Arrays.sort(arr); 
      
        q.add(arr[0]); 
          
        // traversing the array 
        for (int i = 1; i < n; i++) 
        { 
            int now = q.element(); 
      
            // checking if current element 
            // is greater than or equal to 
            // twice of front element 
            if (arr[i] >= 2 * now) 
            q.remove(); 
      
            // Pushing each element of array 
            q.add(arr[i]); 
        } 
      
        return q.size(); 
    }  
      
	
	/* Driver program to test above function */
	public static void main(String[] args) 
	{ 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ratings[]=new int[n];
        for(int i=0;i<n;i++){
            ratings[i]=sc.nextInt();

        }
		
		
		System.out.print(minimumBox(ratings, n)); 
		
	} 
} 
	
// This code is contributed by Arnav Kr. Mandal. 
