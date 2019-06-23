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

I'm Using formula for series 0,3,9,18,45,63,84,....  : 3*n*(n+1)/2

*/



//  Using formula : 3*n*(n+1)/2
import java.util.Scanner;

class Bricks {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int c=0,brick=1;
        while(brick<=N){
            brick=N-(3*c*(c+1)/2);
            if(brick>0 && brick<=(c+1+((c+1)*2))){
                if(brick>c+1){
                    System.out.print("Motu");
                    System.exit(0);
                }
                    
                else{
                    System.out.print("Patlu");
                    System.exit(0);
                }
            }
            c++;
        }
    }
}