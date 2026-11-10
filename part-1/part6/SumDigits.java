package part6;

public class SumDigits {

    public static int digitSum(int num){
        if(num<0){
            return -1;
        }
        int sum = 0;
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(-1125));
    }
    
}
