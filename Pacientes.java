import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Pacientes {
    
    public Opciones opciones = new Opciones();
    
    
    private ArrayList <Pacientes> pacientes;
    private String Nombre;
    private int Rut;
    private Date fechaNacimiento;
    private int Telefono;
    private String Correo;

    public Pacientes() {
        this.pacientes = new ArrayList<>();
        Nombre = "";
        Rut = 0;
        Telefono = 0;
        Correo = "";
    }
    

    //constructores
    public Pacientes(String nombre, int rut, int telefono, String correo){
        
    }
    
    public Pacientes(String nombre, int rut, Date fecha, int telefono, String correo){
        this.Nombre=nombre;
        this.Rut=rut;
        this.fechaNacimiento=fecha;
        this.Telefono=telefono;
        this.Correo=correo;  
    }

    //Metodos
    
    
    //busca entre el listado de los pacientes si existe coincidencia con el rut ingresado
    //si lo encuentra retorna true para evitar crear un paciente duplicado
    public boolean buscarPaciente(int rut){
        for(int i = 0; i < pacientes.size(); i++){
            if(pacientes.get(i).getRut()==(rut)){
                return true;
            }
        }return false;   
    }
    
    
    public void AgregarPaciente() throws ParseException{
        String nombre;
        int rut;
        String fecha;
        int telefono;
        String correo;
        int cedula;
        
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Agregando Paciente, a continuacion ingrese sus datos"); 
        System.out.println("Ingrese su nombre completo");
        nombre=Entrada.next();
        
        System.out.println("Ingrese su RUT");
        rut=Entrada.nextInt();
        
        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/yy");
        fecha=Entrada.next();
        
        System.out.println("Ingrese su telefono");
        telefono=Entrada.nextInt();
        
        System.out.println("Ingrese su correo electronico");
        correo=Entrada.next();
        
        
        
        Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(fecha);
        System.out.println("Se ha ingresado un nuevo paciente con exito!");
        
        cedula=opciones.ValidarEntero();
        
        
    }
       
    
    
    
    
    public void  ModificarPaciente(int Rut){
        System.out.println("Modificar Paciente"+ Rut); 
    }
    
    public void EliminarPaciente(int Rut){
        opciones.Mensaje("Ingrese Rut que desea eliminar");
        int cedula=opciones.ValidarEntero();
        int i;
        
        for(i=0; i<pacientes.size(); i++){
            if(cedula==pacientes.get(i).Rut){
                pacientes.remove(i);
                opciones.Mensaje("Se ha eliminado el rut del paciente");
            }
        }
    }

    
    //getters y setters

    public ArrayList<Pacientes> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int rut) {
        this.Rut = rut;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        this.Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }

    boolean buscarPaciente(String RutPaciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Pacientes RutPaciente(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean BuscarPaciente(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
