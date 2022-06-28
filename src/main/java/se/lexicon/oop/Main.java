package se.lexicon.oop;

public class Main {
    public static void main(String[] args) {

        BankAccount anusha=new BankAccount("1100056432",40_000.00, "Anusha Yenugu", "yenuguanusha@gmail.com", "0727861694");
        System.out.println(anusha.getAccountNumber());
        System.out.println(anusha.getBalance());
        System.out.println(anusha.depositFunds(1000));
        System.out.println(anusha.withDrawFunds(2000));
        System.out.println(anusha.withDrawFunds(39000));
        System.out.println(anusha.withDrawFunds(38000));
        BankAccount rajesh=new BankAccount("1100056432",1_00_000.00,"Rajesh Reddy Kasala","rajeshreddy@gmail.com","0735678978");
        System.out.println(rajesh.getAccountNumber());
        BankAccount sree=new BankAccount("1100056432",2_00_000.00,"Sree Divisha","sreedivisha@gmail.com","0727861694");
        System.out.println(sree.getAccountNumber());
    }
}