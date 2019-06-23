/* Q

Napoleon choosed a city for Advertising his company's product. There are  streets in that city. Each day he travels one street. There are  buildings in a street which are located at points . Each building has some height(Say  meters). Napoleon stands at point . His height is . Now Napoleon starts communicating with the people of each building. He can communicate with people of a particular building only if he can see that building. If he succeed to communicate with any particular building then his boss gives him . i.e. if he communicates with  buildings in a day, then he will earn . Now Napoleon wants to know his maximum Earning for each day.

Note: All the points are on Strainght Line and Napoleon is always standing at point 0.

Input:
First line of input contains an integer , denoting no of streets in the city.
Details for each street is described in next two lines.
First line contains two integers  and  denoting no of buildings in the Street and earning on communicating with a building.
Second line contains  integers, denoting height of  building.

Output:
Print  Lines, each containing maximum earning in  street.

*/



//import java.util.Scanner
import java.io.*;
class MaximizeTheEarning {
    public static void main(String args[] ) throws Exception {
        int a,max =0,N,R,sum=0;
        Reader scan =  new Reader();
        //Scanner scan = new Scanner(System.in);
        int S = scan.readInt();
        while(S!=0)
        {
             N = scan.readInt();
             R = scan.readInt();
            a = scan.readInt();
            max = a;
            sum = sum + R;
            for(int i =1;i<N;i++)
            {
                a= scan.readInt();
                if(a>max)
                {
                    max = a;
                    sum = sum + R;
                }
            
                    
            }
            System.out.println(sum);
            sum =0;
            S--;
        }
 
    }
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
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int readInt() throws IOException
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
 
        public long readLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double readDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
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
}