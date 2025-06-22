package decorator.ejercicio1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File archivo = new File("reporte.txt");
        ReporteManager reporteBase = new Reporte("Este es el contenido del reporte.");
        ReporteManager estricto = new ReporteDecoratorEstricto(reporteBase);

        try {
            estricto.export(archivo);
        } catch (Exception e) {
            System.out.println("Estricto: " + e.getMessage());
        }

        ReporteManager flexible = new ReporteDecoratorFlexible(reporteBase);

        try {
            flexible.export(archivo);
        } catch (Exception e) {
            System.out.println("Flexible: " + e.getMessage());
        }
    }
}

