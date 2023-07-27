package paquete01;

/**
 *
 * @author sofiv
 */
public abstract class PlanCelular {

    /*nombre y apellidos propietario tipo (tipo cadena)
pasaporte propietario (tipo cadena)
ciudad propietario (tipo cadena)
barrio del propietario
marca de celular
modelo del celular
numero celular
pago mensual*/
    protected String nombres;
    protected String pasaporte;
    protected String ciudad;
    protected String barrio;
    protected String numero;
    protected String marca;
    protected String modelo;
    double pagoTotal;

    public PlanCelular(String n, String p, String cdd, String b, String num,
            String ma, String mo) {
        nombres = n;
        pasaporte = p;
        ciudad = cdd;
        barrio = b;
        numero = num;
        marca = ma;
        modelo = mo;

    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerPasaporte(String p) {
        pasaporte = p;
    }

    public void establecerCiudad(String cdd) {
        ciudad = cdd;
    }

    public void establecerBarrio(String b) {
        barrio = b;
    }

    public void establecerNumero(String num) {
        numero = num;
    }

    public void establecerMarca(String ma) {
        marca = ma;
    }

    public void establecerModelo(String mo) {
        modelo = mo;
    }

    public abstract void calcularPagoTotal();


    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerPasaporte() {
        return pasaporte;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerBarrio() {
        return barrio;
    }

    public String obtenerNumero() {
        return numero;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public double obtenerPagoTotal() {
        return pagoTotal;
    }

   /*  @Override
   public String toString() {
        /*PlanCelular
nombre y apellidos propietario tipo (tipo cadena)
pasaporte propietario (tipo cadena)
ciudad propietario (tipo cadena)
barrio del propietario
marca de celular
modelo del celular
numero celular
pago mensual
Los planes se caracterizan además y clasifican así:

PlanPostPagoMinutosMegasEconomico
minutos|costo minutos|megas expresado en gigas|costo por cada gigas|porcentaje de descuento (Ejemplo: 10%)
PlanPostPagoMinutos:
minutos nacionales|costo minuto nacional|minutos internacionales|costo minuto internacional
PlanPostPagoMegas
megas expresado en gigas|costo por cada giga|tarifa base
PlanPostPagoMinutosMegas
minutos|costo minutos|megas expresado en gigas|costo por cada giga
        String cadena = String.format("Datos del propietario\n"
                + "Nombre: %s \n"
                + "Pasaporte: %s\n"
                + "Ciudad %s\n"
                + "Barrio: %s\n"
                + "Marca del celular: %s\n"
                + "Modelo del celular: %s\n"
                + "Numero del celular: %s\n"
                + "Pago Mensual: %.2f\n", propietario.obtenerNombres(),
                propietario.obtenerPasaporte(), propietario.obtenerCiudad(),
                propietario.obtenerBarrio(), celular.obtenerMarca(),
                celular.obtenerModelo(), celular.obtenerNumero(),
                pagoTotal);

        return cadena;
    }*/

}
