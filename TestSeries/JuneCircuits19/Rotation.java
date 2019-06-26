/*			Rotation

You are given two strings S and T of the same length N. Your task is to convert the string S into T by doing some operations. In an operation, you can delete the first character of the string S and append any character at the end of the string. You are required to determine the minimum number of operations to convert S into T.

Input format :
First line: Single integer N denoting the length of the strings
Second line: String S
Third line: String T

Output format :
Print a single integer that represents the answer to the question.

Constraints
1<=N<=10^3

Both strings consist of only lowercase alphabets.

SAMPLE INPUT 
7
aaxaabc
aabcaax

SAMPLE OUTPUT 
3

Explanation
After the 1st operation S = axaabca
After the 2nd operation S = xaabcaa
After the 3rd operation S = aabcaax
After 3rd operation S and T becomes same.

Time Limit:	1.0 sec(s) for each input file.
*/




//Total Time Taken : 2.8474s for 26 TestCases
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Rotation{
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1 = br.readLine().trim();
        String str2 = br.readLine().trim();
        if(str1.equals(str2)){
            System.out.println("0");
            System.exit(0);
        }
        else{
            for(int i = N-1; i >= 0 ; i--){
                if(str1.regionMatches(N-i-1,str2,0,i+1)){
                    System.out.println(N-1-i);
                    break;
                }
            }
        }
    }
}