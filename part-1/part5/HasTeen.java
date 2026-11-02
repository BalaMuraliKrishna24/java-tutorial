package part5;

public class HasTeen {
    public static boolean hasTeen(int a, int b, int c){
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private static boolean isTeen(int z){
        return z>12 && z<20;
    }
}
