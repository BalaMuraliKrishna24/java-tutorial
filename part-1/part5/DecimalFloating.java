package part5;

public class DecimalFloating {
    public static boolean decimalPointThree(float number1, float number2){
        boolean result = false;

            number1*=1000;
            number2*=1000;
            result=(int)number1 == (int)number2;
        return result;
    }

    public static void main(String[] args) {
        boolean result = decimalPointThree(-3.123f, 3.123f);
        System.out.println(result);
    }
}
