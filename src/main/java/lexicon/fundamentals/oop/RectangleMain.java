package lexicon.fundamentals.oop;

import java.util.Scanner;


public class RectangleMain {
   //public double height;
    //public double width;
    public static void main(String[] args) {
        double inputHeight=0.0;
        double inputWidth=0.0;
        Rectangle rectangle = new Rectangle();
        //System.out.println("Area of Rectangle "+rectangle.getArea(height,width));

        System.out.println("Enter height");
        Scanner scanner = new Scanner(System.in);


           double  height = scanner.nextDouble();
            System.out.println("You entered "+height);

        System.out.println("Enter width");

            double width=scanner.nextDouble();




        Rectangle rectangle1 = new Rectangle(height, width);
        System.out.println("Area of Rectangle " + rectangle1.getArea(height, width));
    }
}
