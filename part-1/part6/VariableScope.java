package part6;

public class VariableScope {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        i=10; //i declared in for loop will not be accessible outside the loop

        if(true){
            int j = 10;
        }
        j=20; //j declared in if statement will not be accessible outside that scope

        int k = 0;
        switch (k) {
            case 1:
                System.out.println("1");
                int i = 0;
                break;
        
            default:
                System.out.println("2");
                i = 1; // in switch you can access the variable from anither case block
                break;
        }
        
    }
}
