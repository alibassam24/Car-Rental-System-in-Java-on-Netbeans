
package carrentalsystem;
abstract class  Inventory {
    private int model;
    private int no_seats;
    private String register_no;
    private String carName;
    private String carCompany;
    private int pricePerDay;
    private String color; 
    Car c2;

    public int getModel() {
        return model;
    }

    public int getNo_seats() {
        return no_seats;
    }

    public String getRegister_no() {
        return register_no;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public String getColor() {
        return color;
    }

    public Inventory(int model, int no_seats, String register_no, String carName, String carCompany, int pricePerDay, String color, Car c2) {
        this.model = model;
        this.no_seats = no_seats;
        this.register_no = register_no;
        this.carName = carName;
        this.carCompany = carCompany;
        this.pricePerDay = pricePerDay;
        this.color = color;
        this.c2 = c2;
    }
    public abstract double Go_car(double noDays);
    
}
