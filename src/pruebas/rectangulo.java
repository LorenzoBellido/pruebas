package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class rectangulo {

	public static void main(String[] args) {
		// Variable donde guardar n
		int n = -1;
		int n2 = -1;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Realizo las excepciones mientras que a y b sean negativas
		do {
			try {
				// Pido los segundos a incrementar al usuario
				System.out.println("Introduzca los segundos a incrementar:");
				n = sc.nextInt();
				n2 = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("El valor introducido es erroneo");
				sc.nextLine();
			}
		}while(n < 0);

		// Bucle que va recorriendo las filas (i) y las columnas (j) y pinto los asteriscos(k)
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n2; j++) {
			if(i==1||i==n||j==1||j==n2) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
				
			}
			System.out.println();            
		}
		

		// Cerramos el Scanner
		sc.close();
	}

}
