import java.util.*;
 
class TestClass1{
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
            int ans=0;
            int n=s.nextInt();
            int num=n%12;
            if(num==1)
            {
                ans=n+11;
                System.out.println(ans+" WS");
            }
            else if(num==6)
            {
                ans=n+1;
                System.out.println(ans+" WS");
            }
            else if(num==2)
            {
                ans=n+9;
                System.out.println(ans+" MS");
            }
            else if(num==5)
            {
                ans=n+3;
                System.out.println(ans+" MS");
            }
            else if(num==3)
            {
                ans=n+7;
                System.out.println(ans+" AS");
            }
            else if(num==4)
            {
                ans=n+5;
                System.out.println(ans+" AS");
            }
            else if(num==7)
            {
                ans=n-1;
                System.out.println(ans+" WS");
            }
            else if(num==0)
            {
                ans=n-11;
                System.out.println(ans+" WS");
            }
            else if(num==8)
            {
                ans=n-3;
                System.out.println(ans+" MS");
            }
            else if(num==11)
            {
                ans=n-9;
                System.out.println(ans+" MS");
            }
            else if(num==9)
            {
                ans=n-5;
                System.out.println(ans+" AS");
            }
            else if(num==10)
            {
                ans=n-7;
                System.out.println(ans+" AS");
            }
            t--;
        }
    }
}