package lexicon.fundamentals;

public class Car {

    String carBrand="";
    int carRegistrationNumber=0;
    int carSpeed;
    String carOwnerName;
    String carColor;

    public Car(String brand, int number, int speed, String owner, String color){
        carBrand=brand;
        carRegistrationNumber=number;
        carSpeed=speed;
        carOwnerName=owner;
        carColor=color;
    }

    public static void main(String[] args) {
       Car car=new Car("Volvo", 34767, 100, "Mario", "Black");
        System.out.println(car.carBrand +" "+ car.carRegistrationNumber+" "+ car.carSpeed+" "+car.carOwnerName+" "+ car.carColor);



    }
}
