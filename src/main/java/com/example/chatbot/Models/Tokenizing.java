package com.example.chatbot.Models;

import opennlp.tools.tokenize.SimpleTokenizer;

public class Tokenizing {
    public static void tokenizer (String sentence){
        SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;
        String tokens[] = simpleTokenizer.tokenize(sentence);
        for (String token:tokens ){
            System.out.print(token +"|");
        }

    }
}