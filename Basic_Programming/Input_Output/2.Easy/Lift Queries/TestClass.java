/*				Lift queries

There are 7 floors in BH3 and only 2 lifts. Initially Lift A is at the ground floor and Lift B at the top floor. Whenever someone calls the lift from N th floor, the lift closest to that floor comes to pick him up. If both the lifts are at equidistant from the N th floor, them the lift from the lower floor comes up.

INPUT
First line contains a integer T denoting the number of test cases.

Next T lines contains a single integer N denoting the floor from which lift is called.

OUTPUT
Output T lines containing one character "A" if the first lift goes to N th floor or "B" for the second lift.

CONTRAINTS
0 <= N <= 7

1 <= T <= 100000

 
SAMPLE INPUT 
2
3
5

SAMPLE OUTPUT 
A
A


Explanation
3rd floor calls, Lift A(0) goes there.

5th  floor calls, Lift A(3) and Lift B(7) are equidistant from 5, so Lift from lowest floor goes there i.e. A.

Time Limit:	1.0 sec(s) for each input file.
*/



import java.util.*;
import java.io.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        FastReader s= new FastReader();
        int a=0;
        int b=7;
        int n;
        int an,bn;
        int tc=s.nextInt();
        StringBuilder result= new StringBuilder();
        
        for(int i=0;i<tc;i++)
        {
            n=s.nextInt();
            an=Math.abs(a-n);
            bn=Math.abs(b-n);
            
            if(an>bn)
            {
                b=n;
                result.append("B\n");
            }
            else if(bn>an)
            {
                a=n;
                result.append("A\n");
            }
            else
            {
                if(a>b)
                {
                    b=n;
                    result.append("B\n");
                }
                else
                {
                    a=n;
                    result.append("A\n");
                }
            }
        }
        
        System.out.print(result);
    }
}
 
    class FastReader{
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
     
        public FastReader(){
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
     
        public FastReader(String file_name){
            try{
                din = new DataInputStream(new FileInputStream(file_name));
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
     
        public String readLine(){
            StringBuilder sb = new StringBuilder();
            byte c;
            while((c = read()) != -1){
                if(c == '\n'){
                    break;
                }
                sb.append((char)c);
            }
            return sb.toString();
        }
     
        public String readLine(int size){
            byte[] buf = new byte[size];
            int cnt = 0, c;
            while((c = read()) != -1){
                if(c == '\n'){
                    break;
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
     
        public int nextInt(){
            int n = 0;
            boolean neg = false;
            int c;
            while((c = read()) <= ' ');
            neg = c == '-';
            if(neg){
                c = read();
            }
            do{
                n = n * 10 + c - '0';
            }
            while((c = read()) >= '0' && c <= '9');
            if(c == 13){
                read();
            }
            return neg ? -n : n;
        }
     
        public long nextLong(){
            long n = 0;
            boolean neg = false;
            int c;
            while((c = read()) <= ' ');
            neg = c == '-';
            if(neg){
                c = read();
            }
            do{
                n = n * 10 + c - '0';
            }
            while((c = read()) >= '0' && c <= '9');
            if(c == 13){
                read();
            }
            return neg ? -n : n;
        }
     
        public double nextDouble(){
            double n = 0, div = 1;
            boolean neg = false;
            int c;
            while((c = read()) <= ' ');
            neg = c == '-';
            if(neg){
                c = read();
            }
            do{
                n = n * 10 + c - '0';
            }
            while((c = read()) >= '0' && c <= '9');
            if(c == '.'){
                while((c = read()) >= '0' && c <= '9'){
                    n += (c - '0') / (div *= 10);
                }
            }
            if(c == 13){
                read();
            }
            return neg ? -n : n;
        }
     
        private void fillBuffer(){
            try{
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if(bytesRead == -1){
                    buffer[0] = -1;
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
     
        public byte read(){
            if(bufferPointer == bytesRead){
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }
     
        public void close(){
            try{
                if(din == null){
                    return;
                }
                else{
                    din.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }