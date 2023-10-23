public class Bike extends Car {

    Bike(String model, String color, double price) {
        super(model, color, price);
    }


    @Override
    void drive(){
        System.out.println("ride the bike");
    }


}
