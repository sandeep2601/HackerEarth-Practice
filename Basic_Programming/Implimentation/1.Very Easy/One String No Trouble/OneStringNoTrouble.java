/*			One String No Trouble

A string s is called a good string if and only if two consecutive letters are not the same. For example, 
abcab and cda are good while abaa and accba are not.

You are given a string s. Among all the good substrings of s, print the size of the longest one.

Input format
A single line that contains a string s(1 <= |s| <= 2*10^5).

Output format
Print an integer that denotes the size of the longest good substring of s.

SAMPLE INPUT 
ab

SAMPLE OUTPUT 
2

Explanation
The complete string is good so the answer is 2.

Time Limit:	1.0 sec(s) for each input file.
*/




// Total Time Taken : 5.42497  for 50 Test Cases.
import java.io.BufferedReader;
import java.io.InputStreamReader;

class OneStringNoTrouble{
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int max = 0, ctr = 0;
        int len = arr.length;
        for(int i = 0; i < len-1; i++){
            if(arr[i] != arr[i+1]){
                ctr++;
            }
            else{
                if(ctr > max)
                    max = ctr;
                ctr = 0;
            }
        }
        if(ctr > max)
            max = ctr;
        System.out.println(max+1);
    }
}