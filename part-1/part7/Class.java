package part7;
import java.math.BigDecimal;
public class Class {
   public static void main(String[] args){
    // System.out.println("hai");
    Car car = new Car();
    //Car car = null;
    //car.describeCar();
    car.setColour("blue");
    car.setConvertable(true);
    car.setDoors(2);
    car.setMake("bkjbk");
    car.setModel("nexon");
    // car.describeCar();

    // BankAccount account1 = new BankAccount(12345, new BigDecimal("125"), "Bala");
    // account1.setAccountNumber(12345);
    // account1.setCustomerName("Bala");
    // account1.setEmail("bala@bala.com");
    BankAccount account1 = new BankAccount();

    
    // account1.deposit(new BigDecimal("123"));
    System.out.println(account1.balance());
    account1.withdraw(new BigDecimal("123"));
    account1.deposit(new BigDecimal("123.5555"));
    account1.withdraw(new BigDecimal("123.5554"));

    Customer cus = new Customer("bala", 10, "bala@gmail.com");
    System.out.println(cus);

    House red = new House("red"); // red is the reference and the new House(); is the object
    House yellow = red; // yellow is the reference
    System.out.println(red.getColour()); //red
    System.out.println(yellow.getColour()); //red

    yellow.setColour("yellow");

    System.out.println(red.getColour()); // yellow
    System.out.println(yellow.getColour()); // yellow

    House green = new House("green");
    yellow = green; // the reference yellow will hereafter reference to green object 

    System.out.println(red.getColour()); // yellow
    System.out.println(yellow.getColour()); // green
    System.out.println(green.getColour()); // green

    new House("nothing"); //this compiles fine but the created object has no reference so it will automatically collected by garbage collector

    StaticAndInstanceVar instance1 = new StaticAndInstanceVar("FirstInstance", "FirstInstance");
    StaticAndInstanceVar instance2 = new StaticAndInstanceVar("SecondInstance", "SecondInstance");
    instance1.printName(); //name = SecondInstance, instanceName = FirstInstance -- since variable name is a static field it is associated with class and not to instance
    instance2.printName(); //name = SecondInstance, instanceName = SecondInstance
    StaticAndInstanceMethod.add(1,2); // since this is a static method i dont need to create a object
    StaticAndInstanceMethod sub = new StaticAndInstanceMethod();
    sub.sub(2,1); // since sub is a instance method a object must be first created to call that method

    for(int i = 1; i<=4; i++){
      Pojo p = new Pojo(switch(i){
                           case 1 -> "Bala";
                           case 2 -> "Murali";
                           case 3 -> "Krishna";
                           default -> "Anonymous";
                        }
         , i);
      System.out.println(p);
    }

    for(int i = 1; i<=4; i++){
      Record p = new Record(i, switch(i){
                           case 1 -> "Bala";
                           case 2 -> "Murali";
                           case 3 -> "Krishna";
                           default -> "Anonymous";
                        }
         );
      System.out.println(p);
    }

    Record r = new Record(1, "testing"); // the fields are private and final so it is immutable
    System.out.println(r.id()+" "+r.name()); // record has only getters(with no prefix like get)

    WallAreaChallenge chal = new WallAreaChallenge(9,9);
    System.out.println(chal.getArea());

   }
}
