
public class Horarios {
    int mes;
    int dia;
    int hora;
    int disponibilidad;

    public void verFechasDisp(){
        System.out.println("Mostrando horario");
    }
    
    
    
    
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int Hora) {
        this.hora = Hora;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
