package com.campusdual.classroom;

public class Tractor implements IMachine{

	protected int horsePower = 0;
	
	public Tractor(int hp) {
		this.horsePower = hp;
	}

	public void forward() {
		System.out.println("El tractor avanza");
	}

	public void backward() {
		System.out.println("El tractor retrocede");
	}

	@Override
	public void start() {
		forward();
	}

	@Override
	public void stop() {
        backward();
	}

	@Override
	public void maintenance() {
		System.out.println("Mantenimiento");
	}
}
