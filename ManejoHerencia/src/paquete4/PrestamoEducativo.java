/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivel;
    private String nombreCen;
    private double valorC;
    private double valorMes;
    

    public PrestamoEducativo(Persona be, int tie, String ciu, String n, 
            String nom,
            double va) {
        super(be, tie);
        establecerCiudadPrestamo(ciu);
        nivel = n;
        nombreCen = nom;
        valorC = va;

    }

    @Override
    public void establecerCiudadPrestamo(String ci) {
        ciudadP = ci.toUpperCase();
    }

    public void establecerNivelEstudio(String n) {
        nivel = n;
    }

    public void establecerNombreCentroEdu(String c) {
        nombreCen = c;
    }

    public void establecerValorCarrera(double v) {
        valorC = v;
    }

    public void establecerValorMensual() {
        valorMes = (valorC / obtenerTiempoPrestamoMeses());

        valorMes = valorMes - (valorMes * 10) / 100;

    }

    public String obtenerNivelEstudio() {
        return nivel;
    }

    public String obtenerNombreCentroEdu() {
        return nombreCen;
    }

    public double obtenerValorCarrera() {
        return valorC;
    }

    public double obtenerValorMensual() {
        return valorMes;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Tiempo de préstamo en meses: %d\n"
                + "Ciudad de Prestamo: %s\n"
                + "Nivel de estudio: %s\n"
                + "Nombre de centro educativo: %s\n"
                + "Valor de la Carrera: %2f\n"
                + "Valor Mensual: %.2f\n", beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(), tiempoPres, ciudadP,
                obtenerNivelEstudio(),
                obtenerNombreCentroEdu(),
                obtenerValorCarrera(),
                obtenerValorMensual());

        return cadenaFinal;
    }

}
