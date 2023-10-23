public class Moto extends Car{
    int wheel ;


    Moto(String model, String color, double price, int wheel) {
        super(model,color,price);
        this.wheel = wheel;
    }
    @Override
    void drive() {
        System.out.println("drive the moto!");
    }

}
