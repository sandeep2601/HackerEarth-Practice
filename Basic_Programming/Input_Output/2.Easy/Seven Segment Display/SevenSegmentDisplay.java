//TIme Taken : 2.01225s for 10 Test Cases.

import java.io.BufferedReader;
import java.io.InputStreamReader;

class SevenSegmentDisplay {
    public static void main(String args[] ) throws Exception {
    
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(s.readLine());
        int N;
        while(T>0){
            N=0;
            char[] ar = s.readLine().toCharArray();
            for(int i = 0; i < ar.length; i++){
                switch(ar[i]){
                    case '0':N+=6;break;
                    case '1':N+=2;break;
                    case '2':N+=5;break;
                    case '3':N+=5;break;
                    case '4':N+=4;break;
                    case '5':N+=5;break;
                    case '6':N+=6;break;
                    case '7':N+=3;break;
                    case '8':N+=7;break;
                    case '9':N+=6;
                }
            }

        
            if(N%2==0){
                int k=N/2;
                while(k>0){
                    System.out.print("1");
                    k--;
                }
                System.out.println();
            }
            else{
                int k=N/2;
                System.out.print("7");
                while(k>1){
                    System.out.print("1");
                    k--;
                }
                System.out.println();
            }
            T--;
        }
    }
}