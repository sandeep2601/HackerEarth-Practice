/*RESULT:  Accepted
Score

10.0

 
Time (sec)

2.28166

 
Memory (KiB)

3137344

 
Language

Java 8*/





import java.util.*;
 
class TestClass6{
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        StringBuilder output = new StringBuilder();
        
        for(int t=0; t<testCases; t++){
            int N = scan.nextInt();
            int n = N%12;
            switch(n){
                case 0:
                    output.append(N-11).append(" WS");
                    break;
                case 1:
                    output.append(N+11).append(" WS");
                    break;
                case 2:
                    output.append(N+9).append(" MS");
                    break;
                case 3:
                    output.append(N+7).append(" AS");
                    break;
                case 4:
                    output.append(N+5).append(" AS");
                    break;
                case 5:
                    output.append(N+3).append(" MS");
                    break;
                case 6:
                    output.append(N+1).append(" WS");
                    break;
                case 7:
                    output.append(N-1).append(" WS");
                    break;
                case 8:
                    output.append(N-3).append(" MS");
                    break;
                case 9:
                    output.append(N-5).append(" AS");
                    break;
                case 10:
                    output.append(N-7).append(" AS");
                    break;
                case 11:
                    output.append(N-9).append(" MS");
                    break;
            }
            output.append("\n");
        }
        System.out.print(output.toString());
    }
}