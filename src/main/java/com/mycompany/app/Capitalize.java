package com.mycompany.app;

import org.apache.commons.lang3.StringUtils;

public class Capitalize {
    private String sentence;

    public Capitalize(String s) {
        this.sentence = s;
    }

    //
    // public String capitalizeWithoutLib(){

    // }

    // //
    // public String splitWithoutLib(){

    // }

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