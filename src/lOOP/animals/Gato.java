package lOOP.animals;

public class Gato extends Animal {
	
	public Gato() {
		super();
		super.esMascota = true;
		super.edad = 0;
		super.nombre = "";
		super.tieneAlas = false;
		super.puedeVolar = false;
	}
	
	public void hablar() {
		System.out.println("meow, meow");
	}
	
	public void moverse() {
		System.out.print("Brinco de aqui para alla");
	}
	public void comer() {
		System.out.println("Me gustan los ratones!");
	}
	public void limpiarse() {
		System.out.println("Me lami, y escupi bolas de pelo!");
	}
	public void ronronear() {
		System.out.println("trrrr, trrrr");
	}

}
