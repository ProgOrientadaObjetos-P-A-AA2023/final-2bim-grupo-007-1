/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author sofiv
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double megas;
    private double costoMegas;
    private double base;

    public PlanPostPagoMegas(String n, String p, String cdd, String b, String num,
            String ma, String mo, double vMegas, double meg, double bas) {
        super(n, p, cdd, b, num, ma, mo);
        megas = meg;
        costoMegas = vMegas;
        base = bas;
    }

    @Override
    public void calcularPagoTotal() {
        pagoTotal = ((megas * costoMegas) + base);

    }

    @Override
    public double obtenerPagoTotal() {
        return pagoTotal;
    }

    public void establecerMegas(double m) {
        megas = m;
    }

    public void establecerCostoMegas(double v) {
        costoMegas = v;
    }

    public void establecerBase(double b) {
        base = b;
    }

    public double obtenerMegas() {
        return megas;
    }

    public double obtenerCostoMegas() {
        return costoMegas;
    }

    public double obtenerBase() {
        return base;
    }

    @Override
    public String toString() {
        return String.format("Plan PostPago Megas:\n"
                + "Nombres: %s\n"
                + "Pasaporte: %s\n"
                + "Ciudad: %s\n"
                + "Barrio: %s\n"
                + "Marca del Celular: %s\n"
                + "Modelo del Celular: %s\n"
                + "Número de Celular: %s\n"
                + "Megas: %.2f\n"
                + "Costo por megas: %.2f\n"
                + "Base: %.2f\n"
                + "Pago Total: %.2f\n",
                obtenerNombres(),
                obtenerPasaporte(),
                obtenerCiudad(),
                obtenerBarrio(),
                obtenerNumero(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerMegas(),
                obtenerCostoMegas(),
                obtenerBase(),
                obtenerPagoTotal());
    }
}
