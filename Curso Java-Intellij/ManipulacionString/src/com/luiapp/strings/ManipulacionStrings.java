package com.luiapp.strings;

public class ManipulacionStrings {
    public static void main(String[] args) {
        //Métodos de indexación
        String s1 = "Hola pepito";
        int logitud = s1.length();
        char c = s1.charAt(2);
        int index = s1.indexOf("p");
        String s2 = s1.substring(0,4);
        String s3 = s1.substring(5);
        System.out.println(logitud);
        System.out.println(c);
        System.out.println(index);
        System.out.println(s2);
        System.out.println(s3);

        //Métodos de modificación

        String ss1 = "Hola pepito";
        String ss2 = s1.concat(" Bienvenido a APP LUIAP");
        String ss3 =  ss2.toLowerCase();
        String ss4 = ss2.toUpperCase();
        String ss5 = ss2.replace(" ","_");
        System.out.println(ss2);
        System.out.println(ss3);
        System.out.println(ss4);
        System.out.println(ss5);

        //Métodos de inspeccion
        String i1 = "Hola pepito";
        String i2 = "";
        System.out.println(i1.isEmpty());
        System.out.println(i2.isEmpty());
        System.out.println(i1.contains("Hola"));
        System.out.println(i1.contains("mundo"));
        System.out.println(i1.contains("hola"));
        System.out.println(i1.equals("Lui APP"));
        System.out.println(i1.equals("Hola pepito"));
        System.out.println(i1.equalsIgnoreCase("hola Pepito"));



    }
}
