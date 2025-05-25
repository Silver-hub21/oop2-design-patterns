package composite.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
    private final String nombre;
    private final String apellido;
    private final double salario;
    private List<Empleado> subEmpleados;

    public Empleado(String nombre, String apellido, double salario, List<Empleado> subEmpleados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.subEmpleados = subEmpleados;
    }

    public String nombre() {
        return nombre;
    }

    public String apellido() {
        return apellido;
    }

    public double salario() {
        return salario;
    }

    public void addSubEmpleado(Empleado empleado) {
        this.subEmpleados().add(empleado);
    }

    public void removeSubEmpleado(Empleado empleado) {
        this.subEmpleados().remove(empleado);
    }

    public List<Empleado> subEmpleados() {
        return this.subEmpleados;
    }

    public double calcularSalarioTotal() {
        double total = this.salario();
        if (this.subEmpleados.isEmpty()) {
            return total;
        } else {
            for (Empleado empleado : subEmpleados()) {
                total += empleado.calcularSalarioTotal();
            }
        }
        return total;
    }

}
