/* -----------Goki and his breakup

Goki recently had a breakup, so he wants to have some more friends in his life. Goki has N people who he can be friends with, so he decides to choose among them according to their skills set Yi(1<=i<=n). He wants atleast X skills in his friends.
Help Goki find his friends.

 INPUT
First line of the input contains an integer N denoting the number of people.

Next line contains a single integer X - denoting the minimum skill required to be Goki's friend. 

Next n lines contain one integer Y - denoting the skill of ith person.

OUTPUT
For each person print if he can be friend with Goki. 'YES' (without quotes) if he can be friends with Goki else 'NO' (without quotes).

CONSTRAINTS

1<=N<=1000000
1<=X,Y<=1000000

SAMPLE INPUT 
5
100
110
130
90
100
45

SAMPLE OUTPUT 
YES
YES
NO
YES
NO

Explanation
X is 100, so the first query is 110, so as 110 is greater than 100 answer is YES.

Time Limit:	1.0 sec(s) for each input file.
*/




import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int X = s.nextInt();
        int Y;
        for(int i=0;i<N;i++){
            Y = s.nextInt();
            if(Y>=X)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}