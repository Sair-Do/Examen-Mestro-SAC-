package examen;

public class Persona {

    private String codigo;
    private String nombre;
    private double tarifa;
    private int horas;
    private double sueldo;

    public void registrar(String codigo, String nom, double tarifa, int horas) {
        this.codigo = codigo;
        this.nombre = nom;
        this.tarifa = tarifa;
        this.horas = horas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double retSueldo() {
        return tarifa * horas;
    }

    public String BusqueCodigo() {
        return nombre;
    }

    public String BusqueNombre() {
        return nombre;
    }

   public double HallarSueldo() {
        double sueldo;
        sueldo = (horas * tarifa);
        return sueldo;
    }

   public void mostrar(){
       System.out.println("===================================");
       System.out.println("===================================");
        System.out.println("Codigo     : " + codigo);
        System.out.println("Nombre     : " + nombre);
        System.out.println("Tarifa     : " + tarifa);
        System.out.println("Horas      : " + horas);
        System.out.println("Sueldo     : " + HallarSueldo());
        System.out.println("===================================");
        System.out.println("===================================");
    }
}
