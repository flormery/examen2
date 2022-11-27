/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.app;

import pe.edu.upeu.gui.ViuGame;
import pe.edu.upeu.modelo.ControlMF;
import pe.edu.upeu.modelo.ModeloMF;

/**
 *
 * @author Usuario
 */
public class EvaluacionUnidad2 {

    public static void main(String[] args) {
        ModeloMF model = new ModeloMF();
        ViuGame view = new ViuGame();
        ControlMF controlador = new ControlMF(view, model);
        view.setLocationRelativeTo(null);        
        view.setVisible(true); 
    }
}
