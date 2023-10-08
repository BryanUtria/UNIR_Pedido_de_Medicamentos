/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

import controlador.controlador;
import modelo.modelo;
import vista.vista_1;
import vista.vista_2;

/**
 *
 * @author braya
 */
public class mvc {
    
    public static void main(String[] args) {
        modelo modelo = new modelo();
        vista_1 vista1 = new vista_1();
        vista_2 vista2 = new vista_2();
        controlador control = new controlador(vista1, vista2,modelo);
        control.iniciar();
    }
    
}
