package template;

import org.junit.jupiter.api.Test;
import template.ejercicio1.Calculador;
import template.ejercicio1.CalculadorJubilado;
import template.ejercicio1.CalculadorNoJubilado;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IVAtest {
    //dos casos de test para probar el cobro del IVA
    @Test
    public void testCalcularPrecioJubiladoPromocion() {
        Calculador calculador = new CalculadorJubilado();
        calculador.setMesEnPromocion(6); // junio
        double precioProducto = 100.0;
        double precioFinal = calculador.calcularPrecio(precioProducto);
        System.out.println("Precio final para jubilado: " + precioFinal);
        assertEquals(100.0, precioFinal, 0.01); // 100 (Está en el mes de promoción, no se aplica IVA)
    }

    @Test
    public void testCalcularPrecioNoJubiladoSinPromocion() {
        Calculador calculador = new CalculadorNoJubilado();
        calculador.setMesEnPromocion(7); // julio
        double precioProducto = 100.0;
        double precioFinal = calculador.calcularPrecio(precioProducto);
        System.out.println("Precio final para no jubilado: " + precioFinal);
        assertEquals(121.0, precioFinal, 0.01); // 100 + 21% IVA = 121 (No está en el mes de promoción)
    }

    @Test
    void testCalcularPrecioNoJubiladoConPromocion() {
        Calculador calculador = new CalculadorNoJubilado();
        calculador.setMesEnPromocion(6); // junio
        double precioProducto = 100.0;
        double precioFinal = calculador.calcularPrecio(precioProducto);
        System.out.println("Precio final para no jubilado en promoción: " + precioFinal);
        assertEquals(115.0, precioFinal, 0.01); // 100 + 15% IVA = 115 (Está en el mes de promoción)
    }

    @Test
    public void testCalcularPrecioJubiladoSinPromocion() {
        Calculador calculador = new CalculadorJubilado();
        calculador.setMesEnPromocion(7); // julio
        double precioProducto = 100.0;
        double precioFinal = calculador.calcularPrecio(precioProducto);
        System.out.println("Precio final para jubilado sin promoción: " + precioFinal);
        assertEquals(110.0, precioFinal, 0.01); // 100 + 10% IVA = 110 (No está en el mes de promoción)
    }

}
