//Fernanda Morales  18/10/2024
//Programa que crea un objeto de la clase Paciente,
//calcula su IMC y maneja excepciones de entrada y de valores de atributos

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente p = new Paciente(); //Creación del objeto paciente

        try {
            //Entrada de datos con manejo de excepciones
            System.out.print("Ingrese su peso en kg: ");
            p.setPeso(sc.nextDouble()); //Llama al setter para establecer el peso o no
            System.out.print("Ingrese su altura en metros: ");
            p.setAltura(sc.nextDouble()); //Llama al setter para establecer la altura o no

            //Calcular el IMC a través del objeto paciente
            String diagnostico = p.calcularIMC(); //Invocación al metodo "calcularIMC"
            System.out.println("El diagnóstico es: " + diagnostico);

        } catch (InputMismatchException e) { //Captura los errores de entrada
            System.out.println("¡Error! Debe ingresar un número válido.");
        } catch (IllegalArgumentException e) { //Captura excepciones lanzadas por los setters
            System.out.println("¡Error! " + e.getMessage());
        }
        sc.close();
    }
}