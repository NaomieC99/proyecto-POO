/*
Nombres:
Alison Jara
Barbara Leiva
Naomi Contreras
*/



import java.util.Scanner;



public class Principal {

    public static void main(String[] args) {
        Profesionales profesional = new Profesionales();
        Principal p = new Principal();
        String especialidad= "";
        int fecha=0;
        int hora=0;
        int rut=0;
        Scanner sn = new Scanner(System.in);
        System.out.println ("Por favor ingrese su Rut sin punto ni guion para continuar, en caso de no estar registrado debera realizar su registro");
        rut=sn.nextInt();
        p.buscarPaciente(rut);
        System.out.println("Ingrese el codigo de la especialidad");
        especialidad= sn.next(especialidad);
        System.out.println("Ingrese el día de este mes en el cual desea agendar una hora  por ejemplo: 27 marzo");
        profesional.buscarEspecialidad(especialidad);
        System.out.println("Estos son los horarios disponibles para este día");
        fecha = sn.nextInt();
        System.out.println("Seleccione el horario a elegir");
        hora=sn.nextInt();
        
            
    }
    public void buscarPaciente(int rut){
        boolean respuesta;
        Pacientes p = new Pacientes();
        respuesta = p.buscarPaciente(rut);
        if(respuesta == true){
             System.out.println("Se encuentra registrado en el sistema, a continuación será dirigida a registrar su hora");
        }else{
             System.out.println("Iniciando registro de paciente, ingrese su nombre completo");
        }
    }
    
     public static void datosProfesionales (){
    
        Profesionales profesional1 = new Profesionales();        
        profesional1.setNombre("Miguel Sanchez");
        profesional1.setRut(114672852);
        profesional1.setEspecialidad("Cardiologia");
        
        Profesionales profesional2 = new Profesionales();
        profesional2.setNombre("Jose Gonzalez");
        profesional2.setRut(96482745);
        profesional2.setEspecialidad("Dermatologia");
        
        Profesionales profesional3 = new Profesionales();
        profesional3.setNombre("Marcela Araya");
        profesional3.setRut(79472487);
        profesional3.setEspecialidad("Pediatria");
        
        Profesionales profesional4 = new Profesionales();
        profesional4.setNombre("Sofia Rodriguez");
        profesional4.setRut(158593642);
        profesional4.setEspecialidad("Neurologia");
    }
}
