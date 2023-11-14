package pruebas;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int notaPractica, notaProblemas, notaTeorica;
        double notaFinal;
        double notaMaxima = 0, notaMinima = 10, sumaNotas = 0;
        String nombreNotaMaxima = "", nombreNotaMinima = "";
        int numAlumnos = 0;

        do {
            System.out.print("Introduce el nombre del alumno (0 para salir): ");
            nombre = sc.nextLine();

            if (!nombre.equals("0")) {
                System.out.print("Introduce la nota de la parte práctica: ");
                notaPractica = sc.nextInt();

                System.out.print("Introduce la nota de la parte de problemas: ");
                notaProblemas = sc.nextInt();

                System.out.print("Introduce la nota de la parte teórica: ");
                notaTeorica = sc.nextInt();

                if (notaPractica >= 0 && notaPractica <= 10 && notaProblemas >= 0 && notaProblemas <= 10 && notaTeorica >= 0 && notaTeorica <= 10) {
                    notaFinal = notaPractica * 0.1 + notaProblemas * 0.5 + notaTeorica * 0.4;
                    System.out.println("La nota final de " + nombre + " es: " + notaFinal);
                    sumaNotas += notaFinal;
                    numAlumnos++;

                    if (notaFinal > notaMaxima) {
                        notaMaxima = notaFinal;
                        nombreNotaMaxima = nombre;
                    }

                    if (notaFinal < notaMinima) {
                        notaMinima = notaFinal;
                        nombreNotaMinima = nombre;
                    }
                } else {
                    System.out.println("Error: alguna de las notas introducidas no está entre 0 y 10.");
                }

                sc.nextLine();
            }
        } while (!nombre.equals("0"));

        if (numAlumnos > 0) {
            System.out.println("Menú:");
            System.out.println("1. Nota máxima");
            System.out.println("2. Nota mínima");
            System.out.println("3. Media de las notas");

           
            int opcion = sc.nextInt();
            while(opcion > 0 && opcion <=3) {
            switch (opcion) {
                case 1->{
                    System.out.println("La nota máxima es " + notaMaxima + " y pertenece a " + nombreNotaMaxima);
                opcion = sc.nextInt();}
                case 2->{
                    System.out.println("La nota mínima es " + notaMinima + " y pertenece a " + nombreNotaMinima);
                    opcion = sc.nextInt();}
                case 3->{
                    double media = sumaNotas / numAlumnos;
                    System.out.println("La media de las notas es " + media);
                    opcion = sc.nextInt();}
                default->{
                    System.out.println("Opción no válida.");
                    opcion = sc.nextInt();}
            }
            }
         }else {
            System.out.println("No se han introducido notas.");
    }
    sc.close();
    }
}
