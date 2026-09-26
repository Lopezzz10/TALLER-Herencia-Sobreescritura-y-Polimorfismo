package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		Figura figura = new Figura();
		Cuadrado cuadrado = new Cuadrado();
		Triangulo triangulo = new Triangulo();
		
		System.out.println(figura);
		System.out.println(cuadrado);
		System.out.println(triangulo);
	}

}
