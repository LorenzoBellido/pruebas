package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		// Variable donde guardar n
		int n =0;
		int cifra;
		int par =0;
		int impar =0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		do {
			try {
				// Pido al usuario un número entero
				System.out.println("Introduzca un número entero: ");
				n = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("El valor introducido es erroneo");
				sc.nextLine();
			}
		}while(n<=0);
		while(n>0) {
			cifra = n%10;
			if(cifra%2==0) {
			par++;
			}else {
				impar++;
			}
			n=n/10;
		}
		
	System.out.println("El número tiene " + par + " cifra/s par/es y " + impar + " cifra/s impar/es.");
	}

}
