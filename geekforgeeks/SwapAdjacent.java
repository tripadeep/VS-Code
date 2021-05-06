package geekforgeeks;

public class SwapAdjacent {
    public static void main(String[] args) {
        String str="Deeptanshu";
       System.out.println(swap(str));
     


    }
    
    private static String toString(char[] ch){
        String obj=new String(ch);
        return obj;

    }
private static String swap(String s){
    if(s.length()%2==0)
    {
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
            i++;
        }
        //String temp=ch.toString();
       return toString(ch);
    }
    return null;
}
    
}
