
import clases.circulo;
import clases.figura;
import clases.rectangulo;
import clases.triangulo;
    /**
     * Clase principal, hace uso todas las demas clases 
     * @author manol 
     * @version 17/02/2021
     * @see <a href = "https://devcode.la/tutoriales/calculadora-en-java/"> Calculadora en java</a>
     */
public class Main {
    
    public static void main(String[] args) {
        
        circulo circulo = new circulo();
        rectangulo rectangulo = new rectangulo();
        triangulo triangulo = new triangulo();
        
        circulo.setRadio(44.55);
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        triangulo.setBase(50);
        triangulo.setAltura(60);
        
        System.out.println("Area del circulo "+calcularArea(circulo));
        System.out.println("Area del rectangulo "+calcularArea(rectangulo));
        System.out.println("Area del Triangulo "+calcularArea(triangulo));
       }
    
    /**
     * Método que calcula el area la figura pasada por parametro
     * @param object objeto de una figura
     * @return area de la firura pasada por parametro
     */
    public static double calcularArea(figura f){ // Ejemplo de uso de polimorfismo
        
        return f.CalcularArea();
    }
}