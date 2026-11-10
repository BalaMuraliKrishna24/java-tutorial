package part7;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int doors;
    private boolean convertable;
    private String string;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make == null) make = "unknown";
        String check = make.toLowerCase();
        switch (check) {
            case "mahindra", "tata", "renoult", "maruthi" -> this.make = make;
            default -> this.make = "unsupported";
        }
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void describeCar(){
        System.out.println("Make " + make + "\n"
        + "Model " + model + "\n"
        + "Colour " + colour + "\n"
        + "Doors " + doors + "\n"
        +(convertable?"Convertable":" ")
    );
    }

}
