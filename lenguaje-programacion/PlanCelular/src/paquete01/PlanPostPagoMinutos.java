/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author sofiv
 */
public class PlanPostPagoMinutos extends PlanCelular {
    //minutos nacionales|costo minuto nacional|minutos internacionales|costo minuto internacional

    double minutos;
    double costoNacional;
    private double minutosInternacional;
    double costoInternacional;

    public PlanPostPagoMinutos(String n, String p, String cdd, String b,
            String num, String ma, String mo, double min, double vNac,
            double minI, double vIn) {
        super(n, p, cdd, b, num, ma, mo);
        minutos = min;
        costoNacional = vNac;
        minutosInternacional = minI;
        costoInternacional = vIn;
    }

    @Override
    public void calcularPagoTotal() {
        pagoTotal = ((minutos * costoNacional)
                + (minutosInternacional * costoInternacional));

    }

    @Override
    public double obtenerPagoTotal() {
        return pagoTotal;
    }

    public void establecerMinutos(double min) {
        minutos = min;
    }

    public void establecerCostoNacional(double cna) {
        costoNacional = cna;
    }

    public void establecerMinutosInternacional(double inter) {
        minutosInternacional = inter;
    }

    public void establecerCostoInternacional(double cint) {
        costoInternacional = cint;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoNacional() {
        return costoNacional;
    }

    public double obtenerMinutosInternacional() {
        return minutosInternacional;
    }

    public double obtenerCostoInternacional() {
        return costoInternacional;
    }

    @Override
    public String toString() {
        return String.format("Plan PostPago Minutos:\n"
                + "Nombres: %s\n"
                + "Pasaporte: %s\n"
                + "Ciudad: %s\n"
                + "Barrio: %s\n"
                + "Marca del Celular: %s\n"
                + "Modelo del Celular: %s\n"
                + "Número de Celular: %s\n"
                + "Minutos Nacionales: %.2f\n"
                + "Valor por Minuto Nacional: %.2f\n"
                + "Minutos Internacionales: %.2f\n"
                + "Valor por Minuto Internacional: %.2f\n"
                + "Pago: %.2f\n",
                obtenerNombres(),
                obtenerPasaporte(),
                obtenerCiudad(),
                obtenerBarrio(),
                obtenerNumero(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerMinutos(),
                obtenerCostoNacional(),
                obtenerMinutosInternacional(),
                obtenerCostoInternacional(),
                obtenerPagoTotal()
        );
    }

}
