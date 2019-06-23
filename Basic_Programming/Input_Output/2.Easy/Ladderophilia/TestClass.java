/* -------   Ladderophilia

Aditya is fond of ladders. Everyday he goes through pictures of ladders online but unfortunately today he ran out of ladder pictures online. Write a program to print “ladder with N steps”, which he can use to get his daily dose of ladder love.

INPUT:
Input contains integer N, the number of steps in the ladder

OUTPUT:

Print the ladder with the gap between two side rails being 3 spaces(“   “).

Check the sample output for format of printing the ladder.

CONSTRAINTS:

1<=N<=40

SAMPLE INPUT 
4
SAMPLE OUTPUT 
*   *
*   *
*****
*   *
*   *
*****
*   *
*   *
*****
*   *
*   *
*****
*   *
*   *
Time Limit:	5.0 sec(s) for each input file.
*/


import java.util.Scanner;
class TestClass
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<(n-1)*6+11;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i%2!=0)
					if(j==0 || j==4)
						System.out.print("*");
					else
						if((i+1)%6==0)
							System.out.print("*");
						else
							System.out.print(" ");
				//if(j==1||j==2||j==3)
					
			}
			System.out.print("\n");
		}
	}
}