package observer.ejercicio1;

public class ClimaPorConsola implements ClimaObserver {
    @Override
    public void actualizar(String temperatura) {
        //convertir los strings a enteros
        int temp = (int) Double.parseDouble(temperatura.replace(" c", "").trim());
        System.out.println("Temperatura actualizada: \n" + temperatura);
        if (temp < 12) {
            System.out.println("Hace frío, se encenderá la caldera. \n");
        }
        if (temp > 17) {
            System.out.println("Hace calor, se encenderá el aire acondicionado. \n");
        }
    }
}
