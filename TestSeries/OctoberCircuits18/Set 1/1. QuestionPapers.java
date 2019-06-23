/*  -------- Question paper ------------

A question paper contains N questions. The marks assigned to each correct answer is a. For each incorrect answer, you will lose b marks. Find the number of different marks that can be obtained in the examination.

Note: An unattempted question is awarded 0 marks.

Input format

First line: T denoting the number of test cases
Each of the next T lines: Three space-separated integers N, a, and b
Output format

Print the answer to each test case in a different line. (The number of different marks that one can score in an examination).

Constraints
1<=T<=50 
1<=N<=5*10^4 
1<=a,b<=20

SAMPLE INPUT 
2
1 4 3
2 1 1

SAMPLE OUTPUT 
3
5

Explanation
For test case 1, you will get 0 for not attempting any question, 4 for the correct answer, and -3 for the wrong answer

For test case 2, you will get -2, -1, 0, 1, 2

Time Limit:	1.0 sec(s) for each input file.