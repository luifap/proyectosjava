package com.luiapp.example;

public interface Language {
    void sayHi();

    default void sayBye(){
        System.out.println("Bye from interface");
    }
}
