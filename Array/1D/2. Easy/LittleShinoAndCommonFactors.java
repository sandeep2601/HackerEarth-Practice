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
        long a,b;
        a=s.nextLong();
        b=s.nextLong();
        
        long min,max,count=0L;
        
        if(a<b){
            min=a;
            max=b;
        }
        else{
            min=b;
            max=a;
        }
            
        for(long i=1;i<=min/2;++i){
            if(min%i==0 && max%i==0){
                count++;
            }
        }
        
        if(min == max)
            count++;
        System.out.print(count);
    }
}


/*
long num=min,digit=0;
        while(num>=0){
            digit+=num%10;
            num/=10;
        }
        
        if(min%2==0){
            for(long i=1;i<=min/2;i+=2){
                if(min%i==0 && max%i==0){
                    count++;
                }
            }
        }
        else if(digit%3==0){
            for(long i=1;i<=min/2;i+=3){
                if(min%i==0 && max%i==0){
                    count++;
                }
            }
        }

*/