/*
 Ejercicio de Documentación
 * Empleados - Versión sin documentación
 */

// Push

public class Empleado1 {
// prueba 9/12
 // prueba pull
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    //Metodos publicos
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }

    //Metodos privados
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }

    //Constructores
    public Empleado1() {
        this("", "", 0, 0);
    }

    public Empleado1(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}

