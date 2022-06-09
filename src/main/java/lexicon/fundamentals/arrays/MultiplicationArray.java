package lexicon.fundamentals.arrays;

public class MultiplicationArray {
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5,6,7,8,9,10};
        int array2[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                System.out.print(array1[i]*array2[j]);
                System.out.print("\t \t");
            }
            System.out.println(" \t");

        }
    }
}
