/* 
Time (sec)

1.08649

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
import java.util.*;
 
public class TestClass1 {
 
	private static Reader scanner = new Reader();
	private static Print printer = new Print();
 
	public static void main(String[] args) throws IOException {
		new Thread(null, new Runnable() {
			public void run() {
				try {
					process();
					printer.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, "1", 1 << 26).start();
	}
	
	private static class Print {
		private final BufferedWriter bw;
 
		public Print() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}
 
		public void print(Object object) throws IOException {
			bw.append("" + object);
		}
 
		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}
 
		public void close() throws IOException {
			bw.close();
		}
	}
	
	private static class Reader {
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
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}
 
		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
 
			if (neg)
				return -ret;
			return ret;
		}
 
		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
 
		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
 
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
 
			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}
 
			if (neg)
				return -ret;
			return ret;
		}
 
		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
 
		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}
 
		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
 
    private static class Edge implements Comparable<Edge> {
	    public int x, y;
 
	    public Edge(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
 
		public int compareTo(Edge o) {
			if (x != o.x)
	            return x - o.x;
			return y - o.y;
		}
		
		public boolean equals(Object obj) {
    		Edge e = (Edge) obj;
    		return x == e.x && y == e.y;
	    }
	    
	    public String toString() {
	        return "(" + x + ", " + y + ")";
	    }
	}
	
    private static int max = (int) (1e6 + 1);
    private static int mod = (int) (1e9 + 7);
 
    private static List<Integer> primes = new ArrayList<Integer>();
	private static void init() {
	    boolean[] p = new boolean[max];
		p[0] = true;
		p[1] = true;
		for (int i = 2; i < max; i++) {
			if (p[i])
				continue;
			primes.add(i);
			for (int j = i + i; j < max; j += i) {
				p[j] = true;
			}
		}
	}
	
	private static void process() throws IOException {
		int n = scanner.nextInt();
	    int x = scanner.nextInt();
	    for (int i = 1; i <= n; i++) {
	        int y = scanner.nextInt();
            if (y >= x)
    		    printer.println("YES");
		    else
    		    printer.println("NO");
		}
	}
}