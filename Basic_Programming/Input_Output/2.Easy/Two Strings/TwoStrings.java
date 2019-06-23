/*				Two Strings

Given two strings of equal length, you have to tell whether they both strings are identical.

Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.

Input :
First line, contains an intger 'T' denoting no. of test cases.
Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.

Output:
For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.

Constraints:
1<= T <=100
1<= |S1| = |S2| <= 10^5
String is made up of lower case letters only.
Note : Use Hashing Concept Only . Try to do it in O(string length) .

SAMPLE INPUT 
3
sumit mitsu
ambuj jumba
abhi hibb

SAMPLE OUTPUT 
YES
YES
NO

Explanation :
For first test case,

mitsu can be rearranged to form sumit .

For second test case,

jumba can be rearranged to form ambuj .

For third test case,

hibb can not be arranged to form abhi.

Time Limit:	1.0 sec(s) for each input file.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class TwoStrings {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        while(cases>0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            char c1[] = st.nextToken().toCharArray();
            char c2[] = st.nextToken().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.hashCode(c1) == Arrays.hashCode(c2))
				System.out.println("YES");
			else
				System.out.println("NO");
       
			cases--;
        }
    }
}