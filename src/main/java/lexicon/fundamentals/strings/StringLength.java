package lexicon.fundamentals.strings;

import java.util.Arrays;

public class StringLength {
    public static void main(String[] args) {
        // Length of the String
        String word="Java";
        System.out.println(word.length());
        // Index at 6
        String sentence="Long Example Sentence ";
        System.out.println(sentence.charAt(6));
        // Index position of 'o'
        String sentence2="Even longer example sentence";
        System.out.println(sentence2.indexOf('o'));
        //substring
        String string="Ok this is not as long!";
        System.out.println(string.substring((string.indexOf('n')),string.length()-1));
        // into lower case
        String caseConverstion="CAPS EQUALS SCREAMING";
        String backTo= caseConverstion.toLowerCase();
        System.out.println(backTo);
        // into uppercase
        System.out.println(backTo.toUpperCase());

        // replacing worst to best
        String replaceWord="Java is the worst programming language!";
        replaceWord=replaceWord.replace("worst","best");
        System.out.println(replaceWord);

        //trim
        String trimWord="\tJ\ta\tv\ta\t";
        System.out.println(trimWord);
        System.out.println(trimWord.trim());
//Parse int into String
        int i=20;
        String str1="20";
        String str2=Integer.toString(i);
        System.out.println(str1+str2);
 /*
   For replacing the a substring from string with empty space does remove the substring and prints and but want to replace with some other
   word, we need to assaign it to the same string variable to get the expected change
        String moving="I Love Programming in Java";
      System.out.println(moving.replace("in Java",""));
   */
// Split the string word and assign to string array
        String splitWord="Oil and water";
        String[] splitArray=splitWord.split("and");
        System.out.println(Arrays.toString(splitArray));

//Split the string names
        String splitNames="carl,Susie,Fredrick,Bob,Erik";
        String[] splitNamesArray=splitNames.split(",");
        for (String var: splitNamesArray) {
            System.out.println(var);
        }
// Convert into char Array
        String charSentence="ThisShouldBeConverted";
        char[] converstionIntoChar=new char[charSentence.length()];

        for (int c=0;c<charSentence.length();c++){
            converstionIntoChar[c]=charSentence.charAt(c);
            System.out.println(converstionIntoChar[c]);
        }
// Convert char array into string

        char[] charWord={'J','a','v','a'};
        String convertString=new String(charWord);
        System.out.println(convertString);

        String convertString2=String.valueOf(charWord);
        System.out.println(convertString2);

    }
}
