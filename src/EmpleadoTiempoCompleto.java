public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioAnual;
    public EmpleadoTiempoCompleto(String nombre, String cargo, String numeroIdentificacion, String numeroINNS, double salarioAnual){
      super(nombre, cargo, numeroIdentificacion, numeroINNS);
        this.salarioAnual=salarioAnual;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }
    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double calcularSalario(){
        return salarioAnual/12;
    }

}