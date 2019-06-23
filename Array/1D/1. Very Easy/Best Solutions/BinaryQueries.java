/* Q 

Some problems appear hard though they are very easy. Today Aakash is stuck in a range query problem. He has been given an array with only numbers 0 and 1. There are two types of queries -

0 L R : Check whether the number formed from the array elements L to R is even or odd and print EVEN or ODD respectively. Number formation is the binary number from the bits status in the array L to R

1 X : Flip the Xth bit in the array 

Indexing is 1 based

Input
First line contains a number N and Q as input. Next line contains N space separated 0 or 1. Next Q lines contain description of each query 

Output
Output for only query type 0 L R whether the number in range L to R is "EVEN" or "ODD" (without quotes).

*/


import java.lang.System;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.OutputStreamWriter;
 
import javax.imageio.stream.FileImageInputStream;
 
public class BinaryQueries {
	
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		DataOutputStream ois = new DataOutputStream(System.out);
		Reader r = new Reader(dis);
		Writer1 w = new Writer1(ois);
		
		int arraySize = r.nextInt();
		int[] input = new int[arraySize];
		int totolInputs = r.nextInt();
		
		for(int i=0;i<arraySize;i++) {
			input[i] = r.nextInt();
		}
		
		int x;
    	for(int i=0;i<totolInputs;i++) {
			x = r.nextInt();
			if(x == 0) {
				r.nextInt();
				if(input[r.nextInt()-1] == 0) {
					w.write(true);
				}
				else {
					w.write(false);
				}
			}else {
				int token = r.nextInt();
				input[token-1] = input[token-1] ^ 1;
			}
		}
		w.flush();
	}
	
	static class Reader{
		
		private DataInputStream dis = null;
		private int bufferSize = 1 << 24;
		private byte[] by = new byte[bufferSize];
		private int read = 0;
		private int count = 0;
		private int index = -1;
		
		Reader(){}
		
		Reader(DataInputStream is){
			this.dis = is;
		}
		
		private boolean loadBuffer() throws IOException {
			while((read = dis.read(by)) != -1) {
				return true;
			}
			return false;
		}
		
		private int readCharAsInt() throws IOException {
			if(index < 0 || index >= read )
				if(loadBuffer())
					index = 0;
				else
					return -1;
			if(index < read) {
				int temp = index;
				index++;
				if(by[temp] != 0) {
					return by[temp];}
				else
					return -1;
			}
			return -1;
		}
		
		public int nextInt() throws IOException{
			int temp = 0;
			int num = 0;
			boolean status = false;
			
			while((temp = readCharAsInt()) != -1) {
				if(temp >= 48 && temp<= 57) {
					num = temp - 48;
					status = true;
					break;
				}
			}
 
			while((temp = readCharAsInt()) != -1) {
				if(temp >= 48 && temp<= 57)
					num = temp-48 + num * 10;
				else
					break;
			}
 
			if(status)
				return num;
 
			return -1;
		}
		
	}
	
	static class Writer1{
		
		byte[] buffer = new byte[1<<16];
		int bufferIndex = 0;
		DataOutputStream dis;
		int count = 0;
		byte[] evenBytes = ("EVEN"+System.lineSeparator()).getBytes(Charset.forName("UTF-8"));
		byte[] oddBytes = ("ODD"+System.lineSeparator()).getBytes(Charset.forName("UTF-8"));
		
		Writer1(){}
		
		Writer1(DataOutputStream dis){
			this.dis = dis;
		}
		
		private void write(boolean status) throws IOException{
			if(status)
				updateBuffer(evenBytes);
			else
				updateBuffer(oddBytes);
		}
 
		private void updateBuffer(byte[] by) throws IOException {
			if(bufferIndex >= buffer.length - 5) {
				writeBuffer();
				bufferIndex = 0;
			}
			for(int i=0;i<by.length;i++) {
				buffer[bufferIndex] = by[i];
				bufferIndex++;
			}
		}
 
		private void writeBuffer() throws IOException{
			dis.write(buffer, 0, bufferIndex);
		}
		
		private void flush() throws IOException {
			writeBuffer();
			dis.flush();
			dis.close();
		}
		
	}
}