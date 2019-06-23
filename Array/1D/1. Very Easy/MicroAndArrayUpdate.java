/* Q   - Micro and Array Update  --Done

Micro purchased an array A having N integer values. After playing it for a while, he got bored of it and decided to update value of its element. In one second he can increase value of each array element by 1. He wants each array element's value to become greater than or equal to K. Please help Micro to find out the minimum amount of time it will take, for him to do so.

Input: 
First line consists of a single integer, T, denoting the number of test cases. 
First line of each test case consists of two space separated integers denoting N and K. 
Second line of each test case consists of N space separated integers denoting the array A.

Output:
For each test case, print the minimum time in which all array elements will become greater than or equal to K. Print a new line after each test case.

*/

import java.util.Scanner;
public class MicroAndArrayUpdate{
	public static void main(String ...s){
		int array[],testcase,k,size,time[],min;
		Scanner sc=new Scanner(System.in);
		testcase=sc.nextInt();
		time=new int[testcase];
		
		for(int a=0;a<testcase;a++){
			size=sc.nextInt();
			k=sc.nextInt();
			array=new int[size];
			for(int i=0;i<size;i++){
				array[i]=sc.nextInt();
			}
			
			min=array[0];
			for(int i=1;i<size;i++){
				if(min>array[i])
					min=array[i];
			}
			if(min>=k)
				time[a]=0;
			else
				time[a]=k-min;
		}
		for(int a=0;a<time.length;a++)
			System.out.println(time[a]+" ");
	}
}