class Bankaccont{
    private String ahn="Ameen";
    private double ahb=1000.0;
    void setahb(double a){
       if(a==0){
        System.out.println("Invalid deposite ammount");
       }
       else{
        ahb=ahb+a;
       }
    }
    void getahb(){
        System.out.println("Account Holder:"+ahn);
        System.out.println("Amount Balance:"+ahb);
    }
}
public class Validation {
    public static void main(String[] args) {
        Bankaccont b=new Bankaccont();
        b.getahb();
        b.setahb(100.0);
        b.getahb();

    }
}
