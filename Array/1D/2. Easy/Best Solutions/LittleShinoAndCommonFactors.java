/* ------ Little Shino and Common Factors   ----------
Little Shino loves maths. Today her teacher gave her two integers. Shino is now wondering how many integers can divide both the numbers. She is busy with her assignments. Help her to solve the problem.

Input:
First line of the input file contains two integers, a and b.

Output:
Print the number of common factors of a and b.	*/


import java.util.Scanner;

class LittleShinoAndCommonFactors {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        long a=s.nextLong();
        long b=s.nextLong();
        commDiv(a,b);
    }
   public  static long gcd(long a,long b)
    {
        if (a == 0) 
            return b;
         
        return gcd(b%a,a);
    }
    public static void commDiv(long a,long b)
    {
        long n = gcd(a, b);
        long result = 0;
        for (long i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i)
                    result += 1;
                else
                    result += 2;
            }
        }
        System.out.println(result);
    }
}