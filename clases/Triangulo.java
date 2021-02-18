/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
/**
* Clase triangulo, extiende de la clase figura. Se ve el area y permite modificar o ver base y altura
* @author manuel soria 
* @version 12/02/2021
*/
public class triangulo extends figura{
    //variables base y altura
    private double base;
    private double altura;
    
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
     }
    /**
     * Método para ver el valor de la base
     * @return base
     */
    public double getBase() {
        return base;
    }
    /**
     * Método para guardar el valor de la base
     * @param double base del triangulo
     */
    public void setBase(double base) {
        this.base = base;
    }
    /**
     * Método para ver el valor de la altura
     * @return altura
     */
    public double getAltura() {
        return altura;
    }
    /**
     * Método para guardar el valor de la altura
     * @param double altura del triangulo
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
