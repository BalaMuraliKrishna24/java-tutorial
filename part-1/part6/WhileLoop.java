package part6;

public class WhileLoop {
    public static boolean isEven(int num){
    return num%2==0;
    }

    public static void main(String[] args) {
        int num = 5;
        while (num<20) {
            if(isEven(num))
            System.out.println(num);
            num++;
        }
    }
}
