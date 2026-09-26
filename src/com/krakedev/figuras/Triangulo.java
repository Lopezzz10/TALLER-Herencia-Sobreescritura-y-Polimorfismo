package com.krakedev.figuras;

public class Triangulo extends Figura {

	private double lado1;
	private double lado2;
	private double lado3;
	private double base;
	private double altura;

	public Triangulo(String nombre, String color, double lado1, double lado2, double lado3, double base, double altura) {
		super(nombre, color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.base = base;
		this.altura = altura;
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

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public int calcularPerimetro() {
		return (int) (lado1 + lado2 + lado3);
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2.0;
	}
}