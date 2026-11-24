 import java.util.Scanner;
 public class Swap{
   public static void main(String[] args){
    int a,b;
    Scanner s=new Scanner(System.in);
    System.out.println("SWAP operation");
    System.out.println("Enter firsy number A:");
    a=s.nextInt();
    System.out.println("Enter Second number B:");
    b=s.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("SWAP operation of first number A:"+a);
    System.out.println("SWAP operation of second number B:"+b);
   }
 }