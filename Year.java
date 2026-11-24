import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Leap Year operation");
        System.out.println("Enter a year number:");
        a = s.nextInt();
        if (a % 2 == 0) {
            System.out.println("Given year is EVEN number:" + a);
        } else {
            System.out.println("Given year is ODD number:" + a);
        }
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Given year is Leap year:" + a);
        } else {
            System.out.println("Given year is Not Leap year:" + a);
        }
    }
}
