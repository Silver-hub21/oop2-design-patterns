package decorator.ejercicio2;

public class Carne extends ComboDecorator {
    public Carne(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Carne";
    }

    @Override
    public double precio() {
        return super.precio() + 50.0; // Precio adicional por la carne
    }

}
