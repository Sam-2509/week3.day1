package org.system;

public class Desktop extends Computer{

	public void desktopSize() {

		System.out.println("My Desktop Size is = 1920x1080");
	}

	public static void main(String[] args) {
		
		Desktop des = new Desktop();
		
		des.computerModel();
		des.desktopSize();
	}

}