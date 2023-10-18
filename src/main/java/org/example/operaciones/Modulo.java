package org.example.operaciones;

public class Modulo implements OperacionesI{

    @Override
    public void operaciones(double num1, double num2) {
        System.out.println("El modulo es: " +(num1%num2));
    }
}
