package part5;

public class MethodOverloading {
    public double convertToCentimetres(int foot, int inches){
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.main(new String[]{"hai"});
        return methodOverloading.convertToCentimetres((foot*12)+inches);
    }

    public double convertToCentimetres(int inches){
        return inches*2.54;
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.convertToCentimetres(6,0));
    }
}
