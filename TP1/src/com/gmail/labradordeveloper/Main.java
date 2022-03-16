/*
    Seleccionar palabra + Alt + J –> Selecciona la siguiente coincidencia y se editan en conjunto
 */


package com.gmail.labradordeveloper;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*exerciseOne();
        exerciseTwo();
        exerciseThree();*/
        //exerciseFour();
        Scanner scanner = new Scanner((System.in));
        int N ;
        do {
            System.out.println("Ingrese un numero distinto a CERO");
            N = scanner.nextInt();
        } while (N == 0);
        /*System.out.println("El numero ingresado es " + (evenOrOdd(N) ? "Par" : "Impar" ));*/
        /*System.out.println("El numero ingrasado es " + (negativeOrPositive(N) ? "Mayor a 0" : "Menor o Igual a 0") )*/
        exercise7(N);
    }

    public static void exerciseOne() {
        int n = 5;
        double a = 15.6;
        char c = 's';
        System.out.println("La suma de las variables n + a : " + (n + a));
        System.out.println("La resta de las variables a - n : " + (a - n));
        System.out.println("El valor entero de" + c + "es : " + (int) c);

    }

    public static void exerciseTwo() {
        int x = 2, y = 3;
        double n = 5.2, m = 9.2;
        System.out.println("La multiplicacion de x * m : " + (x * m));
        System.out.println("La divicion de n / y  : " + (n / y));
    }

    public static void exerciseThree() {
        int N = 10;
        System.out.println("Aumento a : " + (N + 77));
        System.out.println("Decremento 3 : " + (N - 3));
        System.out.println("Duplicar valor : " + (N * 2));
    }

    public static void exerciseFour() {
        int A = 1, B = 2, C = 3, D = 4;
        int[] array = {A, B, C, D};
        int[] arrayAux = new int[4];
        // A = array [3];
        // B = array [2];
        // C = array [0];
        // D = array [1];
        //Quiero ver como function el for :D
        System.out.println("Un arreglo :D");
        for (int i = 0; i < array.length; i++) {
            switch (i) {
                case 0 -> arrayAux[3] = array[i];
                case 1 -> arrayAux[2] = array[i];
                case 2 -> arrayAux[0] = array[i];
                case 3 -> arrayAux[1] = array[i];
                default -> {
                }
            }

        }
        //for (TipoBase variable: ArrayDeTiposBase) (forEach)
        for (int x : arrayAux) {///(Intera de a uno a la x e imprime esa posicion)
            System.out.println(x);
        }

    }

    public static boolean evenOrOdd(int N) {
        return N % 2 == 0;

    }

    /* 6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
              continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.*/
    public static boolean negativeOrPositive(int N) {
        return N > 0;
    }

    /* (7) Programa Java que declare una variable C de tipo entero y asignarle un valor. A
        continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
        si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
        100.*/
    public static void exercise7(int N) {
        System.out.println(N + " is " + (evenOrOdd(N) ? "Even" : "Odd"));
        System.out.println(N + " is " + (negativeOrPositive(N) ? "Positive" : "Negative"));
        System.out.println(N + " is " + (multipleOf(N,5) ? "multiple of 5" : "not multiple of 5" ));
        System.out.println(N + " is " + (multipleOf (N ,10) ? "multiple of 10" : "not multiple of 10"));
        System.out.println(N + " is " + (lessThan(N , 100) ? "greater or equal to 100" : "less than 100"));
    }

    public static boolean multipleOf (int N, int M){
        return N % M == 0;
    }
    public static boolean lessThan(int N, int higher){
        return N >= higher;
    }
}


