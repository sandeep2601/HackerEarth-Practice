/*			Cost of balloons

You are conducting a contest at your college. This contest consists of two problems and  participants.
You know the problem that a candidate will solve during the contest.

You provide a balloon to a participant after he or she solves a problem. There are only green and 
purple-colored balloons available in a market. Each problem must have a balloon associated with it 
as a prize for solving that specific problem. You can distribute balloons to each participant by 
performing the following operation:

 1. Use green-colored balloons for the first problem and purple-colored balloons for the second problem.
 2. Use purple-colored balloons for the first problem and green-colored balloons for the second problem.

You are given the cost of each balloon and problems that each participant solve. Your task is to print 
the minimum price that you have to pay while purchasing balloons.

Input format
First line:  that denotes the number of test cases ()
For each test case: 
First line: Cost of green and purple-colored balloons 
Second line:  that denotes the number of participants ()
Next  lines: Contain the status of users. For example, if the value of the  integer in the  row is , then it depicts that the  participant has not solved the  problem. Similarly, if the value of the  integer in the  row is , then it depicts that the  participant has solved the  problem.

Output format
For each test case, print the minimum cost that you have to pay to purchase balloons.

SAMPLE INPUT 
2
9 6
10
1 1
1 1
0 1
0 0
0 1
0 0
0 1
0 1
1 1
0 0
1 9
10
0 1
0 0
0 0
0 1
1 0
0 1
0 1
0 0
0 1
0 0

SAMPLE OUTPUT 
69
14

Time Limit:	1.0 sec(s) for each input file.
*/




import java.io.BufferedReader;
import java.io.InputStreamReader;

class CostOfBalloons {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            String[] s;
            s = br.readLine().split(" ");
            int g_cost = Integer.parseInt(s[0]);
            int p_cost = Integer.parseInt(s[1]);
            byte n_o_p = Byte.parseByte(br.readLine());
            byte[] p1 = new byte[n_o_p];
            byte[] p2 = new byte[n_o_p];
            byte c1=0,c2=0;
            for(byte i = 0; i < n_o_p; i++){
                s = br.readLine().split(" ");
                p1[i] = Byte.parseByte(s[0]);
                p2[i] = Byte.parseByte(s[1]);
                if(p1[i] == 1){
                    c1++;
                }
                if(p2[i] == 1){
                    c2++;
                }
            }
            if(g_cost <= p_cost){
                if(c1 <= c2){
                    System.out.println((p_cost*c1)+(g_cost*c2));
                }
                else{
                    System.out.println((p_cost*c2)+(g_cost*c1));
                }
            }
            else{
                if(c1 <= c2){
                    System.out.println((g_cost*c1)+(p_cost*c2));
                }
                else{
                    System.out.println((g_cost*c2)+(p_cost*c1));
                }
            }
        }
    }
}