class Discount{
    private double SalesAmount = 0;
    private double Discount = 0;
    Discount(double s){
        this.SalesAmount = s;
    }
    public void compute1(){
        if(this.SalesAmount < 10000) this.Discount = 0;
        else if(this.SalesAmount >= 10000 && this.SalesAmount < 20000) this.Discount = this.SalesAmount * 0.03;
        else if(this.SalesAmount >= 20000 && this.SalesAmount < 40000) this.Discount = this.SalesAmount * 0.05;
        else if(this.SalesAmount >= 40000) this.Discount = this.SalesAmount * 0.1;
    }
    public void compute2(){
        this.Discount = this.SalesAmount < 10000 ? 0 :
                (
                    this.SalesAmount >= 10000 && this.SalesAmount < 20000 ?
                        this.SalesAmount * 0.03 :
                            (
                                this.SalesAmount >= 20000 && this.SalesAmount < 40000 ?
                                    this.SalesAmount * 0.05 :
                                        this.SalesAmount * 0.1
                            )
                );
    }
    public void display(){
        System.out.print("Sales Amount = " + SalesAmount);
        System.out.println(" and Discount = " + Discount);
    }
    public static void main(String[] args){
        Discount D1 = new Discount(14000);
        Discount D2 = new Discount(33000);

        D1.compute1();
        D1.display();
        D2.compute2();
        D2.display();
    }
}
