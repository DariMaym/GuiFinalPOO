public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
       Empleado [] empleados = new Empleado[4];
       empleados [0]= new EmpleadoTiempoCompleto("Ariel Olivares", "Supervisor", "234-582-AEOT", "3409158", 1950000);
       empleados [1]= new EmpleadoMedioTiempo("Shelsy Arteaga", "Arquitecto", "164-729-SALA", "2935071", 150, 30);
       empleados [2]= new EmpleadoMedioTiempo("Maycol Arcia", "Control de calidad", "164-037-MAAG", "5608214", 100, 50);
       empleados [3]= new EmpleadoTiempoCompleto("Leticia Carvajal", "Psicologa", "371-502-LMCA", "4126053", 210000);

        for (Empleado empleado : empleados) {
            System.out.println("Empleados: " + empleado.getNombre() +" | cargo: "+ empleado.getCargo() +" | Numero de identifcición: "+ empleado.getNumeroIdentificacion() +" | Salario mensual: "+ empleado.calcularSalario() + "$" + " | Numero de INNS: "+ empleado.getNumeroINNS() +" |" );
        }
        System.out.println(" ");
        System.out.println("==============================================");
        System.out.println(" ");
        System.out.println("Impresion del for");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("["+(i+1)+"]"+"-"+"Nombre del empleado: " + empleados[i].getNombre() +"| Cargo: "+ empleados[i].getCargo()+" | Numero de identificación: " +empleados[i].getNumeroIdentificacion() +" | Su salario es: " + empleados[i].calcularSalario() + "$" + " | Numero de INNS: " + empleados[i].getNumeroINNS() + " |");
        }
        
        System.out.println("================");
        //Hecho de esta manera para aplicar el polimofismo, pero no se necesitaba hacer una instancia
        Empleado a = new EmpleadoTiempoCompleto("Ariel Olivares ", "Contratista", "234-582-AEOT", "3409158", 180000);

        System.out.println("Comprobemos el salario de Ariel");
        double salarioAriel = a.calcularSalario();
        System.out.println("El salario de Ariel es: " + salarioAriel + "$");

        System.out.println("================");
        System.out.println("Comprobemos el salario de Shelsy");
        EmpleadoMedioTiempo s =  new EmpleadoMedioTiempo("Shelsy", "Arquitecto", "164-729-SALA", "2935071", 150, 30);
        double salarioShelsy = s.getSalarioPorHora() * s.getHorasTrabajadasPorSemana() * 4;
        System.out.println("El salario de Shelsy es de: " + salarioShelsy + "$");
    }
}
