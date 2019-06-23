/* ---------- Ali and Helping innocent people

Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format

The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format

Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)

SAMPLE INPUT 
12X345-67

SAMPLE OUTPUT 
invalid

Explanation
The tag is invalid because the sum of first and second digit of it is odd (also the sum of 4'th and 5'th, 5'th and 6'th and 8'th and 9'th are odd).

Time Limit:	1.0 sec(s) for each input file.
*/



import java.util.Scanner;

class Ali {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        char ch=st.charAt(2);
        int cnt=0;
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='Y'){
            System.out.print("invalid");
            System.exit(0);
        }
        
        for(int i=0;i<9;i++){
            if(i==1||i==5||i==8){
                i+=1;
                continue;
            }
            else if((st.charAt(i)+st.charAt(i+1))%2!=0){
                System.out.print("invalid");
                cnt=1;
                System.exit(0);
            }
        }
        
        if(cnt==0)
            System.out.print("valid");
    }
}