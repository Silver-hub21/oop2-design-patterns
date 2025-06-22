package decorator.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Combo combo = new Basico("Combo Básico");
        System.out.println("Combo Básico:");
        System.out.println("Descripción: " + combo.descripcion());
        System.out.println("Precio: " + combo.precio());

        combo = new Queso(combo);
        System.out.println("\nCombo con Queso:");
        System.out.println("Descripción: " + combo.descripcion());
        System.out.println("Precio: " + combo.precio());

        combo = new Tomate(combo);
        System.out.println("\nCombo con Queso y Tomate:");
        System.out.println("Descripción: " + combo.descripcion());
        System.out.println("Precio: " + combo.precio());
    }
}
