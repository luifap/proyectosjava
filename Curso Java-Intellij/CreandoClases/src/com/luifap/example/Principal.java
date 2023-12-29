package com.luifap.example;
import com.luifap.example.model.Persona;

import com.luifap.example.model.Persona;

public class Principal {
    public static void main(String[] args) {
        String s1 = new String();
        Persona p1 = new Persona("Luisa", 30, "Carrera12");
        Persona p2 = new Persona("Juli", 33, "Carrera16");

        System.out.println(p1.nombre);
        System.out.println(p1.edad);
        System.out.println(p1.direccion);

        System.out.println(p2.nombre);
        System.out.println(p2.edad);
        System.out.println(p2.direccion);
    }

}
