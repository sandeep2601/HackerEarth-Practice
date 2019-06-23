/*				Two Strings

Given two strings of equal length, you have to tell whether they both strings are identical.

Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.

Input :
First line, contains an intger 'T' denoting no. of test cases.
Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.

Output:
For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.

Constraints:
1<= T <=100
1<= |S1| = |S2| <= 10^5
String is made up of lower case letters only.
Note : Use Hashing Concept Only . Try to do it in O(string length) .

SAMPLE INPUT 
3
sumit mitsu
ambuj jumba
abhi hibb

SAMPLE OUTPUT 
YES
YES
NO

Explanation :
For first test case,

mitsu can be rearranged to form sumit .

For second test case,

jumba can be rearranged to form ambuj .

For third test case,

hibb can not be arranged to form abhi.

Time Limit:	1.0 sec(s) for each input file.
*/


import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.StringTokenizer;
 
class TestClass{
    public static void main(String args[]) throws Exception{
        FastReader fr = new FastReader();
        int T = fr.nextInt(), count, c;
        int arr[];
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < T; i++){
            arr = new int[26];
            count = 0;
            while((c = fr.read()) > 96){
                arr[c - 97]++;
                count++;
            }
            while((c = fr.read()) != -1 && c > 96){
                c -= 97;
                if(arr[c] != 0){
                    arr[c]--;
                    count--;
                }
            }
            output.append(count == 0 ? "YES\n" : "NO\n");
        }
        System.out.print(output);
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