class Person{
    String name="Ameen";
    void displayPerson(){
        System.out.println("Employee Name:"+name);
    }
}
class Employee extends Person{
      int employeeId=254;
      String department="Devloper";
        
      void displayemployeeDe(){
        System.out.println("Employee id:"+employeeId);
        System.out.println("Employee Department:"+department);
      }
}
class Maneger extends Employee{

}
public class Comp  {
    public static void main(String[] args) {
        Maneger m=new Maneger();
        m.displayPerson();
        m.displayemployeeDe();
    }
}
