/* ---------- Duration

Rahul is a very busy persion he dont wan't to waste his time . He keeps account of duration of each and every work. Now he don't even get time to calculate duration of works, So your job is to count the durations for each work and give it to rahul.

Input:

First line will be given by N number of works
Next N line will be given SH,SM,EH and EM  each separated by space(SH=starting hr, SM=starting min, EH=ending hr, EM=ending min)

Output:

N lines with duration HH MM(hours and minutes separated by space)

SAMPLE INPUT 
2
1 44 2 14
2 42 8 23

SAMPLE OUTPUT 
0 30
5 41

Time Limit:	1.0 sec(s) for each input file.
*/



import java.io.*;
import java.util.StringTokenizer;
 
public class TestClass1 {
 
  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    while (n-- > 0) {
      int h1 = in.nextInt();
      int m1 = in.nextInt();
      int h2 = in.nextInt();
      int m2 = in.nextInt();
      int c1 = h1 * 60 + m1;
      int c2 = h2 * 60 + m2;
      out.println((c2 - c1) / 60 + " " + (c2 - c1) % 60);
    }
  }
 
  public static void main(String[] args) {
    new TestClass1().run();
  }
 
  private void run() {
 
    try (InputReader in = new InputReader(System.in);
         PrintWriter out = new PrintWriter(System.out)) {
      solve(in, out);
    }
  }
 
 
  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;
 
    InputReader(InputStream stream) {
      //reader = new BufferedReader(new FileReader(stream), 32768);
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }
 
    String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }
 
    public int nextInt() {
      return Integer.parseInt(next());
    }
 
    public long nextLong() {
      return Long.parseLong(next());
    }
 
    public double nextDouble() {
      return Double.parseDouble(next());
    }
 
    @Override
    public void close() {
    }
  }
}