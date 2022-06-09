package lexicon.fundamentals.arrays;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] cities={"Paris","London","New York","Stockholm"};
        Arrays.sort(cities);
        for(String citySort:cities){
            System.out.println(citySort);
        }
    }
}
