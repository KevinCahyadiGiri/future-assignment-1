package com.mycompany.app;

  
public class App 
{

    public static void main( String[] args )
    {
        Capitalize test1 = new Capitalize("I want to learn git and maven");
        System.out.println(test1.capitalizeWithLib());

        String[] splittedWithLib = test1.splitWithLib();
        for(String string :(splittedWithLib)) {
            System.out.println(string);
        }

    }
}
