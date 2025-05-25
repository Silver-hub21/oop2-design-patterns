package composite.ejercicio1;

import java.util.List;

public class EmpleadoRegular extends Empleado {

    public EmpleadoRegular(String nombre, String apellido, double salario) {
        super(nombre, apellido, salario, null);
    }


    @Override
    public void addSubEmpleado(Empleado empleado) {

    }

    @Override
    public void removeSubEmpleado(Empleado empleado) {

    }

    @Override
    public List<Empleado> subEmpleados() {
        return List.of();
    }

    @Override
    public double calcularSalarioTotal() {
        return salario();
    }
}
