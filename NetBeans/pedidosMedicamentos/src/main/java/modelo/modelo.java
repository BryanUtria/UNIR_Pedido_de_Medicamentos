/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.HeadlessException;

/**
 *
 * @author braya
 */
public class modelo {
    private String nombreMedicamento = "";
    private String tipoMedicamento = "";
    private String cantidadMedicamento = "";
    private String distribuidorFarmaceutico = "";
    private String farmaciaPrincipal = "";
    private String farmaciaSecundaria = "";
    
    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }
    
    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }
    
    public String getCantidadMedicamento() {
        return cantidadMedicamento;
    }

    public void setCantidadMedicamento(String cantidadMedicamento) {
        this.cantidadMedicamento = cantidadMedicamento;
    }
    
    public String getDistribuidorFarmaceutico() {
        return distribuidorFarmaceutico;
    }

    public void setDistribuidorFarmaceutico(String distribuidorFarmaceutico) {
        this.distribuidorFarmaceutico = distribuidorFarmaceutico;
    }
    
    public String getFarmaciaPrincipal() {
        return farmaciaPrincipal;
    }

    public void setFarmaciaPrincipal(String farmaciaPrincipal) {
        this.farmaciaPrincipal = farmaciaPrincipal;
    }

    public String getFarmaciaSecundaria() {
        return farmaciaSecundaria;
    }

    public void setFarmaciaSecundaria(String farmaciaSecundaria) {
        this.farmaciaSecundaria = farmaciaSecundaria;
    }
    
    public String validacion(modelo modelo){
        
        int ascii_mayusculas_menor = 65;
        int ascii_mayusculas_mayor = 90;
        int ascii_minusculas_menor = 97;
        int ascii_minusculas_mayor = 122;
        int ascii_numero_menor = 48;
        int ascii_numero_mayor = 57;
        int ascii_espacio = 32;
        char caracter;
        int banErrorNombre;
        String errores = null;
        
        try{
            if(!modelo.getNombreMedicamento().isEmpty()){
                banErrorNombre = 0;
                for(int i=0; i<modelo.getNombreMedicamento().length(); i++){
                    caracter = modelo.getNombreMedicamento().charAt(i);

                    if(modelo.getNombreMedicamento().charAt(0) == ascii_espacio){
                        banErrorNombre = 1;
                    }else if((caracter >= ascii_mayusculas_menor && caracter <= ascii_mayusculas_mayor) || (caracter >= ascii_minusculas_menor && caracter <= ascii_minusculas_mayor) || caracter == ascii_espacio || (caracter >= ascii_numero_menor && caracter <= ascii_numero_mayor)){}
                    else{
                        banErrorNombre = 2;
                    }
                }
                if(banErrorNombre == 0){
                    if(modelo.getTipoMedicamento()!="Seleccione una opcion"){
                        try {
                            int medicamentoCantidadNumero = Integer.parseInt(modelo.getCantidadMedicamento());
                            if(medicamentoCantidadNumero >= 1){
                                if(!modelo.getDistribuidorFarmaceutico().isEmpty()){
                                    if(!modelo.getFarmaciaPrincipal().isEmpty() || !modelo.getFarmaciaSecundaria().isEmpty()){
                                        if(!modelo.getFarmaciaPrincipal().isEmpty()){
                                            modelo.setFarmaciaPrincipal("Calle de la Rosa n. 28");
                                        }
                                        if(!modelo.getFarmaciaSecundaria().isEmpty()){
                                            modelo.setFarmaciaSecundaria("Calle Alcazabilla n. 3");
                                        }
                                    }else{
                                        errores = "Sucursal Farmaceutica: Por favor seleccione una sucursal farmaceutica.";
                                    }
                                }else{
                                    errores = "Distribuidor Farmacéutico: Por favor seleccione un distribuidor farmaceutico.";
                                }
                            }else{
                                errores = "Cantidad del Medicamento: Por favor ingrese un numero mayor a cero.";
                            }
                        } catch (NumberFormatException ex) {
                            errores = "Cantidad del Medicamento: Por favor ingrese un numero entero.";
                        }
                    }else{
                        errores = "Tipo del Medicamento: Por favor seleccione un tipo de medicamento.";
                    }
                }else if(banErrorNombre == 1){
                    errores = "Nombre del Medicamento: Por favor elimine el espacio inicial.";
                }else if(banErrorNombre == 2){
                    errores = "Nombre del Medicamento: Por favor ingrese solo caracteres alfanumericos.";
                }
            }else{
                errores = "Nombre del Medicamento: Por favor ingrese el nombre del medicamento.";
            }
        }catch(HeadlessException e){
            errores = e.getMessage();
        }
        return errores;
    }
}
