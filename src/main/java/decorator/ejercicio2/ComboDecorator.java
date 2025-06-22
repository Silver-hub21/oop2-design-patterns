package decorator.ejercicio2;

public abstract class ComboDecorator implements Combo {
    private Combo combo;

    public ComboDecorator(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return combo.descripcion();
    }

    @Override
    public double precio() {
        return combo.precio();
    }
}
