/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rekdev.en.que.volumen;

import java.util.Scanner;

/**
 *
 * @author rekdev
 */
public class EnQueVolumen {

    public static void main(String[] args) {
        int cantCasosDePrueba;
        Scanner scanner = new Scanner(System.in);
        
        cantCasosDePrueba = Integer.parseInt(scanner.nextLine());
        //Se asigna un array de enteros con la longitud de la cantidad de casos de prueba
        int[] arrayCasos = new int[cantCasosDePrueba];
        
        for (int i = 0; i < arrayCasos.length; i++) {
            arrayCasos[i] = Integer.parseInt(scanner.nextLine());
        }
        
        for (int i = 0; i < arrayCasos.length; i++) {
            System.out.println(arrayCasos[i] / 100 );
        }
    }
}
