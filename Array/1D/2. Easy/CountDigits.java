// -- Done
import java.util.Scanner;

class CountDigits {
    public static void main(String args[] ) throws Exception {
        String str;
        int array[]= new int[10];
		int c;
		for(int i=0;i<10;++i){
             array[i]=0;
         }
        Scanner s = new Scanner(System.in);
        str = s.nextLine();                 // Reading input from STDIN
        for(int i=0;i<str.length();++i){
            c=str.charAt(i)-48; 			//zero(0) in ASCII as 48
            if(c==0)
                array[0]++;
            else if(c==1)
                array[1]++;
            else if(c==2)
                array[2]++;
            else if(c==3)
                array[3]++;
            else if(c==4)
                array[4]++;
            else if(c==5)
                array[5]++;
            else if(c==6)
                array[6]++;
            else if(c==7)
                array[7]++;
            else if(c==8)
                array[8]++;
            else if(c==9)
                array[9]++;
        }
        
         for(int i=0;i<10;++i){
             System.out.println(i+" "+array[i]);
         }

    }
}
