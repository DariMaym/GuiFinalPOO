abstract class Empleado {
    private String nombre;
    public String cargo;
    private String numeroIdentificacion;
    private String numeroINNS;

    public Empleado(String nombre, String cargo, String numeroIdentificacion, String numeroINNS){
        this.nombre=nombre;
        this.cargo=cargo;
        this.numeroIdentificacion=numeroIdentificacion;
        this.numeroINNS=numeroINNS;

    } 

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public String getNumeroINNS() {
        return numeroINNS;
    }
    public void setNumeroINNS(String numeroINNS) {
        this.numeroINNS = numeroINNS;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    

    //metodo abstracto para el salario
    public abstract double calcularSalario();

}
