package org.example.operaciones;

public class Resta implements OperacionesI{

    @Override
    public void operaciones(double num1, double num2) {
        System.out.println("La resta es: " +(num1-num2));
    }
}
