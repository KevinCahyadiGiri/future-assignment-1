package com.mycompany.app;

import java.util.*;
  
public class App 
{
    // static void captWithoutLib(String str) {
    //     System.out.println("haii");
    // }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tulis suatu kalimat: ");
        String sentence = sc.nextLine();
        sc.close();
        Capitalize capt = new Capitalize(sentence);
        String stc = capt.capitalizeWithoutLib();
        System.out.println(stc);


        // System.out.println(sentence);
        // System.out.println( "Hello World!" );

        // captWithoutLib("hai");
    }
}
