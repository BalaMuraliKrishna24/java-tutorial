package part7;

public class Dog extends Animal {
    private String tailShape;
    private String earShape;

    public Dog(String type, double weight, String tailShape, String earShape){
        super(type, weight<15 ? "small" : weight<35?"medium":"large", weight);
        this.tailShape = tailShape;
        this.earShape=earShape;
    }
    
    public Dog(String type, double weight){
        this(type, weight, "curled", "perky");
    }

    public Dog(){
        super("Mutt", "Big", 50);
    }

    @Override
    public String toString() {
        return "Dog [tailShape=" + tailShape + ", earShape=" + earShape + "]" + super.toString();
    }
    
    public void makeNoise(){
        super.makeNoise();
    }
    
    @Override 
    public void move(String speed){
        super.move(speed);
        System.out.println("Dogs runs, wag tails");
    }
    
}

