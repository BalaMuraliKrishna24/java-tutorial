package part5;

public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("your final score was "+ finalScore);
        }
        //if i need to calculate for different level and different score either i should change the values in the above code or else i need to copy paste the above code block and change the variable name

        boolean newgameOver = true;
        int newscore = 600;
        int newlevelCompleted = 8;
        int newbonus = 100;

        int newfinalScore = newscore;

        if(newgameOver){
            newfinalScore+=(newlevelCompleted*newbonus);
            newfinalScore+=1000;
            System.out.println("your final score was "+ newfinalScore);
        }

        // we can write methods which will be reusable so that we dont need to repeat the code

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 600, 8, 100);
    }

    public static  void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if(gameOver){
            finalScore+=levelCompleted*bonus;
            finalScore+=1000;
            System.out.println(finalScore);
        }

    }
}
