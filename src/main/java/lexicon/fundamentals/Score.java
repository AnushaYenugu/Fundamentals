package lexicon.fundamentals;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        System.out.println("Enter the your score: ");
        Scanner scanner=new Scanner(System.in);
        int score=scanner.nextInt();
        if(score>=65)
            System.out.println("Hurray, You Passed!");
        else if(score>=55 && score<65)
            System.out.println("You are almost there");
        else
            System.out.println("Sorry, You did not pass");

    }
}
