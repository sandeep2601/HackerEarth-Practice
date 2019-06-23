/*Prime Number

You are given an integer N. You need to print the series of all prime numbers till N.

Input Format

The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

Output Format

Print the desired output in single line separated by spaces.

Constraints

1<=N<=1000

SAMPLE INPUT 
9
SAMPLE OUTPUT 
2 3 5 7

*/


import java.util.Scanner;

class Prime1 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.print("2 ");
        for (int n = 3; n < N; n+=2) {
 
        	boolean isPrime=true;
        	
        	for(int j=3;j<=n/2;j+=2){
        	    
        	   if(n%j==0){
        	       
        	      isPrime=false;
        	      break;
        	   }
        	}
        	
        	if(isPrime)
        	   System.out.print(n+ " ");	
        }
    }
}

