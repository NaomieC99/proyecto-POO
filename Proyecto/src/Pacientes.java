
import java.util.ArrayList;

public class Pacientes {
    private ArrayList <Pacientes> pacientes;
    private String nombre;
    private int rut;
    private int fechaNacimiento;
    private int telefono;
    private String correo;

    public Pacientes() {
        this.pacientes = new ArrayList<>();
        nombre = "";
        rut = 0;
        fechaNacimiento = 0;
        telefono = 0;
        correo = "";
    }
    

    //Metodos
    
    
    //busca entre el listado de los pacientes si existe coincidencia con el rut ingresado
    //si lo encuentra retorna true para evitar crear un paciente duplicado
    public boolean buscarPaciente(int rut){
        for(int i = 0; i >= pacientes.size(); i++){
            if(pacientes.get(i).getRut().equals(rut)){
                return true;
            }
        }return false;   
    }
    public void AgregarPaciente(){
        System.out.println("Agregando Paciente, a continuacion ingrese sus datos");    
    }
    
    public void  ModificarPaciente(int Rut){
        System.out.println("Modificar Paciente"+ Rut); 
    }
    
    public void EliminarPaciente(int Rut){
        System.out.println("Elimindo Paciente"+ Rut);
    }

    
    //getters y setters

    public ArrayList<Pacientes> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
