 /*           TheGoodRanges        
 
Consider you have a set A. A Good Range is the largest range that contains only one element from the 
set A.

Now you are provided with the number range 1 to N and M queries. In each query, an Integer X is added to 
set A for each query, you have to output the sum of left and right border indices of all the Good Ranges. 

For example. N = 10, and the first query 2 is added to set A. The Good Ranges contain the range [1,10] 
and the sum in 11. Here [2,2] is also a range containing only one element from the set but it isn't the 
largest one. Now suppose 5 is added to the set, then the largest range containing only 2 is [1,4] and 
the largest containing only 5 is [3,10], so the sum is 1 + 4 + 3 + 10 = 18. 

Note : Set contains only distinct elements. 


INPUT : 
The first line contains two integers N and M. 
Next, M lines contain one integer X. 

OUTPUT : 
For each query print one integer, the sum of all the border indices of the Good Ranges. 
Note : Queries may have some numbers repeated. 
 
 
 */
 
import java.io.*; 
import java.util.*;
 
class TheGoodRanges{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		String input1 = br.readLine().trim();
		String[] input = input1.split(" ");
		long N = Long.parseLong(input[0]);
		long M = Long.parseLong(input[1]);
		ArrayList<Long> al = new ArrayList<>();
		long arr[] = new long[(int)M];
		long M1 = M;
		while(M > 0){
			arr[(int)(M1 - M)] = Long.parseLong(br.readLine().trim());
			M--;
		}
		
		while(M < M1){
			al.add(arr[(int)M]);
			Collections.sort(al);
			long out_ = getOutput(al,N);
			System.out.println(out_);
			M++;
		}
		wr.close();
		br.close();
	}
	
	static long getOutput(ArrayList al, long N){
		long total = 1l;
		int alSize = al.size();
		for(int i = 0; i < alSize; i++){
			long num = (long) al.get(i);
			if(i < alSize-1){
				long nextNum = (long) al.get(i+1);
				total += (nextNum-1) + (num+1);
			}
			else{
				total += N;
			}
		}
		return total;
	} 
}