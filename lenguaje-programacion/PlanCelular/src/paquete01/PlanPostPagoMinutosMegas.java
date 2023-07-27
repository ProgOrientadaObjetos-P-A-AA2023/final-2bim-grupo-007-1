/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author sofiv
 */
public class PlanPostPagoMinutosMegas extends PlanCelular {
    //minutos|costo minutos|megas expresado en gigas|costo por cada giga

    double minutos;
    double costoMinutos;
    double megas;
    double costoMegas;

    public PlanPostPagoMinutosMegas(String n, String p, String cdd, String b,
            String num, String ma, String mo, double min, double vMin, double mg,
            double vMg) {
        super(n, p, cdd, b, num, ma, mo);
        minutos = min;
        costoMinutos = vMin;
        megas = mg;
        costoMegas = vMg;
    }

    @Override
    public void calcularPagoTotal() {
        pagoTotal = ((minutos * costoMinutos) + (megas * costoMegas));
    }

    @Override
    public double obtenerPagoTotal() {
        return pagoTotal;
    }

    public void establecerMinutos(double min) {
        minutos = min;
    }

    public void establecerCostoMinutos(double cmin) {
        costoMinutos = cmin;
    }

    public void establecerMegas(double meg) {
        megas = meg;
    }

    public void establecerCostoMegas(double cmeg) {
        costoMegas = cmeg;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public double obtenerMegas() {
        return megas;
    }

    public double obtenerCostoMegas() {
        return costoMegas;
    }

    @Override
    public String toString() {
        return String.format("Plan PostPago Minutos y Megas:\n"
                + "Nombre: %s\n"
                + "Pasaporte: %s\n"
                + "Ciudad: %s\n"
                + "Barrio: %s\n"
                + "Marca del Celular: %s\n"
                + "Modelo del Celular: %s\n"
                + "Número de Celular: %s\n"
                + "Minutos: %.2f\n"
                + "Valor por Minuto: %.2f\n"
                + "Megas: %.2f\n"
                + "Valor megas: %.2f\n"
                + "Pago Total: %.2f\n",
                obtenerNombres(),
                obtenerPasaporte(),
                obtenerCiudad(),
                obtenerBarrio(),
                obtenerNumero(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerMinutos(),
                obtenerCostoMinutos(),
                obtenerMegas(),
                obtenerCostoMegas(),
                obtenerPagoTotal());
    }
}
