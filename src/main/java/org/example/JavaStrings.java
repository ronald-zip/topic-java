package org.example;

public class JavaStrings {

    public static void main(String[] args) {

        // declare 2 strings
        String word = "Hellooooo";
        String word2 = new String("Hiiiiii");
        String[] chainword = {"apple", "banana", "6"};

        // method contains to validate a keyword in a word
        Boolean validator = word.contains("o");
        System.out.println("The word Hellooooo, contains 'o' is "+ validator);

        // method substring -> create a new string using to base a old string & establishing a range
        String newWord2 = word2.substring(0,2);
        System.out.println("Printing a new word "+ newWord2);

        String newWord3 = word2.substring(2);
        System.out.println("Printing a new word "+ newWord3);

        // method join -> create a separator between words on array
        String newChainWord = String.join("***", chainword);
        System.out.println(newChainWord);
        System.out.println(chainword);

        // method replace -> replace old chars for new chars
        String newChainWord2 = newChainWord.replace("***","/////");
        System.out.println(newChainWord2);

        // method replaceAll -> replace a caracter for new caracter
        String newChainWord3 = newChainWord.replaceAll("a", "A");
        System.out.println(newChainWord3);
    }
}
