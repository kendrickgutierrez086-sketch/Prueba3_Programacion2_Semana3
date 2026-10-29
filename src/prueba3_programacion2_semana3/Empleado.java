package prueba3_programacion2_semana3;

/**
 *
 * @author kendr
 */
public abstract class Empleado {
    private String codigo;
    private String nombre;
    private double salarioBase;
    
    public abstract double calcularSalario();
    
    public Empleado(String codigo, String nombre, double salarioBase){
        this.codigo=codigo;
        this.nombre=nombre;
        this.salarioBase=salarioBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase){
        if(salarioBase<0){
            throw new IllegalArgumentException("El salario base no puede ser negativo.");
        }
        this.salarioBase=salarioBase;
    }
    public String mostrarInformacion(){
        return (" Coodigo: "+codigo+" Nombre: "+nombre+" Salario base: "+salarioBase+" Salario calculado: "+calcularSalario()+" Categoria: "+obtenerCategoria());
        
    }
    public String obtenerCategoria() {
        double salario = calcularSalario();

        if(salario<10000){
            return("Categoria C");
        } 
        else if (salario<20000) {
            return("Categoria B");
        }
        else{
            return("Categoria A");
        }
    }  
    
    @Override
    public Empleado clone() {
        try {return (Empleado) super.clone();} 
                catch (CloneNotSupportedException e) {
            throw new IllegalStateException("No se pudo clonar el empelado.", e);
        }
    }
    
}
