package com.example;


import java.util.Scanner;

/*
    8. Pedir dos números y decir cual es el mayor o si son iguales.
 */
public class Ejercicio_8_DosNumerosCualEsMayorOSonIguales {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String resultado;

        System.out.println("Ingresa el primer numero");
        int num1 = teclado.nextInt();

        System.out.println("Ingresa el segundo numero");
        int num2 = teclado.nextInt();

        if (num1 == num2){
           resultado = num1 + " y " + num2 +" son iguales ";
        } else if (num1 >num2) {
            resultado = num1 + " es mayor que " + num2;
        } else {
            resultado = num2 + " es el mayor que " + num1;
        }

        System.out.println(resultado);

    }

}