package com.krakedev.test;

import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestTrianguloRectangulo {

	public static void main(String[] args) {
		Graficador graficador = new Graficador();
		TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo("TrianguloRectangulo", "Amarillo", 3, 4);

		graficador.graficar(trianguloRectangulo);
	}

}