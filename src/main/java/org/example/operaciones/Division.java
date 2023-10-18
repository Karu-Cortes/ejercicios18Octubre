package org.example.operaciones;

public class Division implements OperacionesI{
    @Override
    public void operaciones(double num1, double num2) {
        System.out.println("La división es: " +(num1/num2));
    }
}
