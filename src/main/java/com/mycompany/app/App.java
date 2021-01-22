package com.mycompany.app;

import java.util.*;
public class App 
{

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tulis suatu kalimat: ");
        String sentence = sc.nextLine();
        sc.close();
        Capitalize capt = new Capitalize(sentence);
        String stc = capt.capitalizeWithoutLib();
        System.out.println(stc);

        // With library
        System.out.println(capt.capitalizeWithLib());
        String[] splittedWithLib = capt.splitWithLib();
        for(String string :(splittedWithLib)) {
            System.out.println(string);
        }

    }
}
