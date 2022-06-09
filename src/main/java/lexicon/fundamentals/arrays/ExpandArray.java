package lexicon.fundamentals.arrays;

import java.util.Arrays;

public class ExpandArray {
    public static void main(String[] args) {
        int array[]={1,2,4,5,6};
        int array2[]={8,9,10};
        int newArray[]=new int[array.length+array2.length];
        newArray= Arrays.copyOf(array,array.length+array2.length);

        for(int i=array.length,j=0;i<newArray.length && j<array2.length;i++,j++){
            newArray[i]=array2[j];
        }
        for(int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
