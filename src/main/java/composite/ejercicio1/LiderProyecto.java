package composite.ejercicio1;

import java.util.List;

public class LiderProyecto extends Empleado {

    public LiderProyecto(String nombre, String apellido, double salario, List<Empleado> empleados) {
        super(nombre, apellido, salario, empleados);
    }
}
