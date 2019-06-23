/*RESULT:  Accepted
Score

10.0

 
Time (sec)

2.30892

 
Memory (KiB)

3137272

 
Language

Java 8*/




import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass5{
    public static void main(String args[] ) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int tcases=Integer.parseInt(br.readLine());
         while(tcases>0)
         {
             int seatNum=Integer.parseInt(br.readLine());
             switch(seatNum%12){
                 case 0:
                     int oppNum=1;
                     String seatFace="WS";
                     if(seatNum!=12)
                     {
                         System.out.print(seatNum-11+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                case 1:
                     oppNum=12;
                     seatFace="WS";
                     if(seatNum!=1)
                     {
                         System.out.print(seatNum+11+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                case 2:
                     oppNum=11;
                     seatFace="MS";
                     if(seatNum!=2)
                     {
                         System.out.print(seatNum+9+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                    case 3:
                     oppNum=10;
                      seatFace="AS";
                     if(seatNum!=3)
                     {
                         System.out.print(seatNum+7+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                    case 4:
                     oppNum=9;
                      seatFace="AS";
                     if(seatNum!=4)
                     {
                         System.out.print(seatNum+5+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                    case 5:
                     oppNum=8;
                      seatFace="MS";
                     if(seatNum!=5)
                     {
                         System.out.print(seatNum+3+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                    case 6:
                     oppNum=7;
                      seatFace="WS";
                     if(seatNum!=6)
                     {
                         System.out.print(seatNum+1+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                    case 7:
                     oppNum=6;
                      seatFace="WS";
                     if(seatNum!=7)
                     {
                         System.out.print(seatNum-1+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                    case 8:
                     oppNum=5;
                      seatFace="MS";
                     if(seatNum!=8)
                     {
                         System.out.print(seatNum-3+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                    case 9:
                     oppNum=4;
                      seatFace="AS";
                     if(seatNum!=9)
                     {
                         System.out.print(seatNum-5+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                    case 10:
                     oppNum=3;
                      seatFace="AS";
                     if(seatNum!=1)
                     {
                         System.out.print(seatNum-7+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                    case 11:
                     oppNum=2;
                      seatFace="MS";
                     if(seatNum!=11)
                     {
                         System.out.print(seatNum-9+" "+seatFace+"\n");
                     }
                     else{
                         System.out.print(oppNum+" "+seatFace+"\n");
                     }
                    break;
                
             }
             tcases--;
         }
    }
}