package HackerRank;
class Customer{
    private int customerId;
    double billAmount;
    public Customer(){
        this.customerId++;
    }
    public void printDetails(){
        System.out.println(this.customerId);
    }

}


public class RegularCustomer extends Customer {
    private int loyalPoints;

    public RegularCustomer(double billAmount,int loyalPoints){
        this.loyalPoints=loyalPoints;
        this.billAmount=billAmount;
    }
    public void calculateBill(){
        if(this.loyalPoints>500){
            this.billAmount=this.billAmount-(this.billAmount*0.10);

        }
        else{
            this.billAmount=this.billAmount-(this.billAmount*0.08);
        }
    }
    public void printDetails(){
        super.printDetails();
        System.out.println(this.billAmount);
    }
    public static void main(String[] args) {
        RegularCustomer customerRef=new RegularCustomer(5000.00, 500);
        customerRef.calculateBill();
        customerRef.printDetails();
    }
}