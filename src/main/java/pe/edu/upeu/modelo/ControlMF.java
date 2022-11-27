/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.modelo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import pe.edu.upeu.gui.ViuGame;

/**
 *
 * @author Usuario
 */
public class ControlMF {

    private ViuGame view;
    private ModeloMF model;
    private JLabel[][] casillas;

    public ControlMF(ViuGame view, ModeloMF model) {
        this.view = view;
        this.model = model;
        casillas = view.getCasillas();
        agregarListeners();
    }

    private void agregarListeners() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                agregarEventoMouse(i,j);
            }

        }
    }
    private void agregarEventoMouse(int i, int j) {
        JLabel casillaActual = casillas[i][j];
        casillaActual.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.marcarCasilla(i,j, casillas);
            }
        });
    }
}
