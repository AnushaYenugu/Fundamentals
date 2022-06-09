package lexicon.fundamentals.arrays;


import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int array[] = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int range = array.length;

        int k = 0;
        Arrays.sort(array);

// for loop to create the size of an array
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                k = k + 1;
            }
        }

        int[] newArray = new int[array.length - k];


        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!hasValue(newArray,array[i])) {
                newArray[j] = array[i];
                System.out.println(newArray[j]);
                j++;

            }
        }
    }


        public static boolean hasValue(int[] newArray, int value){
            for (int i = 0; i < newArray.length; i++) {
                if (newArray[i] == value) {
                    return true;
                }
            }
            return false;
        }
    }


