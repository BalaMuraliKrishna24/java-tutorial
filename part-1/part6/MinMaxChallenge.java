package part6;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void minMax(){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        do{
            try{
            System.out.println("Enter a number to continue or Enter a Character to quit");
            String input = sc.next();
            int number = Integer.parseInt(input);
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        catch(NumberFormatException ne){
            check = false;
        }
        }while(check);
        if(min == Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            System.out.println("No valid data entered");
        }
        else{
        System.out.println("The min value is "+min);
        System.out.println("The max value is "+max);
        }
    }
    public static void main(String[] args) {
        minMax();
    }
}
