/*		Minimum matrix

This is an approximate problem. There is no exact solution. You must find the most optimal solution. 
Please, take a look on sample explanation to ensure that you understand the problem correctly.

You are given an integer matrix A of size N x M. You start on the left upper corner cell (with 
coordinates (1,1) ). You can walk in four directions. You can not visit the same cell twice. You have 
to visit every cell of matrix A. When you stand on a cell, your maximum value is updated with the value 
of element on this cell. Initially, the maximum value is equal to A[1,1]. Your task is to find the path 
with the minimum number of changes in the maximum value.

Input format
First line: Two space-separated integers N and  M (1 <= N,M <= 500)
Each of the next N lines: M space-separated integers A[i,j] (1 <= A[i,j] <= 10^9)

Output format

In each of the N.M lines, print two numbers that represent the coordinates of the cell of the path. The 
first one must contain two integers 1 and 1.

Verdict and scoring

Your score is equal to the sum of the values of all test cases. 

The value of each test is equal to the number of changes in maximum value.

If at least one of the rules will be violated, then your value for this test will be 0.

Test generation plan

In 16,6% tests: (1 <= N <= 5, 1 <= M <= 500); elements of matrix A are generated randomly.

In 50% tests: (1 <= N, M <= 500); elements of matrix A are generated randomly.

In 33% tests: (1 <= N, M <= 500); there is an integer K is equal to the minimum from three values: 50, 
N and M; elements of matrix A are generated randomly, but K.K largest elements from matrix A are located 
in the right lower square of matrix A of size K x K.

SAMPLE INPUT 
3 3
2 1 7
4 1 6
7 4 8

SAMPLE OUTPUT 
1 1
1 2
1 3
2 3
3 3
3 2
2 2
2 1
3 1

Explanation
Maximum value initially is equal to 2 and you stood on cell (1, 1). Then you walked on element 1, 
maximum did not updated. After that you went on element 7, maximum value has become 7 and your score 
on this test increased by 1. Then you walked on element 6, nothing changed. After that you went on 
element 8, maximum value has become 8 and your score on this test increased by 1. Since your maximum 
value is equal to maximum element of matrix, nothing will changes. The score for this sample test is 
equal to 2.

Time Limit:	5.0 sec(s) for each input file.