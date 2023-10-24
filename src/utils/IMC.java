
package utils;

/**
 *
 * @author alber
 */
public class IMC {
    private double altura;
    private final int imcMedioNormal=22;

    public IMC(double altura) {
        this.altura = altura;
    }
    
    public double pesoBuscado(){
        double pesoIdeal=imcMedioNormal*altura*altura/10000;       
        return pesoIdeal;
    }
    
    
    
    
    
    
    
}
