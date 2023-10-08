package com.bscu.pedidosmedicamentos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;

public class pedidosMedicamentos extends JFrame {

	private JPanel contentPane;
	private Box verticalBox;
	private Box horizontalBox;
	private JLabel lblNombreDelMedicamento;
	private JTextField nombreMedicamento;
	private Component horizontalStrut;
	private Component verticalStrut;
	private JLabel lblNewLabel_2;
	private Component verticalStrut_1;
	private Box horizontalBox_1;
	private JLabel lblNewLabel_3;
	private Component horizontalStrut_1;
	private JComboBox tipoMedicamento;
	private Component verticalStrut_2;
	private Component verticalStrut_3;
	private Box horizontalBox_2;
	private JLabel lblCantidadDelMedicamento;
	private Component horizontalStrut_2;
	private JTextField cantidadMedicamento;
	private Component verticalStrut_4;
	private Box horizontalBox_3;
	private JLabel lblNewLabel_5;
	private Component horizontalStrut_3;
	private Component verticalStrut_5;
	private JRadioButton rb_cofarma;
	private Component horizontalStrut_4;
	private JRadioButton rb_empsephar;
	private Component horizontalStrut_5;
	private JRadioButton rb_cemefar;
	private Box horizontalBox_4;
	private JLabel lblNewLabel_6;
	private Component horizontalStrut_6;
	private Component verticalStrut_6;
	private JCheckBox farmaciaPrincipal;
	private Component horizontalStrut_7;
	private JCheckBox farmaciaSecundaria;
	private Box horizontalBox_5;
	private JButton confirmarPedido;
	private Component horizontalStrut_8;
	private JButton borrarPedido;
	private Component verticalStrut_7;
	private Component verticalStrut_8;
	private final ButtonGroup distribuidorFarmaceutico = new ButtonGroup();
	private JLabel lblNewLabel;
	private Component horizontalStrut_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pedidosMedicamentos frame = new pedidosMedicamentos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pedidosMedicamentos() {
		setTitle("Sistema de Pedidos de Medicamentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		verticalBox = Box.createVerticalBox();
		verticalBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(verticalBox);
		
		horizontalStrut_9 = Box.createHorizontalStrut(500);
		verticalBox.add(horizontalStrut_9);
		
		verticalStrut_8 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_8);
		
		lblNewLabel = new JLabel("Pedido de Medicamentos");
		lblNewLabel.setAlignmentX(0.5f);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setMinimumSize(new Dimension(615, 16));
		lblNewLabel.setMaximumSize(new Dimension(615, 16));
		lblNewLabel.setPreferredSize(new Dimension(0, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		verticalBox.add(lblNewLabel);
		
		verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		lblNewLabel_2 = new JLabel("Por favor realice el pedido del medicamento segun lo solicitado a continuacion:");
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setMinimumSize(new Dimension(615, 16));
		lblNewLabel_2.setMaximumSize(new Dimension(615, 16));
		lblNewLabel_2.setPreferredSize(new Dimension(0, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		verticalBox.add(lblNewLabel_2);
		
		verticalStrut_1 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_1);
		
		horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		lblNombreDelMedicamento = new JLabel("Nombre del Medicamento:");
		lblNombreDelMedicamento.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreDelMedicamento.setHorizontalTextPosition(SwingConstants.LEFT);
		horizontalBox.add(lblNombreDelMedicamento);
		
		horizontalStrut = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut);
		
		nombreMedicamento = new JTextField();
		nombreMedicamento.setMaximumSize(new Dimension(200, 22));
		nombreMedicamento.setMinimumSize(new Dimension(200, 22));
		nombreMedicamento.setPreferredSize(new Dimension(0, 22));
		nombreMedicamento.setColumns(10);
		horizontalBox.add(nombreMedicamento);
		
		verticalStrut_2 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_2);
		
		horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		lblNewLabel_3 = new JLabel("Tipo del Medicamento:");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		horizontalBox_1.add(lblNewLabel_3);
		
		horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalBox_1.add(horizontalStrut_1);
		
		tipoMedicamento = new JComboBox();
		tipoMedicamento.setMinimumSize(new Dimension(200, 22));
		tipoMedicamento.setMaximumSize(new Dimension(200, 22));
		tipoMedicamento.setPreferredSize(new Dimension(0, 22));
		tipoMedicamento.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion", "Analgésico", "Analéptico", "Anestésico", "Antidepresivo", "Antibióticos"}));
		horizontalBox_1.add(tipoMedicamento);
		
		verticalStrut_3 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_3);
		
		horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		lblCantidadDelMedicamento = new JLabel("Cantidad del Medicamento:");
		lblCantidadDelMedicamento.setHorizontalTextPosition(SwingConstants.LEFT);
		lblCantidadDelMedicamento.setHorizontalAlignment(SwingConstants.LEFT);
		horizontalBox_2.add(lblCantidadDelMedicamento);
		
		horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalBox_2.add(horizontalStrut_2);
		
		cantidadMedicamento = new JTextField();
		cantidadMedicamento.setPreferredSize(new Dimension(0, 22));
		cantidadMedicamento.setMinimumSize(new Dimension(200, 22));
		cantidadMedicamento.setMaximumSize(new Dimension(200, 22));
		cantidadMedicamento.setColumns(8);
		horizontalBox_2.add(cantidadMedicamento);
		
		verticalStrut_4 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_4);
		
		horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3.setAlignmentY(Component.CENTER_ALIGNMENT);
		verticalBox.add(horizontalBox_3);
		
		lblNewLabel_5 = new JLabel("Distribuidor Farmacéutico:");
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		horizontalBox_3.add(lblNewLabel_5);
		
		horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut_3);
		
		rb_cofarma = new JRadioButton("Cofarma");
		distribuidorFarmaceutico.add(rb_cofarma);
		horizontalBox_3.add(rb_cofarma);
		
		horizontalStrut_4 = Box.createHorizontalStrut(10);
		horizontalBox_3.add(horizontalStrut_4);
		
		rb_empsephar = new JRadioButton("Empsephar");
		distribuidorFarmaceutico.add(rb_empsephar);
		horizontalBox_3.add(rb_empsephar);
		
		horizontalStrut_5 = Box.createHorizontalStrut(10);
		horizontalBox_3.add(horizontalStrut_5);
		
		rb_cemefar = new JRadioButton("Cemefar");
		distribuidorFarmaceutico.add(rb_cemefar);
		horizontalBox_3.add(rb_cemefar);
		
		verticalStrut_5 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_5);
		
		horizontalBox_4 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_4);
		
		lblNewLabel_6 = new JLabel("Sucursal Farmaceutica:");
		horizontalBox_4.add(lblNewLabel_6);
		
		horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalBox_4.add(horizontalStrut_6);
		
		farmaciaPrincipal = new JCheckBox("Principal");
		horizontalBox_4.add(farmaciaPrincipal);
		
		horizontalStrut_7 = Box.createHorizontalStrut(10);
		horizontalBox_4.add(horizontalStrut_7);
		
		farmaciaSecundaria = new JCheckBox("Secundaria");
		horizontalBox_4.add(farmaciaSecundaria);
		
		verticalStrut_6 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_6);
		
		horizontalBox_5 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_5);
		
		confirmarPedido = new JButton("Confirmar");
		horizontalBox_5.add(confirmarPedido);
		confirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarPedidoActionPerformed(evt);
            }
        });
		
		horizontalStrut_8 = Box.createHorizontalStrut(20);
		horizontalBox_5.add(horizontalStrut_8);
		
		borrarPedido = new JButton("Borrar");
		borrarPedido.setPreferredSize(new Dimension(79, 23));
		borrarPedido.setMinimumSize(new Dimension(79, 23));
		borrarPedido.setMaximumSize(new Dimension(79, 23));
		horizontalBox_5.add(borrarPedido);
		borrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarPedidoActionPerformed(evt);
            }
        });
		
		verticalStrut_7 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_7);
	}
	
	private void borrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        if(evt.getSource()==borrarPedido){
            nombreMedicamento.setText("");
            tipoMedicamento.setSelectedIndex(0);
            cantidadMedicamento.setText("");
            distribuidorFarmaceutico.clearSelection();
            farmaciaPrincipal.setSelected(false);
            farmaciaSecundaria.setSelected(false);
        }
    }  
	
	private void confirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        int ascii_mayusculas_menor = 65;
        int ascii_mayusculas_mayor = 90;
        int ascii_minusculas_menor = 97;
        int ascii_minusculas_mayor = 122;
        int ascii_espacio = 32;
        char caracter;
        boolean banErrorNombre;
        
        if(evt.getSource()==confirmarPedido){
            try{
                if(!nombreMedicamento.getText().isEmpty()){
                    banErrorNombre = false;
                    for(int i=0; i<nombreMedicamento.getText().length(); i++){
                        caracter = nombreMedicamento.getText().charAt(i);
                        
                        if((caracter >= ascii_mayusculas_menor && caracter <= ascii_mayusculas_mayor) || (caracter >= ascii_minusculas_menor && caracter <= ascii_minusculas_mayor) || caracter == ascii_espacio){}
                        else{
                            banErrorNombre = true;
                        }
                    }
                    if(banErrorNombre == false){
                        if(tipoMedicamento.getSelectedIndex()!=0){
                            String medicamentoCantidad = cantidadMedicamento.getText();
                            try {
                                int medicamentoCantidadNumero = Integer.parseInt(medicamentoCantidad);
                                if(medicamentoCantidadNumero >= 1){
                                    if(rb_cofarma.isSelected() || rb_empsephar.isSelected() || rb_cemefar.isSelected()){
                                        if(farmaciaPrincipal.isSelected() || farmaciaSecundaria.isSelected()){
                                            String nombre = nombreMedicamento.getText();
                                            String tipo = (String) tipoMedicamento.getSelectedItem();
                                            int cantidad = medicamentoCantidadNumero;
                                            String distribuidor = "";
                                            if(rb_cofarma.isSelected()){
                                                distribuidor = rb_cofarma.getText();
                                            }else if(rb_empsephar.isSelected()){
                                                distribuidor = rb_empsephar.getText();
                                            }else if(rb_cemefar.isSelected()){
                                                distribuidor = rb_cemefar.getText();
                                            }
                                            String sucursalPrincipal = "";
                                            String sucursalSecundaria = "";
                                            if(farmaciaPrincipal.isSelected()){
                                                sucursalPrincipal = "Calle de la Rosa n. 28";
                                            }
                                            if(farmaciaSecundaria.isSelected()){
                                                sucursalSecundaria = "Calle Alcazabilla n. 3";
                                            }
                                            JFrame ConfirmarPedidosMedicamentos = new confirmarPedidosMedicamentos(nombre,tipo,cantidad,distribuidor,sucursalPrincipal,sucursalSecundaria);
                                            ConfirmarPedidosMedicamentos.setVisible(true);

                                        }else{
                                            JOptionPane.showMessageDialog(this,"Por favor seleccione una sucursal farmaceutica.","Mensaje de Error - 'Sucursal Farmaceutica:'",JOptionPane.ERROR_MESSAGE);
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(this,"Por favor seleccione un distribuidor farmaceutico.","Mensaje de Error - 'Distribuidor Farmacéutico:'",JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(this,"Por favor ingrese un numero mayor a cero.","Mensaje de Error - 'Cantidad del Medicamento:'",JOptionPane.ERROR_MESSAGE);
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(this,"Por favor ingrese un numero entero.","Mensaje de Error - 'Cantidad del Medicamento:'",JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this,"Por favor seleccione un tipo de medicamento.","Mensaje de Error - 'Tipo del Medicamento:'",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this,"Por favor ingrese solo letras.","Mensaje de Error - 'Nombre del Medicamento:'",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Por favor ingrese el nombre del medicamento.","Mensaje de Error - 'Nombre del Medicamento:'",JOptionPane.ERROR_MESSAGE);
                }
            }catch(HeadlessException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }

}
