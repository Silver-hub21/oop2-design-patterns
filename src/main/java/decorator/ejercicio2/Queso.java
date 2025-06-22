package decorator.ejercicio2;

public class Queso extends ComboDecorator {
    public Queso(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Queso";
    }

    @Override
    public double precio() {
        return super.precio() + 20.0; // Precio adicional por el queso
    }
}
