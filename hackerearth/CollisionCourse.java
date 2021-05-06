package hackerearth;

import java.util.Scanner;

public class CollisionCourse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int c=sc.nextInt();
        double arr[]=new double[c];
        for(int i=0;i<c;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int s=sc.nextInt();
            double dis=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
            double time=dis/s;
            arr[i]=time;


        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j])
                    count++;

                }
            }
        }
        System.out.println(count/2);
    }
}