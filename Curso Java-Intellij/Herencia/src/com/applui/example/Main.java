package com.applui.example;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Luisa", 30, 3000,"Microsoft");
        Student st = new Student("Fernanda", 16,4.3, "Fernando Maestro");
        dev.showInfo();
        System.out.println("***********");
        st.showInfo();

    }
}
