/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
/**
* Clase abstracta figura. Para crear variable area y metodo calcularArea en las demás clases
* @author manuel soria 
* @version 12/02/2021
*/
public abstract class figura {    
    //variable area    
    double area;
    /**
     * Método que calcula el area de la figura
     * @return area la figura
     */
    abstract public double CalcularArea();
    
}
