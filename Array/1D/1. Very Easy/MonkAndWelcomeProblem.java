/* Q   -    Monk and Welcome Problem  --Done

Having a good previous year, Monk is back to teach algorithms and data structures. This year he welcomes the learners with a problem which he calls "Welcome Problem". The problem gives you two arrays A and B (each array of size N) and asks to print new array C such that:
 ; 
Now, Monk will proceed further when you solve this one. So, go on and solve it :)

Input:
First line consists of an integer N, denoting the size of A and B.
Next line consists of N space separated integers denoting the array A.
Next line consists of N space separated integers denoting the array B.

Output:
Print N space separated integers denoting the array C.

*/

import java.util.Scanner;
public class MonkAndWelcomeProblem{
	public static void main(String ...s){
		int A[],B[],C[]; // Arrays in java can have their size only in integer.
						 // If size given in long then Error: incompatible types : possible lossy conversion from long to int
		int N,x=1;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		
		A=new int[N];
		B=new int[N];
		C=new int[N];
		
		for(int i=1;i<=N;i++){
				A[i-x]=sc.nextInt();
		}
		
		System.out.print("\n");	
		
		for(int i=1;i<=N;i++){
			B[i-x]=sc.nextInt();
		}
		
		System.out.print("\n");	
		
		for(int i=1;i<=N;i++){
			C[i-x]=A[i-x]+B[i-x];
			System.out.print(C[i-x]+" ");
		}
	}
}