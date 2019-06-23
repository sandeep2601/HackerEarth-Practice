/*			Cipher

Indian army is going to do a surprise attack on one of its enemies country. The President of India, 
the Supreme Commander of the Indian Army will be sending an alert message to all its commanding centers.
As enemy would be monitoring the message, Indian army is going to encrypt(cipher) the message using 
basic encryption technique. A decoding key 'K' (number) would be sent secretly.

You are assigned to develop a cipher program to encrypt the message. Your cipher must rotate every 
character in the message by a fixed number making it unreadable by enemies.

Given a single line of string 'S' containing alpha, numeric and symbols, followed by a number 
'0<=N<=1000'. Encrypt and print the resulting string.

Note: The cipher only encrypts Alpha and Numeric. (A-Z, a-z, and 0-9) . All Symbols, such as - , ; %,
remain unencrypted.


SAMPLE INPUT 
All-convoYs-9-be:Alert1.
4

SAMPLE OUTPUT 
Epp-gsrzsCw-3-fi:Epivx5.


Explanation

First line contains the string to convert. S
Second line contains the number, encrypt key. K
A becomes E, Y becomes C, 9 becomes 3,
-, . unchanged.

Time Limit:	2.0 sec(s) for each input file.
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;

class Cipher {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int k = Integer.parseInt(br.readLine());
        char[] ch = st.toCharArray();
        int len=ch.length;
        for(int i=0;i<len;i++){
            if(ch[i]>47 && ch[i]<=57){
                int d = k % 10;
                if(58 - (int)ch[i] < d){
                    d -= (58 - (int)ch[i]);
                    ch[i] = (char)(47+d+1);
                }
                else
                    ch[i] = (char)(ch[i] + d);
            }
            else if(ch[i]>64 && ch[i]<=90){
                int d = k % 26;
                if(90 - (int)ch[i] < d){
                    d -= (90 - (int)ch[i]);
                    ch[i] = (char)(64+d);
                }
                else
                    ch[i] = (char)(ch[i] + d);
            }
            else if(ch[i]>96 && ch[i]<=122){
                int d = k % 26;
                if(122 - (int)ch[i] < d){
                    d -= (122 - (int)ch[i]);
                    ch[i] = (char)(96+d);
                }
                else
                    ch[i] = (char)(ch[i] + d);
            }
            System.out.print(ch[i]);
        }
    }
}