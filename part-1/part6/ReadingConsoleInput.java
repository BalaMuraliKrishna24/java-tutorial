package part6;

import java.util.Scanner;

public class ReadingConsoleInput {
    public static String readingFromScanner(){
        int currentYear = 2026;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vanakam da pulla, nee epo porandha(scanner) ");
        String yob = sc.nextLine();
        int yearOfBirth = Integer.parseInt(yob);
        System.out.println("Pulla un vayasu : "+(currentYear-yearOfBirth));
        sc.close();
        return yob;

    }

    public static String readingFromConsole(){
        int currentYear = 2026;
        String yob = System.console().readLine("Vanakam da pulla, nee epo porandha(console) ");
        int yearOfBirth = Integer.parseInt(yob);
        System.out.println("Pulla un vayasu : "+(currentYear-yearOfBirth));
        return yob;
    }

    public static void main(String[] args) {
        try{
        System.out.println(readingFromConsole());
        }catch(NullPointerException e){
        System.out.println(readingFromScanner());
        }
        //System.out.println(name);
    }


}
