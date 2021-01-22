package com.mycompany.app;

import org.apache.commons.lang3.StringUtils;

public class Capitalize {
    private String sentence;

    public Capitalize(String s) {
        this.sentence = s;
    }

    //
    public String capitalizeWithoutLib(){
        String[] words = this.splitWithoutLib();
        String finalSentence = "";
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            finalSentence = finalSentence + words[i] + " ";
        }
        return(finalSentence);
    }

    //
    public String[] splitWithoutLib(){
        String[] words = this.sentence.split(" ");
        return(words);
    }

    // split sentence into array
    public String[] splitWithLib(){
        String[] splittedSentence = StringUtils.split(this.sentence, " ");
        return splittedSentence;
    }

    // capitalize sentence
    public String capitalizeWithLib(){
        return StringUtils.capitalize(this.sentence);
    }
}