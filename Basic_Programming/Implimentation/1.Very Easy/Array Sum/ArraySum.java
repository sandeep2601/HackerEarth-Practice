/*			Array Sum

You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

Input Format
The first line of the input consists of an integer . The next line contains space-separated integers contained in the array.

Output Format
Print a single value equal to the sum of the elements in the array.

Constraints
1<=N<=10 
0<=a[i]<=10^10

SAMPLE INPUT 
5
1000000001 1000000002 1000000003 1000000004 1000000005

SAMPLE OUTPUT 
5000000015

Time Limit:	1.0 sec(s) for all input files combined.
*/



// Total Time Taken : 0.32937s for 3 Test Cases.
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ArraySum{
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        long sum = 0L;
        for(byte i = 0; i < N; i++){
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}