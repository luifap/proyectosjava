package com.luiapp.example;

public class EnglishLanguage implements Language{
    @Override
    public void sayHi(){
        System.out.println("Hi from English");
    }

    public void sayBye(){
        System.out.println("Bye from English");
    }
}
