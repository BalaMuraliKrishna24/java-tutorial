package part6;

import java.util.Scanner;

public class ReadingUserInput {
    public static int readingFromScanner(){

        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int age = 0;
        do{
        System.out.println("Vanakam da pulla, nee epo porandha crt ah sollu ");
        String yob = sc.nextLine();
        try{
        int yearOfBirth = Integer.parseInt(yob);
        age = calculateAge(yearOfBirth);
        
        check=age<0||age>125 ? true : false;
        } catch(NumberFormatException e){
            System.out.println("characters not allowed");
            check = true;
        }
        
        }while(check);
        
        sc.close();
        return age;

    }

    public static int calculateAge(int yearOfBirth){
        int currentYear = 2026;
        
        return currentYear-yearOfBirth;
    }

    public static void main(){
       System.out.println(readingFromScanner());
    }
}
