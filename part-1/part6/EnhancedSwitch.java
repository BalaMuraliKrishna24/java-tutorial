package part6;

public class EnhancedSwitch {
    public static void checkSwitch(int num){
        int one = switch(num){
            case 1 -> 1;
            

            case 2 -> 2;

            case 3 -> 3;

            case 4, 5 -> {
                System.out.println(num);
                yield 4/5;
            }
            default -> 10;
        };
        System.out.println(one);
    }

    public static String getQuarter(String month){
        String res = switch(month){
            case "January",  "February", "March" ->  "1";

            case "April", "May", "June" ->  "2";
            case "July", "August", "September" ->  "3";

            case "October", "Novembemer", "December" -> {
                System.out.println("Testing break");
            
                yield "4";
                
            }

            default-> {
                System.out.println("you are worng");
                yield "wrong";
        }
        };
        return res;
    }

    public static void main(String[] args) {
        checkSwitch(10);
        System.out.println(getQuarter("Aprl"));
    }
}
