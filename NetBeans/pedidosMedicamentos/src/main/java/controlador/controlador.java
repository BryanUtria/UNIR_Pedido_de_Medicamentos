/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.modelo;
import vista.vista_2;
import vista.vista_1;

/**
 *
 * @author braya
 */
public class controlador implements ActionListener{
    
    private vista_1 vista1;
    private vista_2 vista2;
    private modelo modelo;

    public controlador(vista_1 vista1, vista_2 vista2, modelo modelo) {
        this.vista1 = vista1;
        this.vista2 = vista2;
        this.modelo = modelo;
        this.vista1.borrarPedido.addActionListener(this);
        this.vista1.confirmarPedido.addActionListener(this);
        this.vista2.cancelar.addActionListener(this);
        this.vista2.enviar.addActionListener(this);
    }
    
    public void iniciar(){
        vista1.setTitle("Sistema de Pedidos de Medicamentos");
        vista1.setLocationRelativeTo(null);
        vista1.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {                                             
        // TODO add your handling code here:
        
        if(evt.getSource() == vista1.borrarPedido){
            vista1.nombreMedicamento.setText("");
            modelo.setNombreMedicamento(vista1.nombreMedicamento.getText());
            vista1.tipoMedicamento.setSelectedIndex(0);
            modelo.setTipoMedicamento(vista1.tipoMedicamento.getItemAt(vista1.tipoMedicamento.getSelectedIndex()));
            vista1.cantidadMedicamento.setText("");
            modelo.setCantidadMedicamento(vista1.cantidadMedicamento.getText());
            vista1.distribuidorFarmaceutico.clearSelection();
            modelo.setDistribuidorFarmaceutico("");
            vista1.farmaciaPrincipal.setSelected(false);
            modelo.setFarmaciaPrincipal("");
            vista1.farmaciaSecundaria.setSelected(false);
            modelo.setFarmaciaSecundaria("");
        }
        
        if(evt.getSource() == vista1.confirmarPedido){
            modelo.setNombreMedicamento(vista1.nombreMedicamento.getText());
            modelo.setTipoMedicamento(vista1.tipoMedicamento.getItemAt(vista1.tipoMedicamento.getSelectedIndex()));
            modelo.setCantidadMedicamento(vista1.cantidadMedicamento.getText());
            if(vista1.rb_cemefar.isSelected()){
                modelo.setDistribuidorFarmaceutico(vista1.rb_cemefar.getText());
            }else if(vista1.rb_cofarma.isSelected()){
                modelo.setDistribuidorFarmaceutico(vista1.rb_cofarma.getText());
            }else if(vista1.rb_empsephar.isSelected()){
                modelo.setDistribuidorFarmaceutico(vista1.rb_empsephar.getText());
            }
            if(vista1.farmaciaPrincipal.isSelected()){
                modelo.setFarmaciaPrincipal(vista1.farmaciaPrincipal.getText());
            }else{
                modelo.setFarmaciaPrincipal("");
            }
            if(vista1.farmaciaSecundaria.isSelected()){
                modelo.setFarmaciaSecundaria(vista1.farmaciaSecundaria.getText());
            }else{
                modelo.setFarmaciaSecundaria("");
            }
            
            if(modelo.validacion(modelo) == null){
                vista2.setLocationRelativeTo(null);
                vista2.setVisible(true);
                vista2.setTitle(modelo.getDistribuidorFarmaceutico());
                vista2.texto1.setText(modelo.getCantidadMedicamento() + " unidades del " + modelo.getTipoMedicamento() + " " + modelo.getNombreMedicamento());
                if(modelo.getFarmaciaPrincipal() == ""){
                    vista2.texto2.setText("Para la farmacia situada en " + modelo.getFarmaciaSecundaria());
                    vista2.texto3.setText("");
                }else if(modelo.getFarmaciaSecundaria() == ""){
                    vista2.texto2.setText("Para la farmacia situada en " + modelo.getFarmaciaPrincipal());
                    vista2.texto3.setText("");
                }
                else if(modelo.getFarmaciaPrincipal() != "" & modelo.getFarmaciaSecundaria() != ""){
                    vista2.texto2.setText("Para la farmacia situada en " + modelo.getFarmaciaPrincipal() + " y para la situada");
                    vista2.texto3.setText("en " + modelo.getFarmaciaSecundaria());
                }
            }else{
                JOptionPane.showMessageDialog(null,modelo.validacion(modelo),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(evt.getSource()==vista2.enviar){
            System.out.print("Pedido enviado");
        }
        
        if(evt.getSource()==vista2.cancelar){
            vista2.setVisible(false);
            vista2.dispose();
        }
    }
}
