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
 
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
			String line = br.readLine();
			if(!line.equals("42")){
				sb.append(line+"\n");
			}else{
				break;
			}
        }
        System.out.println(sb);
    }
}