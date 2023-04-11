package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop Size from Desktop class");
	}
	
	
	public static void main(String[] args) {
		Desktop DT_Obj= new Desktop();
		DT_Obj.computerModel();
		DT_Obj.desktopSize();
	}

}
