    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.pilasycolasumg;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Ana Maria
 */
public class PilasYColasUMG {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Usar Pilas");
            System.out.println("2. Usar Colas");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            long tiempoInicio, tiempoFin;
            switch (opcion) {
                case 1:
                    Stack<Integer> pila = new Stack<>();
                    System.out.println("Generando números aleatorios para la pila...");
                    tiempoInicio = System.currentTimeMillis();
                    generarYAlmacenarNumerosAleatorios("numeros_pila.txt", 1000000);
                    tiempoFin = System.currentTimeMillis();
                    System.out.println("Tiempo de generación y almacenamiento de números aleatorios para la pila: " + (tiempoFin - tiempoInicio) + " milisegundos");

                    tiempoInicio = System.currentTimeMillis();
                    procesarPila(pila);
                    tiempoFin = System.currentTimeMillis();
                    System.out.println("Tiempo de procesamiento de la pila: " + (tiempoFin - tiempoInicio) + " milisegundos");
                    break;
                case 2:
                    Queue<Integer> cola = new LinkedList<>();
                    System.out.println("Generando números aleatorios para la cola...");
                    tiempoInicio = System.currentTimeMillis();
                    generarYAlmacenarNumerosAleatorios("numeros_cola.txt", 1000000);
                    tiempoFin = System.currentTimeMillis();
                    System.out.println("Tiempo de generación y almacenamiento de números aleatorios para la cola: " + (tiempoFin - tiempoInicio) + " milisegundos");

                    tiempoInicio = System.currentTimeMillis();
                    procesarCola(cola);
                    tiempoFin = System.currentTimeMillis();
                    System.out.println("Tiempo de procesamiento de la cola: " + (tiempoFin - tiempoInicio) + " milisegundos");
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static void generarYAlmacenarNumerosAleatorios(String nombreArchivo, int cantidad) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo);
            Random random = new Random();
            for (int i = 0; i < cantidad; i++) {
                int numero = random.nextInt(20000001) - 10000000; // Números entre -10,000,000 y 10,000,000
                escritor.write(numero + "\n");
            }
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void procesarPila(Stack<Integer> pila) {
        // Aquí puedes cargar los números desde el archivo y luego procesar la pila
        // O bien, simplemente eliminar esta función si no necesitas procesar la pila en este punto
    }

    public static void procesarCola(Queue<Integer> cola) {
        // Aquí puedes cargar los números desde el archivo y luego procesar la cola
        // O bien, simplemente eliminar esta función si no necesitas procesar la cola en este punto
    }
}
