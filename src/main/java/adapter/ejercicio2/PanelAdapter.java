package adapter.ejercicio2;

import java.awt.*;

public class PanelAdapter implements Panel {
    private Graphics2D g2d;

    public PanelAdapter(Graphics2D g2d) {
        this.g2d = g2d;
    }

    @Override
    public void dibujarLinea(int x, int y, int i, int y1) {
        this.g2d.drawLine(x, y, i, y1);
    }

    @Override
    public void dibujarTexto(String texto, int x, int y) {
        this.g2d.drawString(texto, x, y);
    }

    @Override
    public void dibujarCirculo(int i, int i1, int i2, int i3) {
        this.g2d.drawOval(i, i1, i2, i3);
    }
}
