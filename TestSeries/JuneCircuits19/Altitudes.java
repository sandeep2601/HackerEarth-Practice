/*			Altitudes

Alice and Bob took a journey to the mountains. They have been climbing up and down for  days and came home extremely tired.

Alice only remembers that they started their journey at an altitude of H1 meters and they finished their wandering at an altitude of H2 meters. Bob only remembers that every day they changed their altitude by A, B, or C meters. If their altitude on the ith day was x, then their altitude on day i+1 can be  x+A, x+B, or x+C.

Now, Bob wonders in how many ways they could complete their journey. Two journeys are considered different if and only if there exist a day when the altitude that Alice and Bob covered that day during the first journey differs from altitude Alice and Bob covered that day during the second journey.

Bob asks Alice to tell her the number of ways to complete the journey.
Bob needs your help to solve this problem.

Input format

The first and only line contains 6 integers N,H1,H2,A,B,C that represents the number of days Alice and Bob have been wandering, altitude on which they started their journey, altitude on which they finished their journey, and three possible altitude changes, respectively.

Output format

Print the answer modulo 10^9 + 7.

Constraints
1 <= N <= 10^5.
-10^9 <= H1,H2 <= 10^9.
-10^9 <= A,B,C <= 10^9.

SAMPLE INPUT 
2 0 0 1 0 -1

SAMPLE OUTPUT 
3

Explanation
There are only 3 possible journeys - (0,0,0),(0,1,0),(0,-1,0).

Time Limit:	5.0 sec(s) for each input file.
*/