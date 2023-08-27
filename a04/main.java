class Account{
    protected long Acc_No;
    protected String C_Name;
    private long Contact_No;
    Account(long acc,String name,long num){
        this.Acc_No = acc;
        this.C_Name = name;
        this.Contact_No = num;
    }
    Account(Account Ac){
        this.Acc_No = Ac.Acc_No;
        this.C_Name = Ac.C_Name;
        this.Contact_No = Ac.Contact_No;
    }
    public void show(){
        System.out.println("Customer Name : " + C_Name);
        System.out.println("Account Number : " + Acc_No);
        System.out.println("Contact Number : " + Contact_No);
    }
}
class Saving_Ac extends Account{
    private double ROI;
    private double Acc_Balance;
    Saving_Ac(long acc,String name,long num,double roi,double balance){
        super(acc,name,num);
        this.ROI = roi;
        this.Acc_Balance = balance;
    }
    Saving_Ac(Account Ac,double roi,double balance){
        super(Ac);
        this.ROI = roi;
        this.Acc_Balance = balance;
    }
    public void showdata(){
        super.show();
        System.out.println("Account Balance : " + Acc_Balance);
        System.out.println("Return on Investment : " + ROI);
    }
}
class Current_Ac extends Account{
    private double Acc_Balance;
    private double Min_Balance;
    Current_Ac(long acc,String name,long num,double accBal,double minBal){
        super(acc,name,num);
        this.Acc_Balance = accBal;
        this.Min_Balance = minBal;
    }
    Current_Ac(Account Ac,double accBal,double minBal){
        super(Ac);
        this.Acc_Balance = accBal;
        this.Min_Balance = minBal;
    }
    public void showdata(){
        super.show();
        System.out.println("Account Balance = " + Acc_Balance);
        System.out.println("Minimum Balance = " + Min_Balance);
    }
}
class TD_Ac extends Account{
    private double Principal;
    private double Term;
    private double ROI;
    private double Maturity_Balance;
    TD_Ac(long acc,String name,long num, double p,double t,double roi,double mBal){
        super(acc,name,num);
        this.Principal = p;
        this.Term = t;
        this.ROI = roi;
        this.Maturity_Balance = mBal;
    }
    TD_Ac(Account Ac,double p,double t,double roi,double mBal){
        super(Ac);
        this.Principal = p;
        this.Term = t;
        this.ROI = roi;
        this.Maturity_Balance = mBal;
    }
    public void showdata(){
        super.show();
        System.out.println("Principal : " + Principal);
        System.out.println("Term : " + Term);
        System.out.println("Return of Investment : " + ROI);
        System.out.println("Maturity Balance : " + Maturity_Balance);
    }
}
class Main{
    public static void main(String[] args){
        Account Ac1 = new Account(100000001L,"Riligious Name1",9711223344L);
        Account Ac2 = new Account(100000002L,"Riligious Name2",9722334455L);
        Account Ac3 = new Account(100000003L,"Riligious Name3",9733445566L);
        Account Ac4 = new Account(100000004L,"Riligious Name4",9744556677L);
        Saving_Ac Ac5 = new Saving_Ac(100000005L,"Riligious Name5",9755667788L,23,500);
        Current_Ac Ac6 = new Current_Ac(100000006L,"Bokachoda Name6",9766778899L,100,2);
        TD_Ac Ac7 = new TD_Ac(100000007L,"Riligious Name7",9777889900L,12,13,14,15);
        Ac1.show(); System.out.println("*".repeat(30));
        Ac2.show(); System.out.println("*".repeat(30));
        Ac3.show(); System.out.println("*".repeat(30));
        Ac4.show(); System.out.println("*".repeat(30));
        Ac5.showdata(); System.out.println("*".repeat(30));
        Ac6.showdata(); System.out.println("*".repeat(30));
        Ac7.showdata(); System.out.println("*".repeat(30));
        // jugnu don't know how to write compute() to capitalize Banks
    }
}
// this code inherits from jay-neo
