package part5;

public class Methods {
    public static int calculateAge(int yearOfBirth){
        return 2026-yearOfBirth;
    }
    public static void main(String[] args) {
        System.out.println(calculateAge(2002));
        String[] str = {"hai", "hello"};
        main(str);
    }

    public static void main(String str){
        System.out.println(str);
    }

    //some programming languages call a method that returns a value is a function and a method that doesnt return a value is called a procedure
}
