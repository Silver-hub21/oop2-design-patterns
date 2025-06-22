package observer.ejercicio2.ui;

import observer.ejercicio2.model.Participantes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AgregarParticipante extends JFrame {
    private final Participantes listaDeParticipantes;
    private JTextField nombre;
    private JTextField telefono;
    private JTextField region;
    private JTextField email;  // ✅ Campo que faltaba

    public AgregarParticipante(Participantes participantes) {
        this.listaDeParticipantes = participantes;
        setupUIComponents();
    }

    private void setupUIComponents() {
        setTitle("Agregar Participante");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.nombre = new JTextField(10);
        this.telefono = new JTextField(10);
        this.region = new JTextField(10);
        this.email = new JTextField(15); // ✅ Inicializado

        this.nombre.setText("");
        this.telefono.setText("");
        this.region.setText("China");
        this.email.setText("");

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new FlowLayout());


        contentPane.add(new JLabel("Nombre: "));
        contentPane.add(nombre);
        contentPane.add(new JLabel("Teléfono: "));
        contentPane.add(telefono);
        contentPane.add(new JLabel("Región: "));
        contentPane.add(region);
        contentPane.add(new JLabel("Email: "));
        contentPane.add(email);

        // Botón
        JButton botonCargar = new JButton("Cargar");
        botonCargar.addActionListener((ActionEvent e) -> {
            try {
                onBotonCargar();
            } catch (RuntimeException e1) {
                JOptionPane.showMessageDialog(
                        AgregarParticipante.this,
                        e1.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        contentPane.add(botonCargar);
        setContentPane(contentPane);
        contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        pack();
        setVisible(true);
    }

    private void onBotonCargar() {
        try {
            listaDeParticipantes.nuevoParticipante(
                    nombre.getText(),
                    telefono.getText(),
                    region.getText(),
                    email.getText()
            );
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            dispose();
        }
    }
}

