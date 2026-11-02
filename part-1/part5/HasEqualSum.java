package part5;
public class HasEqualSum {
    public static boolean HasEqualSum(int a, int b, int c){
        return  a+b==c;
    }
    public static void main(String[] args) {
        HasTeen hasTeen = new HasTeen();
        boolean isTeen = hasTeen.hasTeen(12, 12, 20);
        boolean result = HasEqualSum(1, -1, 0);
        System.out.println(isTeen);
    }
}
