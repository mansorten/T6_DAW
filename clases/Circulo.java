/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.figura;

/**
* Clase circulo, extiende de la clase figura. Para calcular el area del circulo y ver o modificar el radio
* @author manuel soria 
* @version 12/02/2021
*/
public class circulo extends figura{
    
    //variables pi y radio
    final double pi=3.1416;
    private double radio;
    
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }
    /**
     * Método para guardar el valor de radio
     * @return el valor de la variable radio
     */
    public double getRadio() {
        return radio;
    }
    /**
     * Método guarda el valor que queremos darle a radio
     * @param double valor de radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}