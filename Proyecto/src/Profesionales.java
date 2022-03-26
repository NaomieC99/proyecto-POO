/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magister
 */
public class Profesionales {
    
    private String Nombre;
    private String Apellido;
    private int Rut;
    private int Especialidad; // se le asigna un numero a la especialidad
    
    //Accesores - getter
    public String getNombre(){
        return Nombre;
    }
    
    public String getApellido(){
        return Apellido;
    }
    
    public int getRut(){
        return Rut;
    }
    
    public int getEspecialidad(){
        return Especialidad;
    }
    
    //Mutadores - setter
    public void setNombre(String nombre){
        Nombre=nombre;
    }
    
    public void setApellido(String apellido){
        Apellido=apellido;
    }
    
    public void setRut(int rut){
        Rut=rut;
    }
    
    public void setEspecialidad(int especialidad){
        Especialidad=especialidad;
    }
    
}
