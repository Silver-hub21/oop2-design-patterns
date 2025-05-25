package composite.ejercicio1;

import java.util.List;

public class Director extends Empleado {

    public Director(String nombre, String apellido, double salario, List<Empleado> gerentes) {
        super(nombre, apellido, salario, gerentes);
    }

}
