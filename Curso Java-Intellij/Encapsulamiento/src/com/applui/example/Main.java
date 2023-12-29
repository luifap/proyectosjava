package com.applui.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Los escritos de mi abuelo");
        book.setAuthor("Luisa Arboleda Parra");
        book.setAvailable(true);
        System.out.println("El título del libro es: " + book.getTitle() + "\n" +
                "El autor es: " + book.getAuthor());
        if (book.isAvailable()){
            System.out.println("El libro está disponible");
        }else {
            System.out.println("El libro no está disponible");
        }
    }
}
