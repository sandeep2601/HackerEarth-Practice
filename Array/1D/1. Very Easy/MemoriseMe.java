/* Q-	MemoriseMe

Arijit is a brilliant boy. He likes memory games. He likes to participate alone but this time he has to have a partner. So he chooses you.

In this Game , your team will be shown N numbers for few minutes . You will have to memorize these numbers.

Now, the questioner will ask you Q queries, in each query He will give you a number and you have to tell him the total number of occurrences of that number in the array of numbers shown to your team . If the number is not present , then you will have to say "NOT PRESENT" (without quotes).

INPUT And OUTPUT

The first line of input will contain N, an integer, which is the total number of numbers shown to your team.

The second line of input contains N space separated integers .

The third line of input contains an integer Q , denoting the total number of integers.

The Next Q lines will contain an integer denoting an integer, for which you have to print the number of occurrences of that number () in those N numbers on a new line.

If the number isn’t present then Print "NOT PRESENT" (without quotes) on a new line.

*/


import java.io.IOException; 
//import java.io.InputStreamReader; 
//import java.io.BufferedReader; 
import java.util.Scanner; 
//import java.util.StringTokenizer; 

public class MemoriseMe{
	
	public static void main(String ...s)throws IOException{
		int array[],N=0,Q=0,query[],occur[],count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		array=new int[N];
		
		for(int i=0;i<N;i++)
			array[i]=sc.nextInt();
		
		
		Q=sc.nextInt();
		query=new int[Q];
		occur=new int[Q];
		for(int i=0;i<Q;i++){
			count=0;
			query[i]=Integer.parseInt(br.readLine());
			for(int j=0;j<N;j++){
				if(query[i]==array[j]){
					++count;
				}
			}
			occur[i]=count;
		}

		for(int i=0;i<Q;i++)
			if(occur[i]==0)
				System.out.println("NOT PRESENT");
			else
			System.out.println(occur[i]);
	}
}