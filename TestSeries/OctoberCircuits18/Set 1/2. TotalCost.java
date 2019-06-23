/*   --------Total Cost--------

A family consists of X members. You are given the task to book flight tickets for these X members.
You are given the following information about the airline in which you have to book the tickets:

P: It denotes the cost of one ticket of the flight.
S: It denotes the number of total available seats in the flight.
T: If the numbers of available seats are less than or equal to S, then the cost of the flight ticket increases to H.
H: It denotes the new hiked cost.
Determine the total cost to book the tickets for all the family members.
Note: The tickets are booked one by one for all the family members.


Input format
First line: Five space-separated integers P,S,T,H and X respectively

Output format
Print the total cost to book the tickets for all the members of the family.

Constraints
1<=P<=H<=10^5
1<=S<=300 
1<=T<=S 
1<=X<=S 

SAMPLE INPUT 
6000 10 5 6500 7

SAMPLE OUTPUT 
43000

Explanation
Monk books 5 tickets for price 6000 each and rest 2 for price 6500 each.
Total expenditure = 6000*5+6500*2 = 43000

Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB
*/