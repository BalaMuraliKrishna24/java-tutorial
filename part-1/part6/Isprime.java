package part6;

public class Isprime {

    private static boolean isPrime(int number){
        if(number<0){
            return false;
        }
        if(number == 0 || number == 1){
            return false;
        }

        for(int i = 2; i<=number/2; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int primeCount = 0;
        for(int i = 1; i<100; i++){
            if(isPrime(i)){
                primeCount++;
                System.out.println(i);
            }
            if(primeCount==3){
                break;
            }
        }
    }
    
}
