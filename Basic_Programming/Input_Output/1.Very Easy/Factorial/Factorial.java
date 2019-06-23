/*  -----------  Factorial!

You have been given a positive integer N. You need to find and print the Factorial of this number. The Factorial of a positive integer N refers to the product of all number in the range from 1 to N. You can read more about the factorial of a number here.

Input Format:
The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.

Output Format
Output a single line denoting the factorial of the number N.

Constraints
1<=N<=10

SAMPLE INPUT 
2

SAMPLE OUTPUT 
2

Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Factorial {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int N=Integer.parseInt(num);
  
        for(int i=N-1;i>0;i--){
            N*=i;
        }
        System.out.print(N);
    }
}


// OR  Good

/*

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
  
        for(int i=N-1;i>0;i--){
            N*=i;
        }
        System.out.print(N);
    }
}

*/