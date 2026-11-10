package part6;

import java.util.Scanner;

public class UserInputChallenge {

    static double calculateSum(){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        do{
            System.out.println("Enter the "+count+" number");
            String str = sc.next();
            try{
            sum+=Double.parseDouble(str);
            count++;
            }catch(NumberFormatException e){
                System.out.println("Enter numbers alone");
            }
        }while(count<6);
        sc.close();
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(calculateSum());
    }
    
}
