package com.mycompany.app;

  
public class App 
{

    public static void main( String[] args )
    {
<<<<<<< HEAD
        Capitalize test1 = new Capitalize("I want to learn git and maven");
        System.out.println(test1.capitalizeWithLib());

        String[] splittedWithLib = test1.splitWithLib();
        for(String string :(splittedWithLib)) {
            System.out.println(string);
        }
=======
        Scanner sc = new Scanner(System.in);
        System.out.print("Tulis suatu kalimat: ");
        String sentence = sc.nextLine();
        sc.close();
        Capitalize capt = new Capitalize(sentence);
        String stc = capt.capitalizeWithoutLib();
        System.out.println(stc);


        // System.out.println(sentence);
        // System.out.println( "Hello World!" );
>>>>>>> 69f00086c41b835b986d5c59518b86a51c01c42b

    }
}
