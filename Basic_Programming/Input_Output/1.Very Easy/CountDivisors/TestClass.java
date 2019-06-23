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

import java.util.Scanner;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		int k = sc.nextInt();
		
		sc.close();
		int count = 0;
		if(l == r && l%k != 0) {
			System.out.println(0);
			System.exit(0);
		}
		
		while (l <= r) {
			if(l % k == 0) {
				break;
			}
			l++;
		}
 
		count = (r - l) / k + 1;
		System.out.println(count);
    }
}