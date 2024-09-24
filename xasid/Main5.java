package xasid;

public class Main5 {
    public static void main(String[] args) {
        vehicle vii=new vehicle("toyoto",55,"1hm45","black");

        System.out.println("public brand:"+ vii.brand);
        System.out.println("protected brand:" + vii.brand);

         car wii=new car("BMW",89,"90pmo0","white","last model");

         wii.displayCarInfo();
         wii.displaySpeed();
    }
}
