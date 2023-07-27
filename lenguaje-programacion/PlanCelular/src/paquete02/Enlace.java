/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.PlanPostPagoMinutosMegasEconomico;
import paquete01.PlanPostPagoMinutos;
import paquete01.PlanCelular;
import paquete01.PlanPostPagoMinutosMegas;
import paquete01.PlanPostPagoMegas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sofiv
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/plan.db";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planminuto(nombre,"
                    + "pasaporte, ciudad, barrio, numero, marca, modelo,"
                    + "nacional, vnacional, internacional, vinternacional, total)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s', %.2f, "
                    + "%.2f, %.2f, %.2f, %.2f)",
                    plan.obtenerNombres(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudad(),
                    plan.obtenerBarrio(),
                    plan.obtenerNumero(),
                    plan.obtenerMarca(),
                    plan.obtenerNumero(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoNacional(),
                    plan.obtenerMinutosInternacional(),
                    plan.obtenerCostoInternacional(),
                    plan.obtenerPagoTotal());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMegas(PlanPostPagoMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planmega(nombre,"
                    + "pasaporte, ciudad, barrio, numero, marca, modelo, mega,"
                    + "vmega, base, total)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s', %.2f, "
                    + "%.2f, %.2f, %.2f)",
                    plan.obtenerNombres(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudad(),
                    plan.obtenerBarrio(),
                    plan.obtenerNumero(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerMegas(),
                    plan.obtenerCostoMegas(),
                    plan.obtenerBase(),
                    plan.obtenerPagoTotal());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planminutomega(nombre,"
                    + "pasaporte, ciudad, barrio, marca, modelo, numero, minuto,"
                    + "vminuto, mega, vmega, total)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s', %.2f,"
                    + "%.2f, %.2f, %.2f, %.2f)",
                    plan.obtenerNombres(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudad(),
                    plan.obtenerBarrio(),
                    plan.obtenerNumero(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMinutos(),
                    plan.obtenerMegas(),
                    plan.obtenerCostoMegas(),
                    plan.obtenerPagoTotal());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planeconomico"
                    + "(nombre, pasaporte, ciudad, barrio, marca, modelo, "
                    + "numero, minuto, vminuto, mega, vmega, descuento, total)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s',"
                    + "%.2f, %.2f, %.2f, %.2f, %.2f, %.2f)",
                    plan.obtenerNombres(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudad(),
                    plan.obtenerBarrio(),
                    plan.obtenerNumero(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMinutos(),
                    plan.obtenerMegas(),
                    plan.obtenerCostoMegas(),
                    plan.obtenerDescuento(),
                    plan.obtenerPagoTotal());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<PlanCelular> obtenerDataPlanes() {
        ArrayList<PlanCelular> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = "Select * from planminuto;";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                PlanPostPagoMinutos plan = new PlanPostPagoMinutos(
                        rs.getString("nombre"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("numero"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getDouble("nacional"),
                        rs.getDouble("vnacional"),
                        rs.getDouble("internacional"),
                        rs.getDouble("vinternacional"));
                plan.calcularPagoTotal();
                lista.add(plan);
            }

            String data2 = "Select * from planmega;";
            rs = statement.executeQuery(data2);
            while (rs.next()) {

                PlanPostPagoMegas plan = new PlanPostPagoMegas(
                        rs.getString("nombre"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("numero"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getDouble("mega"),
                        rs.getDouble("vmega"),
                        rs.getDouble("base"));
                plan.calcularPagoTotal();

                lista.add(plan);
            }

            String data3 = "Select * from planminutomega;";
            rs = statement.executeQuery(data3);
            while (rs.next()) {

                PlanPostPagoMinutos plan = new PlanPostPagoMinutos(
                        rs.getString("nombre"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("numero"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getDouble("minuto"),
                        rs.getDouble("vminuto"),
                        rs.getDouble("mega"),
                        rs.getDouble("vmega"));
                plan.calcularPagoTotal();
                lista.add(plan);
            }

            String data4 = "Select * from planeconomico;";
            rs = statement.executeQuery(data4);
            while (rs.next()) {

                PlanPostPagoMinutosMegasEconomico plan = new PlanPostPagoMinutosMegasEconomico(
                        rs.getString("nombre"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("numero"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getDouble("minuto"),
                        rs.getDouble("vminuto"),
                        rs.getDouble("mega"),
                        rs.getDouble("vmega"),
                        rs.getDouble("descuento"));
                plan.calcularPagoTotal();
                lista.add(plan);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
