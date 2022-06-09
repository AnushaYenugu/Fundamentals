package lexicon.fundamentals.arrays;

public class AverageArray {
    public static void main(String[] args) {
        int array[]={43,5,23,17,2,14};
        float result=0F;
        for(int i=0;i<array.length;i++){
            result=array[i]+result;
        }
        System.out.println("The average of array is: "+result/ array.length);
    }
}
