/* 

RESULT:  Accepted
Score

20.0

 
Time (sec)

1.22304

 
Memory (KiB)

64

 
Language

Java 8
---------- Ali and Helping innocent people

Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format

The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format

Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)

SAMPLE INPUT 
12X345-67

SAMPLE OUTPUT 
invalid

Explanation
The tag is invalid because the sum of first and second digit of it is odd (also the sum of 4'th and 5'th, 5'th and 6'th and 8'th and 9'th are odd).

Time Limit:	1.0 sec(s) for each input file.


*/



import java.util.*;
class Test {
    public String Calc(String str){
        int len = str.length();
        int n1 = Integer.parseInt(str.substring(0,1));
        int n2 = Integer.parseInt(str.substring(1,2));
        if((n1+n2)%2 != 0) {
            return "invalid";
        }
        String vow = str.substring(2,3);
        if(vow.equals("A") || vow.equals("E") || vow.equals("I") || vow.equals("O") || vow.equals("U") || vow.equals("Y")) {
            return "invalid";
        }
        int n3 = Integer.parseInt(str.substring(3,4));
        int n4 = Integer.parseInt(str.substring(4,5));
        int n5 = Integer.parseInt(str.substring(5,6));
        if((n3+n4)%2 != 0 || (n4+n5)%2 != 0) {
            return "invalid";
        }
        int n6 = Integer.parseInt(str.substring(7,8));
        int n7 = Integer.parseInt(str.substring(8,9));
        if((n6+n7)%2 != 0) {
            return "invalid";
        }
        return "valid";
    }
}
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String res = new Test().Calc(str);
        System.out.println(res);
    }
}