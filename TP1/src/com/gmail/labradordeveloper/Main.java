/*
    Seleccionar palabra + Alt + J –> Selecciona la siguiente coincidencia y se editan en conjunto
 */

package com.gmail.labradordeveloper;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int N ;
        double R;
        double c1;
        double c2;
        /*exerciseOne();
        exerciseTwo();
        exerciseThree();*/
        //exerciseFour();
//       do {
//            System.out.println("Enter a number different than 0");
//            N = sc.nextInt();
//        } while (N == 0);
//        exercise7(N);
//        System.out.println("Introduce your name");
//        sc.nextLine();//Me muevo en la consola
//        //sc.next() me guarda hasta encontrar un espacio
//        String name = sc.nextLine();
//        showName(name);
        //tripleDouble(N);
        //System.out.println((farToCelsius(N)));
//        System.out.println("Enter the radius");
//        radioToArea(R);
//        System.out.println("Enter a velocity in Km/H");
//        R = sc.nextDouble();
//        System.out.println();
//        System.out.println((kmHToKmS(R) != 0  ?   Math.round(kmHToKmS(R) * 100.0)/100.0  + " Km/s" : " Error"));
//        System.out.println("Enter a cathetus 1");
//        c1 = sc.nextDouble();
//        System.out.println("Enter a cathetus 2");
//        c2 = sc.nextDouble();
//        System.out.println(hypotenuse(c1,c2) != 0 ? "Hypotenuse " + Math.round(hypotenuse(c1,c2) * 100.0)/100.0 + " cm" : "Error");

        System.out.println("Enter the radius");
        R = sc.nextDouble();
        System.out.println(volumeSphere(R) != 0 ? "Volume : " + Math.round(volumeSphere(R) * 100.0) / 100.0 : "Error");
        double S1 , S2 , S3;
        System.out.println("Enter the sides of a triangle");
        S1 = sc.nextDouble();
        S2 = sc.nextDouble();
        S3 = sc.nextDouble();
        System.out.println(areaTriangle(S1,S2,S3) != 0? "Area : " + (areaTriangle(S1,S2,S3)): "Error");



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
        System.out.println(N + " is " + (multipleOf(N, 5) ? "multiple of 5" : "not multiple of 5"));
        System.out.println(N + " is " + (multipleOf(N, 10) ? "multiple of 10" : "not multiple of 10"));
        System.out.println(N + " is " + (lessThan(N, 100) ? "greater or equal to 100" : "less than 100"));
    }

    public static boolean multipleOf(int N, int M) {
        return N % M == 0;
    }

    public static boolean lessThan(int N, int higher) {
        return N >= higher;
    }

    //Exercise 8
    public static void showName(String name) {
        System.out.println("Hi! " + name);
    }

    //Exercise 9
    public static void tripleDouble(int N) {
        System.out.println("The double of " + N + " is " + N * 2);
        System.out.println("The triple of " + N + " is " + N * 3);
    }

    //Exercise 10
    public static double farToCelsius(int fahrenheit) {
        return ((double) (fahrenheit - 32) * 5 / 9);

    }
    //Exercise 11
    public static void radioToArea(double R){
        System.out.println("Area " + Math.PI * Math.pow(R , 2) + " cm");
        System.out.println("Length " + Math.PI * R * 2 + " cm");
    }
    //Exercise 12
    public static double kmHToKmS (double velocity){

        return (velocity > 0) ? velocity / 3600 : 0;
    }
    //Exercise 13
    public static double hypotenuse (double c1 , double c2){
        return (c1 > 0 && c2 > 0) ? Math.sqrt(Math.pow(c1 , 2) + Math.pow(c2 , 2)): 0;
    }
    //Exercise 14
    public static double volumeSphere(double R){
        return (R > 0) ? ( 4 * Math.PI  * Math.pow(R , 3) / 3) : 0;
    }
    //Exercise 15
    public static double areaTriangle(double A1,double A2,double A3){
        if(A1 > 0 && A2 > 0 && A3 > 0 ){
            double sP = (A1 + A2 + A3) / 2;
            return Math.round(Math.sqrt(sP * (sP - A1) * (sP - A2) * (sP - A3))* 100.0) / 100.0;
        }
        return 0;
    }
}


