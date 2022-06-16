package lexicon.fundamentals.arrayworkshop;

import java.util.Arrays;
import java.util.Scanner;

public class NameRepository {
    private static String[] names={"Anusha Yenugu","Jennie Smith","Simon Elbrink","Simon Svensson","Jonson Smith"};

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

      /*  System.out.println("Enter Yes to Continiue or No to exit ");

        String decision=scanner.nextLine();
        String[] firstNameOf =new String[1];
        String[] lastNameOf=new String[1];
        int i=0;
        int k=1;
        while(true){
        if(decision.toLowerCase().equals("yes")) {

            System.out.println("Enter your first Name: ");
             firstNameOf[i] = scanner.nextLine();
             String[] reassignFirstName=new String[firstNameOf.length+k];
             reassignFirstName=Arrays.copyOf(firstNameOf,firstNameOf.length+k);
             reassignFirstName[firstNameOf.length-1]=firstNameOf[i];
            System.out.println("Enter your last Name: ");
             lastNameOf[i] = scanner.nextLine();
             String[] reassignLastName=new String[lastNameOf.length+k];
             reassignLastName=Arrays.copyOf(lastNameOf,lastNameOf.length+k);
             reassignLastName[lastNameOf.length-1]=lastNameOf[i];

            names = new String[]{reassignFirstName[i] + " " +reassignFirstName[i]};
            i++;
            k++;
            System.out.println("Want to contines enter yes or exit enter no");
            decision=scanner.nextLine();
        }
        else if(decision.toLowerCase().equals("no")){
            break;
        }
        } */




                System.out.println("Size of an array is "+getSize());








                System.out.println(findAll());


                System.out.println("Enter the name to find ");
                final String fullName= scanner.nextLine();
                System.out.println(find(fullName));


                System.out.println("Add the name");
                Scanner scannerAdd=new Scanner(System.in);
                String addName= scannerAdd.nextLine();
                System.out.println(add(addName));

                System.out.println("Enter the first name ");
              //  String firstName=scanner.nextLine();
               String firstName="Simon";
                System.out.println("The list of names starts with "+firstName);
                System.out.println(findByFirstName(firstName));


                System.out.println("Enter the last name");
                String lastName="Smith";
                System.out.println("The list of names ends with "+lastName);
                System.out.println(findByLastName(lastName));

                String original ="Simon Svensson";
                String updatedName="Sree Divisha";
                System.out.println(update(original,updatedName));


                String removeFullName="Jonson Smith";
                System.out.println(remove(removeFullName));


                String[] resetName={"Harika Yenugu","Varka Erbrik"};
                setNames(resetName);

                clear();












    }


    public static int getSize(){
        return names.length;
    }
    public static void setNames(String[] names){
        NameRepository.names=names;
        System.out.println(Arrays.toString(names));
    }

    public static void clear(){
        Arrays.fill(names,null);
    }
    public static String findAll(){
        return Arrays.toString(names);
    }
    public static String find(final String fullName){
        String value = null;
        for(int i=0;i< names.length;i++){
            if(names[i].equals(fullName)){
                value= names[i];
                break;
            }
            else
                value= null;
        }
        return value;
    }
    public static boolean add(final String fullName){
       String findName=find(fullName);
       boolean value=false;
       if(findName==null){
        String[] newNames=new String[names.length+1];
          //newNames=Arrays.copyOf(names, names.length+1);
           for(int i=0;i< names.length;i++) {
               newNames[i]=names[i];
           }
           newNames[newNames.length-1]=fullName;
           NameRepository.names=newNames;
           System.out.println(Arrays.toString(names));
           value=true;
       }
       else if(findName.equals(fullName)){
           value=false;
      }
        return value;
    }

    public static String findByFirstName(final String firstName){
        String[] listOfFirstNames=new String[3];
        int k=0;
            for(int i=0;i< names.length;i++){
                if(names[i].startsWith(firstName)){

                listOfFirstNames[k]=names[i];
                k++;
                }
            }
    return Arrays.toString(listOfFirstNames);}

    public static String findByLastName(final String lastName){
        String[] listOfLastName=new String[3];
        int k=0;
        for (int i=0;i< names.length;i++){
            if(names[i].endsWith(lastName)){
                listOfLastName[k]=names[i];
                k++;
            }
        }
    return Arrays.toString(listOfLastName);}

    public static boolean update(final String original, final String updatedName){
        boolean value=false;
        for(int i=0;i< names.length;i++){
            if(names[i].equals(original)){
                names[i]=updatedName;
                value=true;
                break;
            }
        }
        return value;
    }

    public static boolean remove(final String fullName){
        boolean value= false;
        for (int i=0;i< names.length;i++){
            if(names[i].equals(fullName)){
                names[i]=null;
                value=true;
                break;
            }
        }
    return value;}



}
