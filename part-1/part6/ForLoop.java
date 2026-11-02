package part6;

public class ForLoop {
    public static double calculateInterest(double amount, double rate){
        return amount * (rate/100);
    }

    public static void main(String[] args) {
        for(double i = 7.5; i<=10; i+=0.25){
            System.out.println(calculateInterest(100, i));
        }
    }
}
