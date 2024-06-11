/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.tresenrayamv;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String args[]){
        Modelo model= new Modelo();
        Vista vista=new Vista();
        Controlador controlador = new Controlador(vista,model);
        controlador.vista.setLocationRelativeTo(null);
        //vista.setLocationRelativeTo(null);
        controlador.vista.setVisible(true);
    }
    
}
