/* ----------- Decaying Roads -----------

There is a City having some set of roads where each road has the same source and the same destination.There are N trucks and M roads in the city.You are given K permits in the city(in the form of X and Y) which indicates that a truck X is permitted to travel on Road Y.

Each road has a restriction on the number of trucks it can allow to travel on it.This restricted number is known as Capacity[i].

Due to the poor condition of the roads, every year 1 particular road's capacity reduces by a number P. The data is known for Z years.

For each year before the reduction takes place,you need to predict the maximum number of trucks that can travel in the city.

Input Format:

First line contains 3 integers N , M and K.

Next K lines contain 2 integers X and Y denoting that Xth truck is permitted on Yth road.

Then there is an array of size M consisting of Capacity[i].

Then there is an integer Z (number of years for which the information is provided).

Then Z lines contain 2 integers R and P denoting Road R's capacity reduces by P.

Output Format:

Print Z lines containing the maximum number of trucks that can travel in the city.

Constraints:

1<=N,M<=2000
1<=K<=10000 
1<=Z<=5000
1<=X<=N
1<=Y,R<=M 
0<=Capacity[i],P<=20

SAMPLE INPUT 
3 4 5
1 1
1 2
2 2
2 4
3 4
3 2 5 3
7
3 4
2 1
1 3
4 2
2 1
4 1
3 1
SAMPLE OUTPUT 
3
3
3
3
2
1
0

Explanation
Before Year 1 reduction-> Send truck 1 on road 1,truck 2 on road 2,truck 3 on road 4.

Before Year 4  reduction -> Send truck 1 on road 2,truck 3 on road 4.

Before Year 7  reduction -> only road 3 has capacity 1.But since no trucks are permitted on road 3 so you can not allow any truck.

Time Limit:	5.0 sec(s) for each input file.

*/