package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 5);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Azul", 4, 6);

        System.out.println("Perimetro cuadrado: " + cuadrado.calcularPerimetro());
        System.out.println("Perimetro rectangulo: " + rectangulo.calcularPerimetro());
    }
}