package org.example;

import org.example.operaciones.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número");
        double num1 = sc.nextDouble();

        System.out.println("Ingresa el segundo número");
        double num2 = sc.nextDouble();



        System.out.println("Ingresa la opción \n " +
                "1) suma \n" +
                "2) resta \n" +
                "3) multiplicación \n" +
                "4) División \n" +
                "5) Módulo");

        int respuesta = sc.nextInt();

        switch (respuesta){
            case 1:
                Suma suma = new Suma();
                suma.operaciones(num1,num2);
                break;
            case 2:
                Resta resta = new Resta();
                resta.operaciones(num1,num2);
                break;
            case 3:
                Multiplicacion multiplicacion = new Multiplicacion();
                multiplicacion.operaciones(num1,num2);
                break;
            case 4:
                Division division = new Division();
                division.operaciones(num1,num2);
                break;
            case 5:
                Modulo modulo = new Modulo();
                modulo.operaciones(num1,num2);
                break;
            default:
                System.out.println("Opción invalida.");
                return;

        }

        System.out.println("*********************************************");
        System.out.println(" ");
        System.out.println("ingrese el tamaño de la matriz 1");
        int x = sc.nextInt();
        System.out.println("ingrese el tamaño de la matriz 2");
        int y = sc.nextInt();
        int[] matriz1 = new int[x];
        int[] matriz2 = new int[y];

        int[] matriz3;

        if(x > y){
            matriz3 = new int[x];
        }else{
            matriz3 = new int[y];
        }


        for (int i = 0; i < matriz1.length; i++) {
            System.out.println("ingrese el siguiente numero de la matriz 1");
            matriz1[i] = sc.nextInt();
        }
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("ingrese el siguiente numero de la matriz 2");
            matriz2[i] = sc.nextInt();
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz3[i] = matriz1[i]+matriz2[j];
            }
        }


        System.out.println("resultado de la suma de matrices:");
        for (int i = 0; i < matriz3.length; i++) {
                System.out.print(matriz3[i]);
            System.out.print("\n");
            }

    }
}