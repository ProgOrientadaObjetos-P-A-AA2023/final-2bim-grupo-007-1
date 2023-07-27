/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author sofiv
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {
    //minutos|costo minutos|megas expresado en gigas|costo por cada gigas|porcentaje de descuento (Ejemplo: 10%)

    private double minutos;
    private double costoMinutos;
    private double megas;
    private double costoMegas;
    private double descuento;

    public PlanPostPagoMinutosMegasEconomico(String n, String p, String cdd,
            String b, String num, String ma, String mo, double min, double vMi,
            double mgs, double vMg, double desc) {
        super(n, p, cdd, b, num, ma, mo);
        minutos = min;
        costoMinutos = vMi;
        megas = mgs;
        costoMegas = vMg;
        descuento = desc;
    }

    @Override
    public void calcularPagoTotal() {
        pagoTotal = ((minutos * costoMinutos) + (megas * costoMegas));
        pagoTotal = (pagoTotal - ((descuento * pagoTotal) / 100));
    }

    @Override
    public double obtenerPagoTotal() {
        return pagoTotal;
    }

    public void establecerMinutos(double min) {
        minutos = min;
    }

    public void establecerCostoMinutos(double cm) {
        costoMinutos = cm;
    }

    public void establecerMegas(double me) {
        megas = me;
    }

    public void establecerCostoMegas(double cme) {
        costoMegas = cme;
    }

    public void establecerDescuento(double des) {
        descuento = des;
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

    public double obtenerDescuento() {
        return descuento;
    }
    
        @Override
    public String toString() {
        return String.format("Plan de PostPago Minutos y Megas Econmico:\n"
                + "Nombres: %s\n"
                + "Pasaporte: %s\n"
                + "Ciudad: %s\n"
                + "Barrio: %s\n"
                + "Marca del Celular: %s\n"
                + "Modelo del Celular: %s\n"
                + "Número de Celular: %s\n"
                + "Minutos: %.2f\n"
                + "Valor Minuto: %.2f\n"
                + "Megas: %.2f\n"
                + "Valor Megas: %.2f\n"
                + "Descuento: %.2f\n"
                + "Pago Total: %.2f\n",
                obtenerNombres(),
                obtenerPasaporte(),
                obtenerCiudad(),
                obtenerBarrio(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerNumero(),
                obtenerMinutos(),
                obtenerCostoMinutos(),
                obtenerMegas(),
                obtenerCostoMegas(),
                obtenerDescuento(),
                obtenerPagoTotal());
    }

}
