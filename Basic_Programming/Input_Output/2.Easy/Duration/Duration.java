/* ---------- Duration

Rahul is a very busy persion he dont wan't to waste his time . He keeps account of duration of each and every work. Now he don't even get time to calculate duration of works, So your job is to count the durations for each work and give it to rahul.

Input:

First line will be given by N number of works
Next N line will be given SH,SM,EH and EM  each separated by space(SH=starting hr, SM=starting min, EH=ending hr, EM=ending min)

Output:

N lines with duration HH MM(hours and minutes separated by space)

SAMPLE INPUT 
2
1 44 2 14
2 42 8 23

SAMPLE OUTPUT 
0 30
5 41

Time Limit:	1.0 sec(s) for each input file.
*/



import java.util.Scanner;

class Duration {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int sh,sm,eh,em;
        while(w>0){
            sh=s.nextInt();
            sm=s.nextInt();
            eh=s.nextInt();
            em=s.nextInt();
            if(em>=sm){
                System.out.println((eh-sh)+" "+(em-sm));
            }
            else{
                System.out.println((eh-sh-1)+" "+((60-sm)+em));
            }
            w--;
        }
        
    }
}