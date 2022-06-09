package lexicon.fundamentals.arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int array1[]={1,15,20};
        int array2[]= Arrays.copyOf(array1,3);
        for (int array:array2) {
            System.out.println(array);

        }
    }
}
