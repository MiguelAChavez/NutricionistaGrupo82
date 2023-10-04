package nutricionistagrupo82;

import AccesoADatos.PacienteData;
import Entidades.*;
import java.time.LocalDate;
import utils.Estado;

/**
 *
 * @author Pc Chavez
 */
public class NutricionistaGrupo82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Pedro", "Peres", 20972164, "Gral. Paz 550", "21-1232-42", 31, "Masculino", LocalDate.now(), true, 300, 150, 1.80);
//    
//      PacienteData.CrearPaciente(paciente);
        // PacienteData.modificarPaciente(paciente);

        //PacienteData.eliminarPaciente(paciente.getIdPaciente());
        
        //System.out.println(PacienteData.buscarPacientePorDni(78901234,true));
        
        for (Paciente paci : PacienteData.buscarPorNombreOApellido( "l", Estado.TODOS )) {
            System.out.println(paci);
        }
    }

}
