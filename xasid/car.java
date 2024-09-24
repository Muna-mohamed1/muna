package xasid;


public class car extends vehicle {
    public String model;


    public car(String brand, int speed, String vin, String color, String model) {
       super(brand, speed, vin, color);
       this.model=model;
    }


    public void displayCarInfo() {
        displayInfo();
        System.out.println("Model: " + model);
    }
}

