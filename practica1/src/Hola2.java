// Importa el paquete de datos.
import java.util.Scanner;
// Bloque de comentarios.
/**
 * Hola2.java
 * Programa ejemplo que muestra mensajes por pantalla con información variable.
 * Incluye configuración de entrada fácil por teclado y la utiliza para dar un mensaje personalizado.
 * doj - 2016.10.07
 */

//  Encabezado de la clase principal.
public class Hola2 {
	private static Scanner teclado;

	// Inicio del programa
	public static void main(String argumentos[])
	{
		teclado = new Scanner(System.in);
		
		int num ;				// variable numérica
		String nombre = "";		// variable de texto 
		
		// Establece una variable y su valor
		num = 1 ;
		//Mmuestra mensaje de bienvenida
		System.out.println("Hola, Soy un modesto ");
		System.out.print("programa de ordenador... \n");
		System.out.println("Mi número de orden es el " + num + " por ser el primero.");

		
		// Pide nombre
		System.out.println("\nDíme tu nombre: ");
		
		// Establece variable por entrada de texto
		nombre = teclado.nextLine();
		
		// muestra mensaje personalizado
		System.out.println("\nBienvenido a Java. \n" + nombre + ", espero que lo pases bien...");
		
	}

}