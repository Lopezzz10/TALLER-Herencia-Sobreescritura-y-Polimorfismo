package com.krakedev.figuras;

public class Triangulo extends Figura {

	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(String nombre, String color, double lado1, double lado2, double lado3) {
		super(nombre, color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public int calcularPerimetro() {
		return (int) (lado1 + lado2 + lado3);
	}

	@Override
	public double calcularArea() {
		double s = (lado1 + lado2 + lado3) / 2.0;
		return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}
}