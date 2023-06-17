package num1;


import java.util.Scanner;
public class Teclado {

	
	Scanner sc ;
	
	
	public Teclado() {
		sc =new Scanner(System.in);
	}
	
	
	
	
	public String getString(String titulo) {
		String s1 ="";
		
		while(s1.equals("")) {
			System.out.println(titulo);
			s1 = sc.nextLine();
		}
		
		
		return s1;
	}
	
}
