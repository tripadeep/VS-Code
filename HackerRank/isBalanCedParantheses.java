package HackerRank;
import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayDeque;
//import java.util.Stack;
public class isBalanCedParantheses {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str=bf.readLine();
        boolean balanced=false;
        ArrayDeque<Character>stack=new ArrayDeque<>();
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                stack.push(ch);

                //continue;
            }
           
            char check;
            switch(ch){
                case '}':
                check= stack.pop();
                if(check=='{'){
                   
                    balanced=true;
                } else return;break;
                case ']':
                check= stack.pop();
                if(check=='['){
                   
                    balanced=true;

                } else return;break;
                case ')':
                check= stack.pop();
                if(check=='('){
                   
                    balanced=true;
                }else return; break;

            }
           
            i++;    
            
        }
        if(balanced)

        System.out.print("balanced");
        else System.out.print("not balanced");

    }
    
}
