package com.company;


import java.util.*;


public class Main {

    public static void main(String[] args) {
    String text = "this is a text, but it not a simple text. Is a big text or maybe not...";
    String text2 ="Este es un texto!, pero no un simple texto. Es un gran texto o quizá no... Qué tal?, que!";

    WordCounter wordCounter = new WordCounter();

    wordCounter.wordRepetitios(text);
    wordCounter.wordRepetitios(text2);

    }


}
