class Shape{
    protected double side;
    Shape(){
        // User defind default constructor for subclasses
    }
    Shape(double s){
        this.side = s;
    }
    public double get(){
        return side;
    }
    public void put(double s){
        this.side = s;
    }
    public double calc_area(){
        System.out.println("This code inherits from jay-neo");
        return 0;
    }
}
class Square extends Shape{
    private double side;
    Square(double s){
        this.side = s;
    }
    public double get(){
        return side;
    }
    public void put(double s){
        this.side = s;
    }
    public double calc_area(){
        return Math.round(side*side*100.0)/100.0;
    }
}
class Rectangle extends Shape{
    private double length;
    private double breadth;
    Rectangle(double l,double b){
        this.length = l;
        this.breadth = b;
    }
    public double getLenght(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void putLenght(double l){
        this.length = l;
    }
    public void putBreadth(double b){
        this.breadth = b;
    }
    public double calc_area(){
        return Math.round(length*breadth*100.0)/100.0;
    }
}
class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    Triangle(double a,double b,double c){
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }
    Triangle(double a){
        this.side1 = a;
        this.side2 = a;
        this.side3 = a;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public void putSide1(double a){
        this.side1 = a;
    }
    public void putSide2(double b){
        this.side2 = b;
    }
    public void putSide3(double c){
        this.side3 = c;
    }
    public double calc_area(){
        double S = (side1 + side2 + side3);
        return Math.round(Math.sqrt(S * (S-side1) * (S-side2) * (S-side3)) * 100.0)/100.0;
    }
}
class Main{
    public static void main(String[] args){
        Shape sh1 = new Shape(2);
        Square sq1 = new Square(5);
        Rectangle rec1 = new Rectangle(3,4);
        Triangle tri1 = new Triangle(4);
        Triangle tri2 = new Triangle(2,3,4);
        System.out.println("For Square 1, Area : " + sh1.calc_area());
        System.out.println("For Rectrinagle 1, Area : " + rec1.calc_area());
        System.out.println("For Triangle 1, Area : " + tri1.calc_area());
        System.out.println("For Triangle 2, Area : " + tri2.calc_area());

        System.out.println("For Square 1, Side :" + sq1.get());
        sq1.put(6);
        System.out.println("For Square 1, Side :" + sq1.get());
        System.out.println("For Square 1, Area :" + sq1.calc_area());
    }
}
