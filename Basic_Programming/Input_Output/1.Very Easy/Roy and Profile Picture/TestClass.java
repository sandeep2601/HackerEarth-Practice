/*  --------   Roy and Profile Picture
Tag(s): Ad-Hoc, Basic Programming, Implementation, Very-Easy

Roy wants to change his profile picture on Facebook. Now Facebook has some restriction over the dimension of picture that we can upload.
Minimum dimension of the picture can be L x L, where L is the length of the side of square.

Now Roy has N photos of various dimensions.
Dimension of a photo is denoted as W x H 
where W - width of the photo and H - Height of the photo

When any photo is uploaded following events may occur:

[1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
[2] If width and height, both are large enough and 
(a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
(b) else user is prompted to crop it. Print "CROP IT" in this case.

(quotes are only for clarification)

Given L, N, W and H as input, print appropriate text as output.

Input:
First line contains L.
Second line contains N, number of photos.
Following N lines each contains two space separated integers W and H.

Output:
Print appropriate text for each photo in a new line.

Constraints:
1 <= L,W,H <= 10000
1 <= N <= 1000

SAMPLE INPUT 
180
3
640 480
120 300
180 180

SAMPLE OUTPUT 
CROP IT
UPLOAD ANOTHER
ACCEPTED

Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
    	    int L = Integer.parseInt(line);
			line = br.readLine();
    	    int N = Integer.parseInt(line);
			int X[][]=new int[N][2];
			for(int i=0;i<N;i++){
				String input=br.readLine();
				String[] tokens = input.split(" ");
				X[i][0]=Integer.parseInt(tokens[0]);
				X[i][1]=Integer.parseInt(tokens[1]);	
			}
			for(int i=0;i<N;i++){
				if(X[i][0]<L||X[i][1]<L){
					System.out.println("UPLOAD ANOTHER");
				}
				else if(X[i][0]>=L&&X[i][1]>=L){
					if(X[i][0]==X[i][1])
						System.out.println("ACCEPTED");
					else
						System.out.println("CROP IT");
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
    }
}