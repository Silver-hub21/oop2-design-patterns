package observer.ejercicio2.main;

import observer.ejercicio2.model.Participantes;
import observer.ejercicio2.persistencia.RegistrarEnArchivo;
import observer.ejercicio2.ui.AgregarParticipante;

import java.awt.*;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AgregarParticipante(new Participantes(
                            new RegistrarEnArchivo()));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }

}
