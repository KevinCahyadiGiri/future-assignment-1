package com.mycompany.app;

  
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
        System.out.println(sentence.capitalizeWithLib());
        String[] splittedWithLib = sentence.splitWithLib();
        for(String string :(splittedWithLib)) {
            System.out.println(string);
        }

    }
}
