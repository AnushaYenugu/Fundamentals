package lexicon.fundamentals.arrays;

public class OddArray {
    public static void main(String[] args) {
        int array[]={1,2,3,5,7,9,12,22,33,44};
        for (int i=0;i<array.length;i++){
            if(!(array[i]%2==0)){
                System.out.println(array[i]);
            }
        }
    }
}
