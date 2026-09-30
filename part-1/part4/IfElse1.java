public class IfElse1 {

    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien==false) //the statements goes to the next line, it is perfectly valid for if statements
            System.err.println("It is not an alien");
        if(isAlien==true); //the statement end here
            System.out.println("It is not an alien");

        boolean isHuman = true;
        if(!isHuman)//only the one line after if statemnet is valid to be a if statement block other than that all other are not a part of if then statement
            System.out.println("It is not a human");
            System.out.println("It should be an alien");

        if(true){
            System.out.println("we are inside if thencode bloack");
            System.out.println("multiple line can be exectuted inside a code block");
        }
    }
    
}
