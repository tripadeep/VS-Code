package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CountLargestCyclemaze {
    public static int solution(int arr[])
    {
        ArrayList<Integer> sum = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++)
        {
            ArrayList<Integer> path = new ArrayList<>();    
            int j = i;
            int tempSum = 0;
            while(arr[j]<arr.length && arr[j]!=i && arr[j]!=-1 && !path.contains(j))
            {   
                path.add(j);
                tempSum+=j;
                j=arr[j];
                if(arr[j]==i)
                {
                    tempSum+=j;
                    break;
                }
            }
            if(j<arr.length && i == arr[j])
                sum.add(tempSum);
        }
            if(sum.isEmpty())
                return -1;
            return Collections.max(sum);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int testcase=sc.nextInt();
        int size = sc.nextInt();
        int []cell=new int[size];
        for(int i=0;i<size;i++){
            cell[i]=sc.nextInt();
        }
        int largestCycle = solution(cell);
        System.out.println("Largest cycle Length " +largestCycle);  
    }
}
