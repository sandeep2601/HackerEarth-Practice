/*			Determine the winner

Arpa and Dishant are playing a game with a pile of N cards. Both the players taketheir turns alternately
starting from Arpa. In each turn, a player can remove at least 1 and at most K cards from the pile. 
If a player cannot make the next move, then the player loses the game. If both the players play 
optimally, your task is to determine the winner. You need to determine the winners for T independent 
games.

Input format
First line: T denoting the number of test cases (1 <= T <= 10^5)
First and only line of each test case: A single line containing two space-separated integers N and 
K (1 <= K <= N <= 10^18) 

Output format
For each test case, considering that both the players play optimally, print "Arpa" (without quotes) 
if he wins the game else print "Dishant" (without quotes) in a new line.

SAMPLE INPUT 
2
5 2
2 1

SAMPLE OUTPUT 
Arpa
Dishant

Explanation
For the first test case, Arpa chooses 2 cards. Now there are 3 cards left in the pile. It does not 
matter how many cards Dishant chooses from the pile, he'll always lose. 

For the second test case, both the players need to choose exactly 1 card from the pile. Hence, Dishant 
wins this game!

Time Limit:	1.0 sec(s) for each input file.
*/




//This is wrong program it only pass the sample test cases but failed all other test cases.
import java.io.BufferedReader;
import java.io.InputStreamReader;

class DetermineTheWinner {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long N,K,q,r;
        while(T-- > 0){
            String[] st = br.readLine().split(" ");
            N = Long.parseLong(st[0]);
            K = Long.parseLong(st[1]);
            q = N/K;
            r = N%K;
            if(r == 0){
                if(q%2 == 0)
                    System.out.println("Dishant");
                else
                    System.out.println("Arpa");
            }
            else{
                if(q%2 == 0){
                    if(r%2 == 0)
                        System.out.println("Dishant");
                    else
                        System.out.println("Arpa");
                }
                else{
                    if(r%2 != 0)
                        System.out.println("Dishant");
                    else
                        System.out.println("Arpa");
                }
            }
        }
    }
}