package lexicon.fundamentals.arrays;

public class StringArray2 {
    public static void main(String[] args) {
        String country[]={"France","Sweden"};
        String city[]={"Paris","Stockholm"};
        for (int i=0;i< country.length;i++){
            for (int j=i;j<=i;j++){
                System.out.println(country[i]+" "+city[j]+" ");
            }
        }
    }
}
