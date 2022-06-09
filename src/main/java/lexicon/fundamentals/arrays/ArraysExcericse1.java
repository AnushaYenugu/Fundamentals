package lexicon.fundamentals.arrays;

public class ArraysExcericse1 {
    public static void main(String[] args) {
      // 1st problem
       int[] arrayValue ={11,23,5,39,44,67};
        for (int value:arrayValue) {
            System.out.println(value);
        }
        System.out.println(indexOf(arrayValue,5));
    }

    public static int indexOf(int arr[],int value){
        int result=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==value){
               result=i;
               break;
          }
          else
             result= -1;


          }
      return result;
      }
    }


