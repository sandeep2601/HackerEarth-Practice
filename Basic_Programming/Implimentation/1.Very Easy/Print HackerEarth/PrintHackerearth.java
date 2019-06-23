/* --------------- Print hackerearth

As a beginner to the programming, Mishki came to Hackerearth platform, to become a better programmer. She solved some problems and felt very confident. Later being a fan of Hackerearth, she gave a problem to her friends to solve. They will be given a string containing only lower case characters (a-z), and they need to find that by using the characters of the given string, how many times they can print "hackerearth"(without quotes). As they are new to programming world, please help them.

Input:
The first line will consists of one integer N denoting the length of string. 
Next line will contain the string Str containing only lower case characters.

Output:
Print one integer, denoting the number of times her friends can print "hackerearth" (without quotes).

Constraints:
1<=N<=pow(10,6)
Each character of string Str will be in range [a,z]

SAMPLE INPUT 
13
aahkcreeatrha

SAMPLE OUTPUT 
1

Explanation
Here by using the characters of string, her friends can print "hackerearth" (without quotes) only 1 time.

Time Limit:	1.0 sec(s) for each input file.
*/




import java.io.BufferedReader;
import java.io.InputStreamReader;

class PrintHackerearth {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int hackert[]=new int[]{0,0,0,0,0,0,0};
        String str = br.readLine();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='h')
                hackert[0]++;
            else if(ch=='a')
                hackert[1]++;
            else if(ch=='c')
                hackert[2]++;
            else if(ch=='k')
                hackert[3]++;
            else if(ch=='e')
                hackert[4]++;
            else if(ch=='r')
                hackert[5]++;
            else if(ch=='t')
                hackert[6]++;
        }
        
        hackert[0]/=2;
        hackert[1]/=2;
        hackert[4]/=2;
        hackert[5]/=2;
        int min=hackert[0];
        for(int i=1;i<hackert.length;i++){
            if(min>hackert[i])
                min=hackert[i];
        }
        System.out.println(min);
    }
}