import java.util.Scanner;

class Seat {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int seat=1,i,j;
        int arr[][]=new int[18][6];
        
        for(int row=0;row<18;row++){
            if(row%2==0)
                for(int col=0;col<6;col++)
                    arr[row][col]=seat++;
            else
                for(int col=5;col>=0;col--)
                    arr[row][col]=seat++;
        }
        
       for(int l=0;l<T;l++){
            seat=s.nextInt();
            
            A:
            for(i=0;i<18;i++)
                for(j=0;j<6;j++)
                    if(seat==arr[i][j]){
                        seat=j;
                        break A;
                    }
            
            if(i%2==0){
                if(seat==0 || seat==5)
                    System.out.print(arr[i+1][seat]+" WS");
                else if(seat==1 || seat==4)
                    System.out.print(arr[i+1][seat]+" MS");
                else if(seat==2 || seat==3)
                    System.out.print(arr[i+1][seat]+" AS");
            }
            else{
                if(seat==0 || seat==5)
                    System.out.print(arr[i-1][seat]+" WS");
                else if(seat==1 || seat==4)
                    System.out.print(arr[i-1][seat]+" MS");
                else if(seat==2 || seat==3)
                    System.out.print(arr[i-1][seat]+" AS");
            }
            System.out.println();   
        }
    }
}