package utils;

import Entidades.Paciente;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author alber
 */
public class IMC {

    private static final BigDecimal IMC_MEDIO_NORMAL = new BigDecimal(22);

    private IMC() {
    }

    public static double calcularPesoIdeal(Paciente paciente) {
        BigDecimal altura = new BigDecimal(paciente.getAltura() / 100); 
        BigDecimal alturaCuadrado = altura.multiply(altura);

        BigDecimal pesoIdeal = IMC_MEDIO_NORMAL.multiply(alturaCuadrado).setScale(2, RoundingMode.HALF_UP);

        return pesoIdeal.doubleValue();
    }

}