package part6;

public class Sum3and5 {
    
    public static void main(String[] args) {
        int countOfSum = 0;
        int sum = 0;
        for(int i = 0; i<1000; i++){
            if((i%3==0)&&(i%5==0)){
                sum+=i;
                countOfSum++;
            }
            if(countOfSum==5){
                break;
            }
        }
        System.out.println(sum);
    }
}
