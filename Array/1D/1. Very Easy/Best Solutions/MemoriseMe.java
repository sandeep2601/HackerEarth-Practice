/* Q-	MemoriseMe

Arijit is a brilliant boy. He likes memory games. He likes to participate alone but this time he has to have a partner. So he chooses you.

In this Game , your team will be shown N numbers for few minutes . You will have to memorize these numbers.

Now, the questioner will ask you Q queries, in each query He will give you a number , and you have to tell him the total number of occurrences of that number in the array of numbers shown to your team . If the number is not present , then you will have to say “NOT PRESENT” (without quotes).

INPUT And OUTPUT

The first line of input will contain N, an integer, which is the total number of numbers shown to your team.

The second line of input contains N space separated integers .

The third line of input contains an integer Q , denoting the total number of integers.

The Next Q lines will contain an integer denoting an integer,  , for which you have to print the number of occurrences of that number () in those N numbers on a new line.

If the number  isn’t present then Print “NOT PRESENT” (without quotes) on a new line.

*/


import java.util.*;
import java.io.*;
public class MemoriseMe {
    static int arr[],n;
    public static void main(String[] args) throws IOException {
        Reader scan = new Reader();
       PrintWriter out = new PrintWriter(System.out,true);
       StringBuilder sb = new StringBuilder("");   //fast output
       n = scan.nextInt();
       int freq[] = new int[10001];
       for(int i=0;i<n;++i)
       {
          freq[scan.nextInt()]++;
       }
       int q = scan.nextInt();
       while(q-->0)
       {
           int key = scan.nextInt();
           if(freq[key]==0)
               sb.append("NOT PRESENT");
           else sb.append(freq[key]);
           sb.append("\n");
       }
       out.println(sb);
    }
    static class Reader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
 
    public Reader() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
 
    public Reader(String file_name) throws IOException {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
 
    public String readLine() throws IOException {
        byte[] buf = new byte[64];
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }
 
    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (neg) return -ret;
        return ret;
    }
 
    public long nextLong() throws IOException {
        long ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (neg) return -ret;
        return ret;
    }
 
    public double nextDouble() throws IOException {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);
        if (neg) return -ret;
        return ret;
    }
 
    private void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) buffer[0] = -1;
    }
 
    private byte read() throws IOException {
        if (bufferPointer == bytesRead) fillBuffer();
        return buffer[bufferPointer++];
    }
 
    public void close() throws IOException {
        if (din == null) return;
        din.close();
    }
}
  
    
}