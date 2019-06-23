/*Palindromic String

You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints 
1<=|S|<=100


Note
String S consists of lowercase English Alphabets only.

SAMPLE INPUT 
aba
SAMPLE OUTPUT 
YES

*/

import java.util.*;

class Palin {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        name=name.toLowerCase();
        int len=name.length();
        int count=0;
        for(int i=0,j=len-1;i<=j;i++,j--){
            if(name.charAt(i)!=name.charAt(j)){
                System.out.print("NO");
                count=1;
                break;
            }
        }
        if(count==0)
            System.out.println("YES");
    }
}