package com.bscu.pedidosmedicamentos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class confirmarPedidosMedicamentos extends JFrame {

	private JPanel contentPane;
	private JButton enviar = new JButton("Enviar");
	private JButton cancelar = new JButton("Cancelar");

	public confirmarPedidosMedicamentos(String nombre, String tipo, int cantidad, String distribuidor, String sucursalPrincipal, String sucursalSecundaria) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(400);
		horizontalStrut_1.setMaximumSize(new Dimension(615, 16));
		verticalBox.add(horizontalStrut_1);
		
		Component verticalStrut_1_1_1_2 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_1_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Pedido de Medicamentos");
		lblNewLabel.setPreferredSize(new Dimension(0, 16));
		lblNewLabel.setMinimumSize(new Dimension(615, 16));
		lblNewLabel.setMaximumSize(new Dimension(615, 16));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(lblNewLabel);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		JLabel lblNewLabel_1 = new JLabel("Por favor confirmar el pedido segun lo diligenciado anteriormente");
		lblNewLabel_1.setAlignmentX(0.5f);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setPreferredSize(new Dimension(0, 16));
		lblNewLabel_1.setMinimumSize(new Dimension(615, 16));
		lblNewLabel_1.setMaximumSize(new Dimension(615, 16));
		verticalBox.add(lblNewLabel_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_1);
		
		JLabel texto1 = new JLabel("Texto 1");
		texto1.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(texto1);
		
		Component verticalStrut_1_1 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_1_1);
		
		JLabel texto2 = new JLabel("Texto 2");
		texto2.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(texto2);
		
		Component verticalStrut_1_1_1 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_1_1_1);
		
		JLabel texto3 = new JLabel("Texto 3");
		texto3.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(texto3);
		
		Component verticalStrut_1_1_1_1 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_1_1_1_1);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		enviar.setPreferredSize(new Dimension(0, 23));
		enviar.setMinimumSize(new Dimension(75, 23));
		enviar.setMaximumSize(new Dimension(75, 23));
		enviar.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox.add(enviar);
		enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
		
		Component horizontalStrut = Box.createHorizontalStrut(40);
		horizontalBox.add(horizontalStrut);
		
		cancelar.setAlignmentX(Component.CENTER_ALIGNMENT);
		horizontalBox.add(cancelar);
		cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);
		
		setTitle(distribuidor);
        texto1.setText(cantidad + " unidades del " + tipo + " " + nombre);
        if(sucursalPrincipal == ""){
            texto2.setText("Para la farmacia situada en " + sucursalSecundaria);
            texto3.setText("");
        }else if(sucursalSecundaria == ""){
            texto2.setText("Para la farmacia situada en " + sucursalPrincipal);
            texto3.setText("");
        }
        else if(sucursalPrincipal != "" & sucursalSecundaria != ""){
            texto2.setText("Para la farmacia situada en " + sucursalPrincipal + " y para la situada");
            texto3.setText("en " + sucursalSecundaria);
        }
	}
	
	private void enviarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(evt.getSource()==enviar){
            System.out.println("Pedido enviado");
        }
    }                                      

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(evt.getSource()==cancelar){
        	setVisible(false);
            dispose();
        }
    }     
	

}
