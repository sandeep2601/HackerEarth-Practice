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
import java.lang.StringBuilder;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
	        String s,s1,sx;
	        char[] temp=new char[100];
	        s=sc.nextLine();
	        int x=s.length();
	        for(int i=0;i<x;i++){
	            char c = s.charAt(i);
	            s1=Character.toString(c);
	        	if(Character.isLowerCase(c)){
	        		sx=s1.toUpperCase();
	        		temp[i]=sx.charAt(0);
	        	 }
	        	else if(Character.isUpperCase(c)){
	        		
	        		 sx=s1.toLowerCase();
	        		temp[i]=sx.charAt(0);
	        	}
	        	else{
	        		temp[i]=c;
	        	}
	        }
	        String s2= new String(temp);
	        s2=s2.substring(0,x);
	        System.out.println(s2);
    }
}