package prueba3_programacion2_semana3;
/**
 *
 * @author kendr
 */
public class empleadoAdministrativo extends Empleado{
    private double bonificacion;
    private double descuento;
    
    
    
    public empleadoAdministrativo(String codigo, String nombre, double salarioBase, double bonificacion, double descuento) {

        super(codigo,nombre,salarioBase);
        setBonificacion(bonificacion);
        setDescuento(descuento);
    }
    public double getBonificacion(){
        return bonificacion;
    }
    
    @Override
    public double calcularSalario(){
        return(getSalarioBase()+bonificacion)*(1-descuento/100);
    }
    
     public void setBonificacion(double bonificacion){
        if (bonificacion<0){
            throw new IllegalArgumentException("La bonificacion es invalda");
        }
        this.bonificacion=bonificacion;
    }
     
      public double getDescuento(){
        return descuento;
    }
      
    public void setDescuento(double descuento) {
       if (descuento<0||descuento>100) {
            throw new IllegalArgumentException( "El descuento es invalido");
        }
        this.descuento=descuento;
    }

}
