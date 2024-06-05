
package carrentalsystem;
public class Car {
     private String name;
    private String model;
    private String colour;
    private String speed;
    private int id;
    
    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getSpeed() {
        return speed;
    }

    public int getId() {
        return id;
    }

    public Car(String name, String model, String speed, int id) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.id = id;
    }
}