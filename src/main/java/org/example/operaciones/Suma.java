package org.example.operaciones;

public class Suma implements OperacionesI{


    @Override
    public void operaciones(double num1, double num2) {
        System.out.println("La suma es: " +(num1+num2));
    }
}
