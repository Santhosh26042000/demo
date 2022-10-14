package org.program;

public class Python extends Java   {
	public Python() {  
		super(600);
		System.out.println(" default Constructor");

	}
	public Python(int id) {
		super(900);
		System.out.println(" int para const");
		System.out.println(id);

	}
	public static void main(String[] args) {
		Python p = new Python();
		Python p1 = new Python(300);
	}
}
