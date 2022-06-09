
package lexicon.fundamentals;
import java.util.Arrays;
class ArraysProgram {
    public static void main(String[] args) {

        //Array of int
        int[] number = {1, 2, 3, 4, 5};
        number[1] = 6;
        number[4] = number[1];


        for (int numbers : number)
            System.out.println(numbers);

        //Array of Strings
        String stringArray[] = new String[3];
        System.out.println(stringArray.length);
        stringArray[0] = "Fredrik";
        stringArray[2] = "Jonas";
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // Array of chars
        char[] word = {'J', 'A', 'V', 'A'};
        for (char letters : word) {
            System.out.println(letters);
        }
        // Two dimension int arrays
        int[][] numbers = new int[5][5];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
                if (j == numbers[i].length - 1) {
                    System.out.println();
                }

            }
        }
        // Two dimension for each loop


         numbers[0][0]=1;
        for (int[] array:numbers) {
            int index=0;
            for (int array2:array) {
                System.out.println(array2);
                if(index==array.length-1){
                    System.out.println();
                }
                index++;
                
            }


        }
      // Array sort methods

        String names[]={"Simon","erik","Ulf","Fredrik","Jonas", "Kent","Marcus","Martina"};
        //Arrays.sort(names);
        Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
        for (String name: names) {
            System.out.println(name);
            
        }

    }
}