package adapter.ejercicio2;

import java.util.List;

//Composite implementa Figura y se compone de Figura para delegar
public class Dibujo implements Figura {
    private List<Figura> figuras;

    public Dibujo(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public void dibujar(Panel panel) {
        this.figuras.stream().forEach(figura -> figura.dibujar(panel));
    }
}