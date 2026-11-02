package part5;

public class AreaCalculator {

    public static double area(double radius){
        return 3.14*radius*radius;
    }
    public static double area(double a, double b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(2,4));
    }
}
