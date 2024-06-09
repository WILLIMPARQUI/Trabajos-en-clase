/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.tresenrayamv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Controlador {

    private Vista vista;
    private Modelo model;
    private JLabel[][] casillas;

    public Controlador(Vista vista, Modelo model) {
        this.vista = vista;
        this.model = model;
        JLabel[][] casillas = vista.getCasillas();
        agregarListener();
        crearJugadores();

    }

    private void agregarListener() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                agregarEventoMouse(i, j);
            }

        }
        JButton boton = vista.getbotonReset();
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.resetGame(casillas);
            }
        });
    }

    private void agregarEventoMouse(int i, int j) {

        JLabel casillaActual = casillas[i][j];
        casillaActual.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                model.marcarCasilla(i, j, casillas);
            }
        });
    }

    private void crearJugadores() {
        JLabel j1 = vista.getVictoriasJ1();
        JLabel j2 = vista.getVictoriasJ2();
        model.setJugadores(j1, j2);
    }
}
