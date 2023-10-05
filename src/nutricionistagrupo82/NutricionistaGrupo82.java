package nutricionistagrupo82;

import AccesoADatos.PacienteData;
import Entidades.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import utils.Estado;

/**
 *
 * @author Pc Chavez
 */
public class NutricionistaGrupo82 {

    /**
     * @param args the command line arguments
     */
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("---------------------------------------------- \n");

            System.out.println("Menu");
            System.out.println("1- Crear");
            System.out.println("2- modificar");
            System.out.println("3- lista");
            System.out.println("4- Eliminar");
            int op = leer.nextInt();
            leer.nextLine();

            switch (op) {
                case 1:
                    Crear();
                    break;
                case 2:
                    modificar();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    Eliminar();
                    break;
                default:
                    return;
            }
        }

    }

    public static void Crear() {
        Paciente paciente = new Paciente();

        System.out.println("Dni");
        paciente.setDni(leer.nextInt());

        System.out.println("Nombre");
        leer.nextLine();
        paciente.setNombre(leer.next());

        System.out.println("Apellido");
        paciente.setApellido(leer.next());

        System.out.println("Telefono");
        paciente.setTelefono(leer.next());

        System.out.println("Domicilio");
        paciente.setDomicilio(leer.next());
        leer.nextLine();

        System.out.println("Fecha nac");
        paciente.setFechaNac(LocalDate.parse(leer.next(), DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.println("Sexo");
        paciente.setSexo(leer.next());

        System.out.println("Peso Actual");
        paciente.setPeso(leer.nextDouble());
        leer.nextLine();

        System.out.println("Peso Deseado");
        paciente.setPesoDeseado(leer.nextDouble());
        leer.nextLine();

        System.out.println("Altura");
        paciente.setAltura(leer.nextDouble());
        leer.nextLine();

        paciente.setEstado(Boolean.TRUE);

        PacienteData.CrearPaciente(paciente);

    }

    private static void modificar() {

        System.out.println("Ingrese el dni del paciente: ");
        int dni = leer.nextInt();

        Paciente paciente = PacienteData.buscarPacientePorDni(dni, true);

        System.out.println("Nombre");
        leer.nextLine();
        paciente.setNombre(leer.next());

        System.out.println("Apellido");
        paciente.setApellido(leer.next());

        System.out.println("Telefono");
        paciente.setTelefono(leer.next());

        System.out.println("Sexo");
        paciente.setSexo(leer.next());

        PacienteData.modificarPaciente(paciente);

    }

    public static List<Paciente> listar() {
        List<Paciente> pacintesList = PacienteData.ListarPacientes(Estado.TODOS);
        for (Paciente paciente : pacintesList) {
            System.out.println(paciente);
        }
        return pacintesList;
    }

    public static void Eliminar() {
        System.out.println("Ingrese el dni del paciente: ");
        int dni = leer.nextInt();

        Paciente paciente = PacienteData.buscarPacientePorDni(dni, true);

        PacienteData.eliminarPaciente(paciente.getIdPaciente());
        
    }

}
