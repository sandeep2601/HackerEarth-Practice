/*				Best Index

You are given an array A of N elements. Now you need to choose the best index of this array A. An index 
of the array is called best if the special sum of this index is maximum across the special sum of all 
the other indices.

To calculate the special sum for any index i, you pick the first element that is A[i] and add it to 
your sum. Now you pick next two elements i.e. A[i+1] and A[i+2] and add both of them to your sum. 
Now you will pick the next 3 elements and this continues till the index for which it is possible to 
pick the elements. For example:

If our array contains 10 elements and you choose index to be 3 then your special sum is denoted by -
(A[3]) + (A[4] + A[5]) + (A[6] + A[7] + A[9]), beyond this its not possible to add further elements
as the index value will cross the value 10.

Find the best index and in the output print its corresponding special sum. Note that there may be more
than one best indices but you need to only print the maximum special sum.

Input
First line contains an integer N as input. Next line contains N space separated integers denoting the 
elements of the array A.

Output
In the output you have to print an integer that denotes the maximum special sum

Constraints
1 <= N <= 10^5
-10^7 <= A[i] <= 10^7

Sample Inputs

Input								Output
5
1 3 1 2 5							8

10
2 1 3 9 2 4 -10 -9 1 3				9
 
6
-3 2 3 -4 3 1						3


Explanation for input 3 : -3 2 3 -4 3 1
Let us calculate the special value for each index :

For index 1: (A[1]) + (A[2] + A[3]) + (A[4] + A[5] + A[6]) = 2
For index 2: (A[2]) + (A[3] + A[4]) = 1
For index 3: (A[3]) + (A[4] + A[5]) = 2
For index 4: (A[4]) + (A[5] + A[6]) = 0
For index 5: (A[5]) = 3
For index 6: (A[6]) = 1
So the maximum value among all the special values is 3 hence it is the output.

Time Limit:	1.0 sec(s) for each input file.
*/



// TLE on 8 out of 12 cases
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BestIndex {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().trim().split(" ");
        int max=Integer.MIN_VALUE;
       
        for(int i=0;i<N;i++){
            int ctr=0;
            int sum=0;
            for(int j=1;j<=(N-i-ctr);j++){
                ctr=ctr+j;
            }
            
            for(int j=i;j<=i+ctr-1;j++)
                try{
                    sum+=Integer.parseInt(str[j]);
                }catch(NumberFormatException e){}
               
            if(sum>=max)
                max=sum;
        }
        System.out.println(max);
    }
}