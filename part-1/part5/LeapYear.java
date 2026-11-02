package part5;

public class LeapYear {
    public static void main(String[] args) {
        
    }
    
    public static boolean isLeapYear(int number){

        if(number<1 || number>9999){
            return false;
        }
       
        return (number%4==0 && number%100!=0 || number%400==0);
    }
}
