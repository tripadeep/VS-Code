import java.util.*;
public class Demo {
    public static void main(String[] args) {
        /*int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int numI=scan.nextInt();
        double numD=scan.nextDouble();
        scan.nextLine();
        String str=scan.nextLine();
        System.out.println(i+numI);
        System.out.println(d+numD);
        System.out.println(s.concat(str));
        scan.close();*/
        int[] nums={6,-1,-2,-3,0,1,2,3,4};
Arrays.sort(nums);
System.out.println("Minimum = " + nums[0]);
System.out.println("Maximum = " + nums[nums.length-1]);
    }
    
}