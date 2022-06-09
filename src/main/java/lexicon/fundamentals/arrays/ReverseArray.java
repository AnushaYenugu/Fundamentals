package lexicon.fundamentals.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        int value=00;
        ArrayList<Integer> arrayValue=new ArrayList<Integer>();
        Scanner scanner=new Scanner(System.in);
        int userValue;
        while(true) {
            System.out.println("Enter value or to want to exit enter \"00\": ");
            userValue=scanner.nextInt();
            if(userValue==value){
                  break;
            }
            else {
                arrayValue.add(userValue);
            }

        }
        for(int i =0;i<arrayValue.size();i++){
            System.out.println(arrayValue.get(i));
        }
        System.out.println("Reversing the array");
        for(int i=arrayValue.size()-1;i>=0;i--){
            System.out.println(arrayValue.get(i));
        }
    }
}
