public class EmpleadoMedioTiempo extends Empleado {

    private double salarioPorHora;
    private int horasTrabajadasPorSemana;

    public EmpleadoMedioTiempo(String nombre,String cargo, String numeroIdentificacion, String numeroINNS, double salarioPorHora, int horasTrabajadasPorSemana){
       super(nombre, cargo, numeroIdentificacion, numeroINNS);
        this.horasTrabajadasPorSemana=horasTrabajadasPorSemana;
        this.salarioPorHora=salarioPorHora;
    }

    @Override
    public double calcularSalario(){
        return salarioPorHora * horasTrabajadasPorSemana *4; //salario mensual
    }

    public int getHorasTrabajadasPorSemana() {
        return horasTrabajadasPorSemana;
    }
    public double getSalarioPorHora() {
        return salarioPorHora;
    }
}

