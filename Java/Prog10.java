class ShapeArea{
    void area(double l,double b){
        System.out.println("Area of the sqaure is: "+l*b);
    }
    void area(double r){
        System.out.println("Area of the circle is: "+r*r*Math.PI);
    }
    void area(double a,double b,double c){
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the circle is: "+area);
    }
}
public class Prog10 {
    public static void main(String args[]){
        ShapeArea shape=new ShapeArea();
        shape.area(12,3);
        shape.area(12);
        shape.area(12,13,14);
    }
    
}
