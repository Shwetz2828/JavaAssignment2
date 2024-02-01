package com.tnsif.day2;

import java.util.Scanner;
import java.util.Arrays;

class AlphabeticalOrderArranger {
    private String sentence;

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String arrangeAlphabeticallyWithinWords() {
        // Validate input
        if (!sentence.matches("[a-z ]+")) {
            return sentence + " is an invalid input";
        }

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Sort characters within each word alphabetically
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            words[i] = new String(chars);
        }

        // Join the words back to form the sentence
        return String.join(" ", words);
    }
}

public class AlphabeticalOrderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the sentence");
            String sentence = scanner.nextLine();

            AlphabeticalOrderArranger arranger = new AlphabeticalOrderArranger();
            arranger.setSentence(sentence);

            String result = arranger.arrangeAlphabeticallyWithinWords();
            System.out.println(result);
        } finally {
            // Close the Scanner
            scanner.close();
        }
    }
}
