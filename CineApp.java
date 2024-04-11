/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cineapp;

import javax.swing.JOptionPane;

public class CineApp {
    private static SalaCine salaCine = new SalaCine();

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Bienvenido al sistema de CINE\n" +
                    "1. Mostrar asientos y película actual\n" +
                    "2. Modificar película\n" +
                    "3. Asignar asiento\n" +
                    "4. Salir\n" +
                    "Seleccione una opción:"
            ));

            switch (opcion) {
                case 1:
                    salaCine.mostrarAsientos();
                    break;
                case 2:
                    salaCine.modificarPelicula();
                    break;
                case 3:
                    salaCine.asignarAsiento();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }
}
