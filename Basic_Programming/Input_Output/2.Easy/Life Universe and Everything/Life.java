/* --------Life, the Universe, and Everything

Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.

SAMPLE INPUT 
1
2
88
42
99

SAMPLE OUTPUT 
1
2
88

Time Limit:	5.0 sec(s) for all input files combined.
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Life {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
        int k;
        while((k=Integer.parseInt(br.readLine())) != 42){
            sb.append(k).append("\n");
        }
		pw.print(sb);
		//pw.println("42");
		pw.flush();
    }
}