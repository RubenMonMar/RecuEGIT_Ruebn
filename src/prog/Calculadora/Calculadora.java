package prog.Calculadora;

import java.util.Scanner;

public class Calculadora {

	/**
	 * metodo calculadora
	 */
	public void pedirUsuarios() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta un número: ");
		double numero1 = sc.nextDouble();

		System.out.println("Inserta otro número: ");
		double numero2 = sc.nextDouble();

		System.out.println("Insertar que operación queires realizar (Suma o Resta): ");
		String operacion = sc.nextLine();

		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
	}

}
