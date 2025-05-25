package composite.ejercicio1;

import java.util.List;

public class Gerente extends Empleado {

    public Gerente(String nombre, String apellido, double salario, List<Empleado> mandosMedio) {
        super(nombre, apellido, salario, mandosMedio);
    }

}
