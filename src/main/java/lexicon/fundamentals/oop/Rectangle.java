package lexicon.fundamentals.oop;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height,double width){

        this.height=height;
        this.width=width;
    }
    public Rectangle(){
        this.height=0.0;
        this.width=0.0;
    }

    public double getHeight_(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public double getArea(double height,double width){
        return height*width;
    }


}
