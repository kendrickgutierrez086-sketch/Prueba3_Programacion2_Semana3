package prueba3_programacion2_semana3;

/**
 *empeladoPorHoras
 * @author kendr
 */
public class empleadoPorHoras extends Empleado{
    private int horasTraba;
    private double tarifaPorHora;
    
    
    @Override
    public double calcularSalario(){
        return getSalarioBase()+(horasTraba*tarifaPorHora);
    }
    
    public empleadoPorHoras(String codigo,String nombre,double salarioBase,int horasTraba,double tarifaPorHora) {
        super(codigo, nombre, salarioBase);
        setHorasTraba(horasTraba);
        setTarifaPorHora(tarifaPorHora);
    }
    
    public int getHorasTraba() {
        return horasTraba;
    }
    
    public void setHorasTraba(int horasTraba) {
        if(horasTraba<0) {
            throw new IllegalArgumentException( "Las horas trabajadas son invalidas");
        }
        this.horasTraba=horasTraba;
    }
    
     public double getTarifaPorHora(){
        return tarifaPorHora;
    }
     
    public void setTarifaPorHora(double tarifaPorHora){
        if (tarifaPorHora<0){throw new IllegalArgumentException( "La tarifa por hora es invalida");
        }

        this.tarifaPorHora=tarifaPorHora;
    }
     
    
    
    

    
    
}
