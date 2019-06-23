/*		The Dice

There are x number of girls and they rolled a dice in turns one after another.

If the number on the dice is 6, then the dice will be rolled again until she get a number other than 6.

Since you know the sequence of numbers which the dice shows when rolled each time, you have to find 
what is the total number of girls or if the sequence is invalid.

Input format
A single line that contains a string s(1 <= |s| <= 10^5) denoting the sequence of numbers the dice 
rolls on written as string.

Output format
If the sequence is valid print the number of girls  
If the sequence is invalid print -1

SAMPLE INPUT 
3662123

SAMPLE OUTPUT 
5

Explanation
The second person rolls the dice 3 times so the number of people will be 5.

Time Limit:	2.0 sec(s) for each input file.
*/



//Total Time Taken : 3.79667s
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Dice{
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        int len = arr.length;
        int n_o_g = 0;
        if(Integer.parseInt(arr[len-1]) == 6){
            System.out.println("-1");
            System.exit(0);
        }
        else{
            for(int i = 0; i < len; i++){
                int n = Integer.parseInt(arr[i]);
                if(n < 6)
                    n_o_g++;
            }
        }
        System.out.println(n_o_g);
    }
}