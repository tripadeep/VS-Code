package HackerRank;
import java.util.List;
// class Game{
//     private static int highestscore;
//     private static String beastplayer;
//     private String playerName;
//     private int score;
//     public Game(String playerName,int score){
//         this.playerName=playerName;
//         this.score=score;

//     }
//     public void checkHighestScore(){
//         if(this.score>Game.highestscore){
//             Game.highestscore=this.score;
//             Game.beastplayer=this.playerName;
//         }
//     }
//         public static void displayHighestScore(){
//             System.out.println(Game.beastplayer);
//             System.out.println(Game.highestscore);
//         }
//     }

// public class Demo1 {
//     public static void main(String[] args) {
//         // Game g1=new Game("Shawn",600);
//         // Game g2=new Game("Razor",500);
//         // Game.displayHighestScore();
//         // g2.checkHighestScore();
//         // Game.displayHighestScore();
//     }
    
// }
import java.util.*;
public class Demo1
{
 public static void expand(String str, int low, int high, Set <String> set)
 {
  while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high))
  {
   set.add(str.substring(low,high+1));
   low--;
   high++;
  }
 }
 public static void allPalindromicSubstrings(String str)
 {
  Set<String> set= new HashSet<>();
  for(int i=0;i<str.length();i++)
  {
   expand(str,i,i,set);
   expand(str,i,i+1, set);
  }
  System.out.println(set);
 }
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the string");
  String str=in.nextLine();
  System.out.println("All the palindromic Substrings are: ");
  allPalindromicSubstrings(str);
  in.close();
  String [] arr=new String[]{"deep","deeptanshu"};
  List<String> count=Arrays.asList(arr);
  count.add("deep");
for (String string : count) {
    System.out.println(string);
    Arrays.sort()

 }
}