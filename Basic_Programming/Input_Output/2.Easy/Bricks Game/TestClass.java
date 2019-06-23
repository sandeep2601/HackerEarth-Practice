/* Bricks Game

Patlu and Motu works in a building construction, they have to put some number of bricks N from one place to another, and started doing their work. They decided , they end up with a fun challenge who will put the last brick.

They to follow a simple rule, In the i'th round, Patlu puts i bricks whereas Motu puts ix2 bricks.

There are only N bricks, you need to help find the challenge result to find who put the last brick.

Input:

First line contains an integer N.

Output:

Output "Patlu" (without the quotes) if Patlu puts the last bricks ,"Motu"(without the quotes) otherwise.

Constraints:

1 ≤ N ≤ 10000

SAMPLE INPUT 
13
SAMPLE OUTPUT 
Motu
Explanation
Sample Explanation:

13 bricks are there :

Patlu Motu

1 2

2 4

3 1 ( Only 1 remains)

Hence, Motu puts the last one.

Time Limit:	1.0 sec(s) for each input file.


ex-
1  2   3
2  4   9
3  6   18
4  8   30
5  10  45
6  12  63
7  14  84
8  16  108
9  18  135
10 20  165

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=1;
        while(n>=0)
        {
            int p=i,m=i*2;
            if(p>=n){
                System.out.println("Patlu");
                break;
            }
            else{
                n=n-p;
            }
            if(m>=n){
                System.out.println("Motu");
                break;
            }
            else
            {
                n=n-m;
            }
            i++;
        }
 
    }
}