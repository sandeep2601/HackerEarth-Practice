import java.util.Scanner;

class EMaze {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int len=st.length(),left=0,right=0,up=0,down=0;
        for(int i=0;i<len;i++){
            if(st.charAt(i)=='L')
                left++;
            else if(st.charAt(i)=='R')
                right++;
            else if(st.charAt(i)=='U')
                up++;
            else
                down++;
        }
       
        right-=left;
        System.out.print(right+" ");
        
        up-=down;
        System.out.println(up);
    }
}
