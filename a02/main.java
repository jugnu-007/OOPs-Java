class Arithmetic{
    private int i;
    private float f;
    private char c;
    private double d;
    Arithmetic(int ii,float ff,char cc,double dd){
        this.i = ii;
        this.f = ff;
        this.c = cc;
        this.d = dd;
    }
    public void add(int ii,double dd){
        this.i += ii;
        this.d += dd;
    }
    public void add(int ii,float ff,double dd){
        this.i += ii;
        this.f += ff;
        this.d += dd;
    }
    public void add(float ff,int ii,double dd){
        this.f += ff;
        this.i += ii;
        this.d += dd;
    }
    public Arithmetic add(Arithmetic AA){
        Arithmetic A = new Arithmetic(0,0,'a',0);
        A.i = this.i + AA.i;
        A.f = this.f + AA.f;
        A.c = this.c;
        A.d = this.d + AA.d;
        return A;
    }
    public void display(){
        System.out.print("integer = " + i);
        System.out.print(" float = " + f);
        System.out.print(" char = " + c);
        System.out.println(" double = " + d);
    }
    public static void main(String[] args){
        Arithmetic A1 = new Arithmetic(2,3.5f,'r',9.324);
        Arithmetic A2 = new Arithmetic(3,5.3f,'y',44.2);
        System.out.println("Initially A1 A2");
        A1.display();
        A2.display();

        System.out.println("For A1 :");;
        A1.add(4,3.90);
        A1.display();
        A1.add(5,5.04f,2);
        A1.display();
        A1.add(8.9f,3,12.9);
        A1.display();

        System.out.println("For A2 :");
        A2.add(2f,3,4);
        A2.display();
        A2.add(5,6f,7.301);
        A2.display();
        A2.add(4.9f,10,3);
        A2.display();

        System.out.println("For A1 A2 A3 :");
        Arithmetic A3 = A2.add(A1);
        A1.display();
        A2.display();
        A3.display();
    }
}


// this code inherits from jay-neo
