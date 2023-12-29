package com.applui.enums;

public class Main {
    //Niveles de un video juego

    public static void main(String[] args) {
        Level [] allLevels = Level.values();
            for (Level level : allLevels){
                System.out.println(level);
        }

            Level level = Level.NORMAL;

            switch (level){
                case EASY:
                    System.out.println("El nivel es fácil");
                    break;
                case NORMAL:
                    System.out.println("El nivel es normal");
                    break;
                case HARD:
                    System.out.println("El nivel es difícil");
                    break;
            }

    }
}
