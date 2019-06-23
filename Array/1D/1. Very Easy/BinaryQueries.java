/* Q   -    BinaryQueries

Some problems appear hard though they are very easy. Today Aakash is stuck in a range query problem. He has been given an array with only numbers 0 and 1. There are two types of queries -

0 L R : Check whether the number formed from the array elements L to R is even or odd and print EVEN or ODD respectively. Number formation is the binary number from the bits status in the array L to R

1 X : Flip the Xth bit in the array 

Indexing is 1 based

Input
First line contains a number N and Q as input. Next line contains N space separated 0 or 1. Next Q lines contain description of each query 

Output
Output for only query type 0 L R whether the number in range L to R is "EVEN" or "ODD" (without quotes).

Explanation
Our first query is 1 2 that means that we have to flip the 2nd bit in the given array so now our array becomes 1 1 1 1 0
2nd query is 0 1 4 which means that if i pick the subarray 1 to 4 i.e 1 1 1 1 then the number formed by decimal representation of this binary number is of what kind ?. Here the number formed is 15 so its odd and ODD is the output

*/

import java.util.Scanner; 
import java.lang.StrictMath;
public class BinaryQueries{
	public static void main(String ...s){
		int array[],N,Q,query[][];
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		Q=sc.nextInt();
		array=new int[N];
		query=new int[Q][3];
		
		for(int i=0;i<N;++i){
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<Q;++i){
			query[i][0]=sc.nextInt();
			if(query[i][0]==1){
				query[i][1]=sc.nextInt();
			}
			else{
				query[i][1]=sc.nextInt();
				query[i][2]=sc.nextInt();
			}
		}
		
		for(int i=0;i<query.length;++i){
			if(query[i][0]==0){
				int m=query[i][1]-1;
				int n=query[i][2]-1;
				int sum=0,ctr=0;
				for(int j=m;j<=n;++j){
					sum+=array[j]*StrictMath.pow(2,ctr);
					ctr++;
				}

				if(sum%2==0)
					System.out.println("EVEN");
				else
					System.out.println("ODD");
			}
			else{
				int m=query[i][1]-1;
				if(array[m]==1)
					array[m]=0;
				else
					array[m]=1;
			}
		}
	}
}