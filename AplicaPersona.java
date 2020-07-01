package examen;

import java.util.Scanner;

public class AplicaPersona {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArregloPersona per = new ArregloPersona("");
        int opcion;
        do {
            System.out.println("\tMenu de Opciones");
            System.out.println("=====================================");
            System.out.println("[1] Ingrese los Datos de Las Personas");
            System.out.println("[2] Eliminar Datos de Las Personas");
            System.out.println("[3] Mostrar Datos de Las Personas");
            System.out.println("[4] Buscar una Persona y Mostrar sus Datos");
            System.out.println("===========================================");
            System.out.println("[0] Salir");

            System.out.println("\nIngrese una opcion: ");
            opcion = teclado.nextInt();
            System.out.println();

            if (opcion == 1) {
                for (int i = 0; i < 4; i++) {
                    System.out.println("Ingrese Los Datos Del Trabajador");
                    System.out.println("================================");
                    System.out.println("Ingrese Codigo del Trabajador: ");
                    String codigo = teclado.next();
                    System.out.println("Ingrese Nombre del Trabajador: ");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el monto que gana por hora: ");
                    double tarifa = teclado.nextDouble();
                    System.out.println("Ingrese las horas que trabaja al mes: ");
                    int horas = teclado.nextInt();
                    per.registrar(i, codigo, nombre, tarifa, horas);

                }
            } else if (opcion == 2) {
                System.out.println("Eliminar");
                System.out.println("==============");
                per.eliminarTrabajador();
            } else if (opcion == 3) {
                System.out.println("Mostrar");
                System.out.println("==============");
                per.MostrarDatos();
            } else if (opcion == 4) {
                System.out.println("Buscar");
                System.out.println("==============");
                per.buscarTrabajador();
            }
        } while (opcion != 0);
    }
}
