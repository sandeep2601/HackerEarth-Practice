import java.util.Scanner;
import java.lang.Math;

class Find {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int ar[]=new int[N];
        int ans=1;
        for(int i=0;i<N;i++){
            ar[i]=s.nextInt();
            ans=(int)(ans*ar[i])%(Math.pow(10,9)+7);
        }
        System.out.println(ans);
    }
}
