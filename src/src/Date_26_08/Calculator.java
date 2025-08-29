package Date_26_08;

public class Calculator {
    double ar;
    //Method overloading->1 class involved same method name but different arguments
    public void Area(double l,double b){
        ar=l*b;
        System.out.println("Area of Rectangle: "+ar);
    }
    public void Area(double r){
        ar=Math.PI*r*r;
        System.out.println("Area of Circle: "+ar);
    }
    public void Area(double l,double b,double h){
        ar=2*(l*b+b*h+h*l);
        System.out.println("Area of Cuboid: "+ar);
    }
}
