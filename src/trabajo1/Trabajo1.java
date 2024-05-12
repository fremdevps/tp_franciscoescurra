package trabajo1;

import java.util.ArrayList;
import java.util.Scanner;

/*
dentro del paquete:
	a) Desarrollar un programa Java que pida por teclado las alturas de N alumnos de una
	clase y las guarde en un ArrayList de tipo Double.
	b) A continuación el programa calculará cuantos alumnos hay más altos que la media
	y cuantos más bajos.
	c) Para resolverlo vamos a utilizar 4 métodos además del método main:
	 Método numeroAlumnos(): este método pide por teclado el número de
	alumnos de la clase y devuelve dicho número al programa principal.
	 Método leerAlturas(): pide por teclado las alturas de los N alumnos y las
	almacena en el ArrayList. Este método recibe como parámetros el ArrayList
	inicialmente vacío y el número de alumnos a leer.
	 Método calcularMedias(): calcula y devuelve la media de los alumnos de la
	clase. Este método recibe como parámetro el ArrayList con las alturas de
	todos los alumnos.
	 Método mostrarResultados(): muestra por pantalla todas las alturas y calcula
	y muestra el número de alumnos con altura superior e inferior a la media.
	Recibe como parámetros el ArrayList con las alturas de todos los alumnos y
	la media calculada anteriormente.
*/
public class Trabajo1 {

	private int numeroAlumnos;
	private double media;
	private double sumaAlturas;
	private int alumnosMasAltos;
	private int alumnosMasBajos;
	private ArrayList<Double> alturas;
	Scanner sc = new Scanner(System.in);

	public Trabajo1() {
		numeroAlumnos = 0;
		media = 0;
		sumaAlturas = 0;
		alumnosMasAltos = 0;
		alumnosMasBajos = 0;
		alturas = new ArrayList<Double>();
	}

	public void numeroAlumnos() {

		System.out.print("Introduce el número de alumnos de la clase: ");
		numeroAlumnos = sc.nextInt();
	}

	public void leerAlturas() {

		// Agregar Try Catch para evitar errores ,cuaando el user no ingresa un numero
		// correcto volver a pedir el numero

		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.print("Introduce la altura del alumno " + (i + 1) + ": ");
			try {
				double altura = sc.nextDouble();
				alturas.add(altura);
			} catch (Exception e) {
				System.out.println("Introduce un numero valido");
				sc.next();
				i--;
			}
		}

	}

	public void calcularMedias() {
		for (int i = 0; i < numeroAlumnos; i++) {
			sumaAlturas += alturas.get(i);
		}
		media = sumaAlturas / numeroAlumnos;
	}

	public void mostrarResultados() {
		System.out.println("Alturas de los alumnos: ");
		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.println("Alumno " + (i + 1) + ": " + alturas.get(i));
			if (alturas.get(i) > media) {
				alumnosMasAltos++;
			} else if (alturas.get(i) < media) {
				alumnosMasBajos++;
			}
		}
		System.out.println("Numero de alumnos mas altos que la media: " + alumnosMasAltos);
		System.out.println("Numero de alumnos mas bajos que la media: " + alumnosMasBajos);
	}
}
