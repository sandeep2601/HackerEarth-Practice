/*				Vowel Recognition

{a,e,i,o,u,A,E,I,O,U}

Natural Language Understanding is the subdomain of Natural Language Processing where people used to 
design AI based applications have ability to understand the human languages. HashInclude Speech 
Processing team has a project named Virtual Assistant. For this project they appointed you as a data 
engineer (who has good knowledge of creating clean datasets by writing efficient code). As a data 
engineer your first task is to make vowel recognition dataset. In this task you have to find the 
presence of vowels in all possible substrings of the given string. For each given string you have to 
print the total number of vowels.
 

Input
First line contains an integer T, denoting the number of test cases.
Each of the next lines contains a string, string contains both lower case and upper case .

Output
Print the vowel sum
Answer for each test case should be printed in a new line.

Input Constraints
1<=T<=10
1<=|S|<=100000
 

SAMPLE INPUT 
1
baceb

SAMPLE OUTPUT 
16

Explanation
First line is number of input string, In given example, string is "baceb" so the substrings will be 
like -"b, ba, bac, bace, a, ac, ace, aceb, c, ce, ceb, e, eb, baceb" now the number of vowels in each 
substring will be 0, 1, 1, 2, 1, 1, 2, 2, 0, 1, 1, 1, 1, 2  and the total number will be sum of all 
presence which is 16.

Time Limit:	1.0 sec(s) for each input file.
*/




import java.io.BufferedReader;
import java.io.InputStreamReader;

class VowelRecognition {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        while(T-- > 0){
            char ch[] = br.readLine().toCharArray();
            int len=ch.length;
            int v=0;
            for(int i=0;i<len;i++){
                for(int j=i;j<len;j++){
                    for(int k=len-1;k>=j;k--){
                        char c=ch[j];
                        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                            v++;
                    }
                }
            }
            System.out.println(v);
        }
    }
}


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        while(T-- > 0){
            char ch[] = br.readLine().toCharArray();
            int len=ch.length;
            int v=0;
            for(int i=0;i<len;i++){
                char c=ch[i];
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                    v++;
            }
            int result = fact(len+v-1)/(fact(v)*fact(len-1));
            System.out.println(result+1);
        }
    }
    
    public static int fact(int num){
        int sum = num;
        for(int i = num-1; i > 1; i--){
            sum *=i;
        }
        return sum;
    }
}