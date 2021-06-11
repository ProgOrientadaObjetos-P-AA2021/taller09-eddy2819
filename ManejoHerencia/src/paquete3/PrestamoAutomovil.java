/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoA;
    private String marca;
    private Persona garante;
    private double valorA;
    private double valorMens;
 

    public PrestamoAutomovil(Persona b, int ti, String ci, String tp, String m,
            Persona g, double va) {
        super(b, ti);
        establecerCiudadPrestamo(ci);
        tipoA = tp;
        marca = m;
        garante = g;
        valorA = va;

    }

    @Override
    public void establecerCiudadPrestamo(String c) {
        ciudadP = c.toLowerCase();
    }

    public void establecerTipoAutomovil(String ta) {
        tipoA = ta;
    }

    public void establecerMarcaAutomovil(String m) {
        marca = m;
    }

    public void establecerGarante1(Persona g) {
        garante = g;
    }

    public void establecerValorAutomovil(double v) {
        valorA = v;
    }

    public void establecerValorMensualPago() {

        valorMens = valorA / obtenerTiempoPrestamoMeses();

    }

    public String obtenerTipoAutomovil() {
        return tipoA;
    }

    public String obtenerMarcaAutomovil() {
        return marca;
    }

    public Persona obtenerGarante1() {
        return garante;
    }

    public double obtenerValorAutomovil() {
        return valorA;
    }

    public double obtenerValorMensualPago() {
        return valorMens;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Tiempo de préstamo en meses: %d\n"
                + "Ciudad de Prestamo: %s\n"
                + "Tipo de Automovil: %s\n"
                + "Marca: %s\n"
                + "Garante[ \n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "]"
                + "Valor Automovil: %.2f\n"
                + "Valor Mensual: %.2f\n", beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(), tiempoPres, ciudadP,
                obtenerTipoAutomovil(),
                obtenerMarcaAutomovil(),
                obtenerGarante1().obtenerNombre(),
                obtenerGarante1().obtenerApellido(),
                obtenerValorAutomovil(), obtenerValorMensualPago());
        return cadenaFinal;
    }

}
