/*Prime Number

You are given an integer N. You need to print the series of all prime numbers till N.

Input Format

The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

Output Format

Print the desired output in single line separated by spaces.

Constraints

1<=N<=1000

SAMPLE INPUT 
9
SAMPLE OUTPUT 
2 3 5 7

*/


import java.util.Scanner;

class Prime {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if(N==2)
            System.out.print("2 ");
        else if(N==3  || N==4)
            System.out.print("2 3 ");
        else if(N>4 && N<=6)
            System.out.print("2 3 5 ");
        else if(N>6 && N<=10)
            System.out.print("2 3 5 7 ");
        else if(N>10 && N<=11)
            System.out.print("2 3 5 7 11 ");
        else if(N>11 && N<=13)
            System.out.print("2 3 5 7 11 13 ");
        else if(N>13 && N<=17)
            System.out.print("2 3 5 7 11 13 17 ");
        else if(N>17 && N<=19)
            System.out.print("2 3 5 7 11 13 17 19 ");
        else if(N>19 && N<=23)
            System.out.print("2 3 5 7 11 13 17 19 23 ");
        else if(N>23 && N<=29)
            System.out.print("2 3 5 7 11 13 17 19 23 29 ");
        else if(N>29 && N<=31)
            System.out.print("2 3 5 7 11 13 17 19 23 29 31 ");
        else if(N>31 && N<=37)
            System.out.print("2 3 5 7 11 13 17 19 23 29 31 37 ");
        else{
            System.out.print("2 3 5 7 11 13 17 19 23 29 31 37 ");
            for(int i=37;i<=N;i+=2){ // all prime nos are odd except 2.
                if(i%3==0 || i%5==0 || i%7==0 || i%11==0 || i%13==0 || i%17==0 || i%19==0 || i%23==0 || i%29==0 || i%31==0 || i%37==0){
                    
                }
                else{
                    System.out.print(i+" ");
                }
            }
        }
    }
}