package num1;


public class Main {

	public static void main(String[] args) {
		Teclado in = new Teclado();
		
		String nombre = in.getString("Ingresa Nombre");
		System.out.println("hola" + nombre);
		
	}
}
