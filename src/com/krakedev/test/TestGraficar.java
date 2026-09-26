package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
//import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		Graficador graficador = new Graficador();
        //Figura figura = new Figura("Figura", "Negro");
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo",5);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Azul",5,7);

        //graficador.graficar(figura);
        graficador.graficar(cuadrado);
        graficador.graficar(rectangulo);
	}

}
