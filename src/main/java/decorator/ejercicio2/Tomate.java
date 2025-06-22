package decorator.ejercicio2;

public class Tomate extends ComboDecorator {
    public Tomate(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Tomate";
    }

    @Override
    public double precio() {
        return super.precio() + 15.0; // Precio adicional por el tomate
    }
}
