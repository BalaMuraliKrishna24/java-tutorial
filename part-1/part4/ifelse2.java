public class ifelse2 {
    public static void main(String[] args) {
        int topScore = 85;

        if(topScore==100){
            System.out.println("you got the top score");
        }
        else if(topScore>80 && topScore<90)
            System.out.println("you scored second rank");
        else if(topScore>60&&topScore<70){
            System.out.println("you just passed the exam");
        }
        else
            System.out.println("you failed the exam");

        int secondTop=80;
        if(secondTop>topScore)
            System.out.println("you got the second rank");

        if(secondTop>topScore && topScore<100){
            System.out.println("you got first rank");
        }
    }
}
