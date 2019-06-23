/* Q   - Fredo And Array Update  -- Done

Fredo is assigned a new task today. He is given an array A containing N integers. His task is to update all elements of array to some minimum value x , that is, A[i]=x ; 1<=i<=N such that sum of this new array is strictly greater than the sum of the initial array. Note that x should be as minimum as possible such that sum of the new array is greater than the sum of the initial array.

Input Format:
First line of input consists of an integer N denoting the number of elements in the array A.
Second line consists of N space separated integers denoting the array elements.

Output Format:
The only line of output consists of the value of x.

*/

import java.util.Scanner;
public class FredoAndArrayUpdate{
	public static void main(String args[] ) throws Exception {
       
        int A[],N=0,sum=0,x=0;
        Scanner s = new Scanner(System.in);
        N=s.nextInt();
        A=new int[N];
        
        for(int i=0;i<N;++i){
            A[i]=s.nextInt();
            sum+=A[i];
        }
        
        x=sum/N;
        System.out.print(++x);
        
    }
}