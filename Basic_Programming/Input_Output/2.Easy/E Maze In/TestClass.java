import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
     
//int arr[a][b]=new int[1][1];
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();  
        int l=0,r=0;
        for(int i=0;i<name.length();i++)
        {
            char c=name.charAt(i);
            if(c=='L')
                l--;
             if(c=='R')
                l++;
             if(c=='U')
                r++;
             if(c=='D')
                r--;
                
        }
        System.out.print(l+" "   );
        System.out.print(r+"\t");
 
     
 
    }
}