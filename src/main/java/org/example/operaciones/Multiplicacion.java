package org.example.operaciones;

public class Multiplicacion implements OperacionesI{
    @Override
    public void operaciones(double num1, double num2) {
        System.out.println("La multiplicacion es: " +(num1*num2));
    }
}
