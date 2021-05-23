package com.company;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static String normalize(String text){

        String regex = "[.,!?]";
        return text.replaceAll(regex, "").toLowerCase();

    }
        public void wordRepetitios(String text){
            Map<String, Integer> dict =  new HashMap();
            String separateWords[] = text.split(" ") ;
            if(separateWords.equals(" ")){

            }
            for (String word: separateWords){
                if ( dict.containsKey(normalize(word))){}
                dict.merge(normalize(word), 1, Integer::sum);
            }

            System.out.println(dict);
        }

}
