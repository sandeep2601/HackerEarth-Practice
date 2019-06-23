/*			Min-Max

Given an array of integers . Check if all the numbers between minimum and maximum number in array 
exist's within the array .

Print 'YES' if numbers exist otherwise print 'NO'(without quotes).

Input:
Integer N denoting size of array
Next line contains N space separated integers denoting elements in array

Output:
Output your answer

Constraints:
1<= N <= 1000
1<= a[i] <= 100

SAMPLE INPUT 
6
4 2 1 3 5 6

SAMPLE OUTPUT 
YES

Time Limit:	1.0 sec(s) for each input file.
*/




// Toatl Time Taken : 0.85s for 8 Test Cases.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class MinMax {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(arr);
        int flag = 0;
        
        for(int i = 0; i < N-1; i++){
            int a = arr[i], b = arr[i+1];
            if(a+1 != b && a != b){
                System.out.println("NO");
                flag = 1;
                System.exit(0);
            }
        }
        if(flag == 0)
            System.out.println("YES");
    }
}