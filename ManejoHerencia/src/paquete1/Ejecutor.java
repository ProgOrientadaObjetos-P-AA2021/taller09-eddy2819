/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
// INTEGRANTES:
// Eddy Guarnizo      Dario Celi

import java.util.Locale;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;


public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int option = 1;
        boolean ext = true;
        do {
            System.out.println("Eliga una opcion\n"
                    + "1. Ingresar Prestamo de Automovil\n"
                    + "2.Ingresar Prestamo Educativo");
            int opcion = sc.nextInt();
            sc.nextLine();
            System.out.printf("Ingrese el nombre del Cliente:\n ");
            String nomC = sc.nextLine();
            System.out.printf("Ingrese el apellido del Cliente:\n ");
            String ape = sc.nextLine();
            System.out.printf("Ingrese el tiempo de préstamo en meses:\n ");
            int tiemM = sc.nextInt();
            System.out.printf("Ingrese la ciudad :\n ");
            sc.nextLine();
            String ciu = sc.nextLine();

            Persona per = new Persona(nomC, ape);

            if (opcion == 1) {
                System.out.printf("Ingrese el tipo de Automovil:\n ");
                String tipo = sc.nextLine();
                System.out.printf("Ingrese la marca del Automovil:\n ");
                String marca = sc.nextLine();
                System.out.println("Ingrese Nombre del garante");
                String no = sc.nextLine();
                System.out.println("Ingrese Apellido del garante");
                String a = sc.nextLine();
                System.out.printf("Ingrese el costo del Automovil:\n ");
                double valorA = sc.nextDouble();
                Persona per1 = new Persona(no, a);
                PrestamoAutomovil presAu = new PrestamoAutomovil(per, tiemM, ciu, tipo, marca, per1, valorA);
                presAu.establecerValorMensualPago();
                System.out.println(presAu);
            } else {
                System.out.printf("Ingrese su nivel de estudios:\n ");
                String nivel = sc.nextLine();
                System.out.printf("Ingrese el nombre del centro Educativo:"
                        + "\n ");
                String nomc = sc.nextLine();
                System.out.printf("Ingrese el costo de la carrera:\n ");
                double valorC = sc.nextDouble();
                PrestamoEducativo presEdu = new PrestamoEducativo(per, tiemM, ciu, nivel, nomc, valorC);
                presEdu.establecerValorMensual();
                System.out.println(presEdu);
            }
            System.out.printf("\nElija una opcopn a realizar:"
                    + "\n1) Ingresar otro prestamo\n  2) Salir del programa\n ");
            sc.nextLine();
            option = sc.nextInt();
            System.out.println("");
            if (option == 1) {
                ext = true;
            } else {
                System.out.println("Fue todo un placer Atenderle ");
                ext = false;
            }

        } while (ext);
    }

}
