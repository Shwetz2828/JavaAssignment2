package com.tnsif.day2;

import java.util.Scanner;

class SentenceChecker {
    private String sentence;

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public boolean isWordPresent(String word) {
        return sentence.contains(word);
    }
}

public class WordPresenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the sentence");
            String sentence = scanner.nextLine();

            System.out.println("Enter the word");
            String wordToCheck = scanner.nextLine();

            SentenceChecker sentenceChecker = new SentenceChecker();
            sentenceChecker.setSentence(sentence);

            if (sentenceChecker.isWordPresent(wordToCheck)) {
                System.out.println(wordToCheck + " is present in the sentence");
            } else {
                System.out.println(wordToCheck + " is not present in the sentence");
            }
        } finally {
            // Close the Scanner
            scanner.close();
        }
    }
}

