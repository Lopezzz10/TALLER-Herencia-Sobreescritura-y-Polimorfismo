package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
//import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		//Figura figura = new Figura("Figura normal", "Negro");
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Azul",4);
		Triangulo triangulo = new Triangulo("Triángulo", "Verde", 3, 4, 5, 4, 3);
		
		//System.out.println(figura);
		System.out.println(cuadrado);
		System.out.println(triangulo);
	}

}