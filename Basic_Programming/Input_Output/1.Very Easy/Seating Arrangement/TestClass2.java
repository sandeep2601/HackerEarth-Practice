/*RESULT:  Accepted
Score

10.0

 
Time (sec)

1.4372

 
Memory (KiB)

3137136

 
Language

Java 8*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class TestClass2{
    private static final String SPACE = " ";
    private static final String NEW_LINE = "\n";
    
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer strBuffer = new StringBuffer();
 
        String line = br.readLine();
        int noOfCases = Integer.valueOf(line);
        int num=0,blockNumber=0;
        for(int i=1;i<=noOfCases;i++){
            num = Integer.valueOf(br.readLine());
            blockNumber = getBlockNumber(num);
            appendFacingSeatAndSeatType(num, 12*(blockNumber-1)+1, 12*blockNumber, strBuffer);
        }
         System.out.print(strBuffer.toString());
    }
    
    public static int getBlockNumber(int num){
        if(num%12==0){
            return  num/12;
        }else{
            return num/12 + 1;
        }
    }
    
    public static void appendFacingSeatAndSeatType(int num, int blockLB, int blockUB, StringBuffer strBuffer){
        if(blockUB-num>num-blockLB){
            strBuffer.append(blockUB-(num-blockLB)).append(SPACE).append(getSeatType(num-blockLB)).append(NEW_LINE);
        }else{
            strBuffer.append(blockLB+(blockUB-num)).append(SPACE).append(getSeatType(blockUB-num)).append(NEW_LINE);
        }
    }
    
    public static String getSeatType(int diff){
        if(diff == 0 || diff == 5){
            return "WS";
        }else if(diff == 2 || diff == 3){
            return "AS";
        }else{
            return "MS";
        }
    }
}