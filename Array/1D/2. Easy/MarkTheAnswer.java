/*			Mark The Answer

Our friend Monk has an exam that has quite weird rules. Each question has a difficulty level in the form of an 
Integer. Now, Monk can only solve the problems that have difficulty level less than X . Now the rules are-

 : Score of student is equal to the maximum number of answers he/she has attempted without skipping a question.
 
 : Student is allowed to skip just "one" question that will not be counted in the continuity of the questions.

Note- Assume the student knows the solution to the problem he/she attempts and always starts the paper from first 
question.

Given the number of Questions N,the maximum difficulty level of the problem Monk can solve X and the difficulty 
level of each question A[i], can you help him determine his maximum score?

Input Format
First Line contains Integer N , the number of questions and the maximum difficulty X Monk can solve.
Next line contains N integers, A[i] denoting the difficulty level of each question.

Output Format
Maximum score Monk can achieve in the exam.

Constraints
1<=N<=10^5
1<=X<=10^9
1<=A[i]<=10^9

SAMPLE INPUT 
7 6
4 3 7 6 7 2 2

SAMPLE OUTPUT 
3

Explanation
In this example, maximum difficulty = 6, Monk solves question 0 and 1, but skips the question 2 as A[2]>6. Monk 
then solves the question 3 , but stops at 4 because A[4]>6 and question 2 was already skipped. As 3 questions 
(0,1 and 3) were solved and 2 questions (2 and 4) have been skipped, therefore we print "3".

Time Limit:	1.0 sec(s) for each input file.
*/




//Time Taken : 1.94245s for 15 test cases.
import java.io.BufferedReader;
import java.io.InputStreamReader;

class MarkTheAnswer {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int X = Integer.parseInt(s1[1]);
        int score = 0;
        byte skip = 0;
        
        for(int i = 0; i < s2.length; i++){
            if(Integer.parseInt(s2[i]) <= X){
                score++;
            }
            else if(skip < 1){
                skip++;
            }
            else{
                break;
            }
        }
        System.out.println(score);
    }
}