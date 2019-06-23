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
import java.io.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
 
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
      original = in.nextLine();
 
 
      int length = original.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         System.out.println("YES");
      else
         System.out.println("NO");
 
    }
}