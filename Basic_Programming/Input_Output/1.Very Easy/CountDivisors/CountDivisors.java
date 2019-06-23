/*  --------------- Count Divisors

You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.

Input Format
The first and only line of input contains 3 space separated integers l, r and k.

Output Format
Print the required answer on a single line.

Constraints
1 <= l,r <= 1000
1 <= k <= 1000

SAMPLE INPUT 
1 10 1
SAMPLE OUTPUT 
10

Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CountDivisors {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] tokens=input.split(" ");
        int l=Integer.parseInt(tokens[0]);
        int r=Integer.parseInt(tokens[1]);
        int k=Integer.parseInt(tokens[2]);
        int count=0;
        
        for(int i=l;i<=r;){
            if(i%k==0){
                count++;
                i+=k;
            }
            else{
                i+=1;
            }
        }
        System.out.print(count);
    }
}

// OR Good

/*

import java.util.Scanner;

class CountDivisors {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        
        for(int i=l;i<=r;){
            if(i%k==0){
                count++;
                i+=k;
            }
            else
                i+=1;
        }
        System.out.print(count);
    }
}
*/