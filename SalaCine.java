/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cineapp;

import javax.swing.JOptionPane;

public class SalaCine {
    private String[][] asientos = {
            {"L", "L", "L", "L", "L", "L"},
            {"L", "L", "O", "O", "L", "L"},
            {"O", "O", "O", "O", "O", "O"},
            {"L", "L", "O", "O", "L", "L"},
            {"L", "L", "O", "O", "L", "L"}
    };

    private String peliculaActual = "Megalodon 2";

    public void mostrarAsientos() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Estado de los asientos para la película ").append(peliculaActual).append(":\n");
        mensaje.append("|      ------------------------------------- Pantalla\n");
        mensaje.append("A      ").append(asientos[0][0]).append("    ").append(asientos[0][1]).append("    ").append(asientos[0][2]).append("    ").append(asientos[0][3]).append("    ").append(asientos[0][4]).append("    ").append(asientos[0][5]).append("\n");
        mensaje.append("B      ").append(asientos[1][0]).append("    ").append(asientos[1][1]).append("    ").append(asientos[1][2]).append("    ").append(asientos[1][3]).append("    ").append(asientos[1][4]).append("    ").append(asientos[1][5]).append("\n");
        mensaje.append("C      ").append(asientos[2][0]).append("    ").append(asientos[2][1]).append("    ").append(asientos[2][2]).append("    ").append(asientos[2][3]).append("    ").append(asientos[2][4]).append("    ").append(asientos[2][5]).append("\n");
        mensaje.append("D      ").append(asientos[3][0]).append("    ").append(asientos[3][1]).append("    ").append(asientos[3][2]).append("    ").append(asientos[3][3]).append("    ").append(asientos[3][4]).append("    ").append(asientos[3][5]).append("\n");
        mensaje.append("E      ").append(asientos[4][0]).append("    ").append(asientos[4][1]).append("    ").append(asientos[4][2]).append("    ").append(asientos[4][3]).append("    ").append(asientos[4][4]).append("    ").append(asientos[4][5]).append("\n");
        mensaje.append("|    1         2         3         4         5         6");

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Asientos del Cine", JOptionPane.INFORMATION_MESSAGE);
    }

    public void modificarPelicula() {
        String nuevaPelicula = JOptionPane.showInputDialog("Ingrese el nombre de la nueva película:");
        if (nuevaPelicula != null && !nuevaPelicula.isEmpty()) {
            peliculaActual = nuevaPelicula;
            JOptionPane.showMessageDialog(null, "La película actual se ha cambiado a: " + peliculaActual);
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de película no válido. Intente nuevamente.");
        }
    }

    public void asignarAsiento() {
        String filaInput = JOptionPane.showInputDialog("Ingrese la fila del asiento (A-E):");
        String columnaInput = JOptionPane.showInputDialog("Ingrese el número de asiento (1-6):");

        if (filaInput != null && columnaInput != null && filaInput.length() == 1 && filaInput.matches("[A-E]") &&
                columnaInput.length() == 1 && columnaInput.matches("[1-6]")) {
            int fila = filaInput.charAt(0) - 'A';
//
            int columna = Integer.parseInt(columnaInput) - 1;

            if (asientos[fila][columna].equals("L")) {
                asientos[fila][columna] = "O";
                JOptionPane.showMessageDialog(null, "Asiento asignado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El asiento seleccionado está ocupado. Intente nuevamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Asiento no válido. Intente nuevamente.");
        }
    }
}
