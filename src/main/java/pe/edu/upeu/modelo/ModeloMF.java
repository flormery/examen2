/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.modelo;

import javax.swing.JLabel;



/**
 *
 * @author Usuario
 */
public class ModeloMF {
    public void marcarCasilla(int i, int j, JLabel[][] casillas){
        casillas[i][j].setText("X");
    }
}
