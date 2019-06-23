/*RESULT:  Accepted
Score

10.0

 
Time (sec)

2.69704

 
Memory (KiB)

3137276

 
Language

Java 8*/




import java.io.BufferedReader;
import java.io.InputStreamReader;
 
import java.util.*;
 
class TestClass4{
    public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();               
        int t = Integer.valueOf(line1);
        for(int i = 0; i< t; i++){
            //Scanner s = new Scanner(System.in);
            String nextLine = br.readLine();
            System.out.println(getOppositeBerth(Integer.valueOf(nextLine)));
        }
        
 
    }
    
    public static BirthType getBerthType(int n){
        int k = n%6;
        if(k==0 || k== 1)
            return BirthType.WS;
        else if(k==2 || k==5)
            return BirthType.MS;
        else
            return BirthType.AS;
    }
    
    public static String getOppositeBerth(int n){
        boolean isLeftRight = true;
        if( Math.floor((n-1)/6) % 2 == 1)
            isLeftRight = false;
            
        BirthType birthType = getBerthType(n);
        int oppositeBerth = n % 6;
        switch(birthType){
            case WS:
                if(oppositeBerth == 1)
                    oppositeBerth = findBerth(n, 11, isLeftRight);
                else if(oppositeBerth == 0)
                    oppositeBerth = findBerth(n, 1, isLeftRight);
                break;
            case MS:
                if(oppositeBerth == 2)
                    oppositeBerth = findBerth(n, 9, isLeftRight);
                else if(oppositeBerth == 5)
                    oppositeBerth = findBerth(n, 3, isLeftRight);
                break;
            case AS:
                if(oppositeBerth == 3)
                    oppositeBerth = findBerth(n, 7, isLeftRight);
                else if(oppositeBerth == 4)
                    oppositeBerth = findBerth(n, 5, isLeftRight);
                break;
            default:
                break;
        }
        return Integer.toString(oppositeBerth) + " " + birthType.toString();
    }
    
    public static int findBerth(int n, int k, boolean leftRight){
        if(leftRight)
            return n + k;
        else
            return n - (12-k);
    }
    
    enum BirthType{
        WS,
        MS,
        AS
    }
    
}