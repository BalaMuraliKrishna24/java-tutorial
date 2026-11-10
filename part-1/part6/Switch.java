package part6;

public class Switch {
    public static void checkSwitch(int num){
        switch(num){
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;

            case 4: case 5:
                System.out.println(num);
                break;
            // default:
            //     System.out.println("none");
        }
    }

    public static String getQuarter(String month){
        switch(month){
            case "January":
            case "February":
            case "March":
                return "1";

            case "April": case "May" : case "June" :
                return "2";
            case "July": case "August" : case "September" :
                return "3";

            case "October", "Novembemer", "December" :
                return "4";

            // default:
            //     return"none";
        }
        return "none";
    }

    public static void main(String[] args) {
        checkSwitch(5);
        System.out.println(getQuarter("Octobr"));
    }
}
