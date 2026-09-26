package com.krakedev.test;

import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;

public class TestHexagono {

	public static void main(String[] args) {
		Graficador graficador = new Graficador();
		Hexagono hexagono = new Hexagono("Hexagono", "Morado", 4);

		graficador.graficar(hexagono);
	}

}