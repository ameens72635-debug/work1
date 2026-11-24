import java.util.Scanner;
public class Calculator {
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a,x,y;
    System.out.println("OPERATIONS");
    System.out.println("Enter first number:");
     x=s.nextInt();
    System.out.println("Enter second number:");
    y=s.nextInt();
    System.out.println("1 Addition");
    System.out.println("2 Substraction");
    System.out.println("3 Multiplication");
    System.out.println("4 Division");
    System.out.println("Enter option number");
    a=s.nextInt();
    switch (a) {           
    case 1:
    System.out.println("Addion operation:"+(x+y));
        break;
    case 2:
    System.out.println("Substraction operation:"+(x-y));
        break;
    case 3:
    System.out.println("Multiplication operation:"+(x*y));
        break;
    case 4:
    System.out.println("Division operation:"+(x/y));
        break;
    default:System.out.println("Enter vaild option");
        break;
 }
}
}