class Student{
private String name;
private int roll;
void setname(String s){
    name=s;
}
void getname(){
    System.out.println(name);

}
void setroll(int y){
    roll= y;
}
void getroll(){
    System.out.println(roll);
    
}
}

public class Encap {
    public static void main(String[] args) {
    Student si=new Student();
    si.setname("mmm");
    si.getname();
    si.setroll(24);
    si.getroll();
    }  
}
 