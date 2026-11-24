class Vehicle{
void honk(){
   System.out.print("beep");
   }
   void displayDetils(){
    System.out.println("Model:26");
    System.out.println("brand:mybrand");
    
   }
}
class Car extends Vehicle{

}
public class Main {
    public static void main(String[] args) {
        
    
   Car c=new Car(); 
   c.honk();
   c.displayDetils();
    }
}
