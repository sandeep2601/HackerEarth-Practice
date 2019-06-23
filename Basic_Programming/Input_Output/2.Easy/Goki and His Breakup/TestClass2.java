/* 
Time (sec)

1.08978
 
Memory (KiB)

64

-----------Goki and his breakup

Goki recently had a breakup, so he wants to have some more friends in his life. Goki has N people who he can be friends with, so he decides to choose among them according to their skills set Yi(1<=i<=n). He wants atleast X skills in his friends.
Help Goki find his friends.

 INPUT
First line of the input contains an integer N denoting the number of people.

Next line contains a single integer X - denoting the minimum skill required to be Goki's friend. 

Next n lines contain one integer Y - denoting the skill of ith person.

OUTPUT
For each person print if he can be friend with Goki. 'YES' (without quotes) if he can be friends with Goki else 'NO' (without quotes).

CONSTRAINTS

1<=N<=1000000
1<=X,Y<=1000000

SAMPLE INPUT 
5
100
110
130
90
100
45

SAMPLE OUTPUT 
YES
YES
NO
YES
NO

Explanation
X is 100, so the first query is 110, so as 110 is greater than 100 answer is YES.

Time Limit:	1.0 sec(s) for each input file.
*/




import java.io.*;
 
class TestClass2 {
    
      public static class FastReader {
        
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream dataInputStream;
        private byte[] buffer;
        private int bufferPointer,bytesRead;
 
        public FastReader(final InputStream inputStream) {
            
            dataInputStream = new DataInputStream(inputStream);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        
        protected void fillBuffer() throws IOException {
            
            bytesRead = dataInputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
        
        protected byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
        
        public void close() throws IOException {
            if (dataInputStream == null)
                return;
            dataInputStream.close();
        }
        
        public int nextInt() throws IOException {
            
            int num = 0;
            byte c = read();
            while(c <= ' ') {
                c = read();
            }
            
            boolean isNegative = (c == '-');
            if(isNegative) {
                c = read();
            }
            
            do {
                num = num * 10 + c - '0';
            } while((c = read()) >= '0' && c <= '9');
            
            if(isNegative) {
                return -num;
            }
            return num;
        }
 
    }
    
    public static void main(String args[] ) throws Exception {
        FastReader fr = new FastReader(System.in);
        int personNum = fr.nextInt();
        int skill = fr.nextInt();
        
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int personNum = Integer.valueOf(br.readLine());
        //int skill = Integer.valueOf(br.readLine());
 
        final StringBuilder output = new StringBuilder();
        for (int index = 0; index < personNum; index++) {
            if (fr.nextInt() >= skill){
          //  if(Integer.valueOf(br.readLine()) >= skill) {
                output.append("YES\n");
                //System.out.println("YES");
            } else {
                output.append("NO\n");
                //System.out.println("NO");
            }
        }
 
        System.out.println(output);
    
        //fr.close();
    }
}