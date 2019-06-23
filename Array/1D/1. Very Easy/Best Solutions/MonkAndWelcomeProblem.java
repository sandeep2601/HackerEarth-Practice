/* Q

Having a good previous year, Monk is back to teach algorithms and data structures. This year he welcomes the learners with a problem which he calls "Welcome Problem". The problem gives you two arrays A and B (each array of size N) and asks to print new array C such that:
 ; 
Now, Monk will proceed further when you solve this one. So, go on and solve it :)

Input:
First line consists of an integer N, denoting the size of A and B.
Next line consists of N space separated integers denoting the array A.
Next line consists of N space separated integers denoting the array B.

Output:
Print N space separated integers denoting the array C.

*/


import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class MonkAndWelcomeProblem { 
    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
    
    public static void main(String args[] ) throws Exception {
       
       Reader in=new Reader();
       PrintWriter pw=new PrintWriter(System.out);
       int n, A[], B[], i=0;
       
       n = in.nextInt();
       A = new int[n];
       B = new int[n];
       
       for(; i<n; i++){
           A[i] = in.nextInt();
       }
       for(i=0; i<n; i++){
           B[i] = in.nextInt();
       }
       for(i=0; i<n; i++){
           pw.print(A[i]+B[i]);
           pw.print(" ");
       }
       pw.flush();
    }
}