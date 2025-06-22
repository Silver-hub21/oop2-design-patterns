package decorator.ejercicio2;

public class Papas extends ComboDecorator {
    public Papas(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Papas";
    }

    @Override
    public double precio() {
        return super.precio() + 30.0; // Precio adicional por las papas
    }
}
