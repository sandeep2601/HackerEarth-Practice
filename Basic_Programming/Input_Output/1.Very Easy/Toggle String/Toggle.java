/*Toggle String

You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.

Constraints
1<=|S|<=100 where S denotes the length of string S.

SAMPLE INPUT 
abcdE
SAMPLE OUTPUT 
ABCDe

*/

import java.util.Scanner;
import java.lang.Character;
 
class Toggle {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
		char ch[]=s.toCharArray();
        for(int i=0;i<len;i++){
            if(Character.isUpperCase(ch[i]))
                ch[i]+=32;
            else
                ch[i]-=32;
			System.out.print(ch[i]);
        }
    }
}