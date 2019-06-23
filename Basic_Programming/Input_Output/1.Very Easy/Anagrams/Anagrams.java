/*				Anagrams

Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.

Input :
test cases,t
two strings a and b, for each test case

Output:
Desired O/p

Constraints :
string lengths<=10000

Note :
Anagram of a word is formed by rearranging the letters of the word.
For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.

SAMPLE INPUT 
1
cde
abc

SAMPLE OUTPUT 
4

Time Limit:	1.0 sec(s) for each input file.
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Anagrams {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        while(cases > 0){
            int deletionA = 0;
            int deletionB = 0;
            int diff = 0;
            String s1 = br.readLine();
            String s2 = br.readLine();
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            int len1 = 0 , len2 = 0;
            if(ch1.length <= ch2.length){
                len1 = ch1.length;
                diff = ch2.length - ch1.length;
            }
            else{
                len2 = ch2.length;
                diff = ch1.length - ch2.length;
            }
            for(int i = 0,j = 0; i < len1 && j < len2;){
                if(ch1[i] == ch2[j]){
                    i++;
                    j++;
                }
                else if(ch1[i] < ch2[j]){
                    deletionA++;
                    for(int k =i+1; ;k++){
                        if(ch1[k] > ch2[j]){
                            i = k;
                            break;
                        }
                        else if(ch1[k] < ch2[j]){
                            deletionA++;
                            continue;
                        }
                        else{
                            i = k+1;
                            j = j+1;
                            break;
                        }
                    }
                }
                else{
                    deletionB++;
                    for(int k =j+1; ;k++){
                        if(ch2[k] > ch1[i]){
                            j = k;
                            break;
                        }
                        else if(ch2[k] < ch1[i]){
                            deletionB++;
                            continue;
                        }
                        else{
                            j = k+1;
                            i = i+1;
                            break;
                        }
                    }
                }
            }
            cases--;
            System.out.println(deletionA+deletionB+diff);
        }

    }
}