package part7;

public class Pojo { // POJO is generally refer as a class which only has a instance field with minimal or no methods
                    // POJO is also called as a java bean, DTO, it can be refered to as database entity
    private String name;
    private int id;

    public Pojo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "Pojo [name="+name+
        " , id="+id+
        "]";
    }
}
