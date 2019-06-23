/*  -------- Prime Minister's number

Our Prime Minister has some secret numbers, so as in any case of emergency he can use it to contact the Avengers to save him. But these numbers has some special features, they are prime and sum of each individual's digit is also prime.Like 23, it is prime number and sum of it's digits (2+3)= 5, is also a prime number.

For your information, Avengers are Earth's Mightiest Heroes , consisting of Iron Man, Captain America, Thor, Hulk and many more.

So your task is to print all the such numbers  in a given range, a,b (both included), in ascending order.

Save your PM.

Input:

Single line containing two space separated integers, a and b respectively.

Output:

All the integers between a to b (including a and b), that satisfy conditions mentioned in statement, separated by single space.

Constraints:

1<= a,b <=1000000

SAMPLE INPUT 
10 50

SAMPLE OUTPUT 
11 23 29 41 43 47

Explanation:

Here a=10, b=50.

All the numbers between these which satisfy the property explained in question are

11 23 29 41 43 47, in ascending order.

11 (1+1=2 is prime)

23 (2+3=5 is prime)

29 (2+9=11 is prime)

41 (4+1=5 is prime)

43 (4+3=7 is prime)

47 (4+7=11 is prime)

Time Limit:	4.0 sec(s) for each input file.
*/


// Total Time Taken : 30.06492s
import java.io.BufferedReader;
import java.io.InputStreamReader;

class PrimeMinisterNumber {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int n;
        for (n = a; n <= b; n+=2) {
            if(n==2){
                System.out.print(n+" ");
                n-=1;
                continue;
            }
            else if(n%2==0){
                n+=1;
            }
            int k=0,i=n;
            while(i>0){
                k=k+(i%10);
                i/=10;
            }
            
            boolean isPrime = true;
            for(int l = 2; l <= k/2; l++){
                if(k%l==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                for(int j=3;j<=n/2;j+=2){
                    if(n%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.print(n+" ");
                }
            }
        }
    }
}