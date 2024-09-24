package xasid;

public class vehicle {
    public String brand;
    protected int speed;
    private String vin;
    String color;


    public vehicle(String brand, int speed,String vin, String color){
    this.brand = brand;
    this.speed = speed;
    this.vin=vin;
    this.color=color;

    }


    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("vin:" + vin);
        System.out.println("color: " + color);
    }


    private void displayVIN() {
        System.out.println("vin:"+vin);
    }


    protected void displaySpeed()
    {
        System.out.println("speed:" +speed);
    }
}

