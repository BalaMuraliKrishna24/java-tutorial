package part5;
public class Keywords {
    /*
        https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9
        java has 51 Reserved keyword and 16 contextual keywords
        keywords are reserved for java so it cannot be used for variables 
    */

    public static void main(String[] args) {
        //int int = 5;
        //int boolean = 5; these two declarations will not work since these are all reserved keywords
        // the identifiers should not used reserved keywords(identifiers means the variables, class name and method names are called identifiers)
        //apart from these true and false and null are the other words which cannot be used as a identifier

        /*
        The Expression - an expression computes to a single value
        The Statement - Statements are stand alone units of work
        The Code Blocks - A code blocks is a set of zero, one or more statements usually grouped together in some way to achieve a single goal
        */

        double kilometres = (1000*1.609); // kilometres = (1000*1.609) this is a expression and double kilometres = (1000*1.609); this is a statement
        int highscore = 50;
        if(highscore>25){//highscore>25 this is an expression 
            highscore = 1000+highscore;// 1000+highscore,  highscore = 1000+highscore both are expressions and highscore = 1000+highscore; this is a statement
        }

        int health = 100;

        if((health<25)&&(highscore>1000)){//here there is 3 expressions health<25, highscore>1000 (health<25)&&(highscore>1000)
            highscore = highscore-1000;
        }

    }
}
