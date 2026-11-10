package part7;

public class StaticAndInstanceVar {
    public static String name;
    public String instanceName;
    public StaticAndInstanceVar(String name, String instanceName){
        StaticAndInstanceVar.name = name;
        this.instanceName = instanceName;
    }
    public void printName(){
        System.out.println(name+" "+instanceName);
    }
}
