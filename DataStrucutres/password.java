package DataStrucutres;

import java.util.Scanner;

public class password {
    private static String search(char s1,String str2,int i){
        char[] ch=new char[str2.length()];
        if(str2.charAt(i)!=s1) {        // c d a b
            for(int x=i+1;x<str2.length();x++){
                if(str2.charAt(x)==s1){
                     ch=str2.toCharArray();
                    char temp=ch[x];
                    ch[x]=ch[i];
                    ch[i]=temp;
                    break;
                }                       
            }
           str2=ch.toString();
            return str2;

        }           
       else

        return str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        var str2 = sc.next();
        if (str2.length() == str1.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if ((i + j) % 2 == 0) {
                        // String s=str1[i];
                        str2 = search(str1.charAt(i), str2, i);
                        break;

                    }

                }


            }
            System.out.println(str2);
        }
    }
    
}