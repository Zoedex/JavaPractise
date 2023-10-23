public abstract class Car {
    String make;
    String model;
    String color;
    int year;
    double price;

    void setModel(String model) {
        this.model = model;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(double price) {
        this.price = price;

    }

    Car(String make, String model, String color, int year, double price){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    Car(String model, String color,int year, double price){
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    Car(String model, String color, double price){
        this.setModel(model);
        this.setColor(color);
        this.setPrice(price);
    }
    void drive(){
        System.out.println("Here we go " +this.model);
    }


    void copy(Car x){
        this.setModel(x.model);
        this.setColor(x.color);
        this.setPrice(x.price);
    }
}
