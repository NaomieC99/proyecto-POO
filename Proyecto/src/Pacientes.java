/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magister
 */
public class Pacientes {
    
    private String Nombre;
    private String Apellido;
    private int Rut;
    private int FechaNacimiento;
    private int Telefono;
    private String Correo;
    
    
    //Metodos
    public void AgregarPaciente(){
        System.out.println("Agregar Paciente");    
    }
    
    public void  ModificarPaciente(int Rut){
        System.out.println("Modificar Paciente"+ Rut); 
    }
    
    public void EliminarPaciente(int Rut){
        System.out.println("Eliminar Paciente"+ Rut);
    }
    
}
