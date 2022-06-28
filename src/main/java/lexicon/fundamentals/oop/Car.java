package lexicon.fundamentals.oop;

public class Car {
    private int id;
    private int year;
    private String model;
    private String color;
    private int motorSize;

    public Car(int id,int year,String model,String color,int motorSize){
        this.id=id;
        this.year=year;
        this.model=model;
        this.color=color;
        this.motorSize=motorSize;
    }
    public String drive(){
        return model+" with motors "+motorSize+" can drive now";
    }

}
