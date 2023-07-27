/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.Enlace;

/**
 *
 * @author sofiv
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int bandera = 2;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Enlace c = new Enlace();
        c.establecerConexion();

        while (bandera != 0) {
            System.out.println("Seleccione la opcion de plan a crear\n");
            System.out.println("1. Plan PostPago Minutos\n"
                    + "2. Plan PostPago Megas\n"
                    + "3. Plan PostPago MinutosMegas\n"
                    + "4. Plan PostPago Minutos Megas Economico\n");
            int opc = entrada.nextInt();

            entrada.nextLine();
            System.out.println("Ingrese el nombre del propietario");
            String nom = entrada.nextLine();
            System.out.println("Ingrese el pasaporte del propietario");
            String pas = entrada.nextLine();
            System.out.println("Ingrese la ciudad del propietario");
            String cdd = entrada.nextLine();
            System.out.println("Ingrese el barrio del propietario");
            String bar = entrada.nextLine();

            System.out.println("Ingrese el numero de celular");
            String nCell = entrada.nextLine();
            System.out.println("Ingrese el modelo de celular");
            String mod = entrada.nextLine();
            System.out.println("Ingrese la marca de celular");
            String mar = entrada.nextLine();

            switch (opc) {
                case 1:

                    System.out.println("Ingrese el numero de minutos nacionales");
                    double nac = entrada.nextDouble();
                    System.out.println("Ingrese el valor de minutos nacionales");
                    double vNac = entrada.nextDouble();
                    System.out.println("Ingrese el numero de minutos internacionales");
                    double inter = entrada.nextDouble();
                    System.out.println("Ingrese el valor de minutos internacionales");
                    double vIn = entrada.nextDouble();

                    PlanPostPagoMinutos planMin = new PlanPostPagoMinutos(nom,
                            pas, cdd, bar, nCell, mar, mod, nac,
                            vNac, inter, vIn);
                    planMin.calcularPagoTotal();
                    c.insertarPlanPostPagoMinutos(planMin);
                    System.out.println("Plan Registrado con exito");

                    System.out.println("Para salir presione 0");
                    bandera = entrada.nextInt();

                    break;
                case 2:

                    System.out.println("Ingrese el numero de megas consumidas");
                    double mg = entrada.nextDouble();
                    System.out.println("Ingrese el valor de megas consumidas");
                    double vmg = entrada.nextDouble();
                    System.out.println("Ingrese el precio base");
                    double base = entrada.nextDouble();

                    PlanPostPagoMegas planMegas = new PlanPostPagoMegas(nom,
                            pas, cdd, bar, nCell, mar, mod,
                            vmg, mg, base);
                    planMegas.calcularPagoTotal();
                    c.insertarPlanPostPagoMegas(planMegas);
                    System.out.println("Plan Registrado con exito");
                    System.out.println("Para salir presione 0");
                    bandera = entrada.nextInt();

                    break;

                case 3:

                    System.out.println("Ingrese el numero de minutos consumidos");
                    double min = entrada.nextDouble();
                    System.out.println("Ingrese el valor de minutos consumidos");
                    double vmin = entrada.nextDouble();
                    System.out.println("Ingrese el numero de megas consumidas");
                    double meg = entrada.nextDouble();
                    System.out.println("Ingrese el valor de megas consumidas");
                    double vmeg = entrada.nextDouble();

                    PlanPostPagoMinutosMegas plan = new PlanPostPagoMinutosMegas(
                            nom, pas, cdd, bar, nCell, mar, mod,
                            min, vmin, meg, vmeg);
                    plan.calcularPagoTotal();
                    c.insertarPlanPostPagoMinutosMegas(plan);
                    System.out.println("Plan Registrado con exito");
                    System.out.println("Para salir presione 0");
                    bandera = entrada.nextInt();

                    break;
                case 4:

                    System.out.println("Ingrese el numero de minutos consumidos");
                    min = entrada.nextDouble();
                    System.out.println("Ingrese el valor de minutos consumidos");
                    vmin = entrada.nextDouble();
                    System.out.println("Ingrese el numero de megas consumidas");
                    meg = entrada.nextDouble();
                    System.out.println("Ingrese el valor de megas consumidas");
                    vmeg = entrada.nextDouble();
                    System.out.println("Ingrese el vlor del descuento");
                    double desc = entrada.nextDouble();

                    PlanPostPagoMinutosMegasEconomico planEco = new PlanPostPagoMinutosMegasEconomico(nom, pas, cdd,
                            bar, nCell, mar, mod, min, vmin,
                            meg, vmeg, desc);

                    planEco.calcularPagoTotal();
                    c.insertarPlanPostPagoMinutosMegasEconomico(planEco);
                    System.out.println("Plan Registrado con exito");
                    System.out.println("Para salir presione 0");
                    bandera = entrada.nextInt();

                    break;

            }

        }
        for (int i = 0; i < c.obtenerDataPlanes().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataPlanes().get(i));
        }

    }

}
