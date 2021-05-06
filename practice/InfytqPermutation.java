package practice;

public class InfytqPermutation {
    public static void main(String[] args) {
        String str="1,2,1,4";
      String newstr=  str.replaceAll(",","");
	char[] arr=new char[str.length()];
    arr= newstr.toCharArray();
    int []num=new int[arr.length];
    for(int i=0;i<num.length;i++){
        num[i]=arr[i]-'0';

    }
    for (int i=0; i<arr.length;i++) {
        System.out.println(num[i]);
    
    
    }
	
}
}