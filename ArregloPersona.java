package examen;

import java.util.Scanner;

public class ArregloPersona {

    Scanner teclado = new Scanner(System.in);

    private String nombre;
    private Persona[] perso = new Persona[4];

    public ArregloPersona(String nombre) {
        this.nombre = nombre;
        for (int i = 0; i < 4; i++) {
            perso[i] = new Persona();
        }
    }

    public void registrar(int pos, String cod, String nombre, double tarifa, int horas) {
        perso[pos].registrar(cod, nombre, tarifa, horas);
    }

    public void MostrarDatos() {
        System.out.println("Empresa :" + nombre);
        for (int i = 0; i < 4; i++) {
            perso[i].mostrar();
        }
    }

    public void eliminarTrabajador() {
        String EliminarCode;
        System.out.println("Ingrese el codigo a Eliminar: ");
        EliminarCode = teclado.next();
        for (int i = 1; i < perso.length - 1; i--) {
            if (perso[i].BusqueCodigo().equals(EliminarCode)) {
            }
            System.out.println("Datos eliminados");

        }

    }

    public void buscarTrabajador() {
        String BuscarCode;
        System.out.println("Ingrese codigo del trabajador a Buscar: ");
        BuscarCode = teclado.next();
        for (int i = 0; i < perso.length; i++) {
            if (perso[i].BusqueNombre().equals(BuscarCode)) {
                perso[i].mostrar();
            }
        }
    }
}
