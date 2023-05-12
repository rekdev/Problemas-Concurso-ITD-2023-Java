/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rekdev.se.ha.colado;

import java.util.Scanner;

/**
 *
 * @author rekdev
 */
public class SeHaColado {

    public static void main(String[] args) {
        int casosPrueba;
        Scanner scanner = new Scanner(System.in);
        
        casosPrueba = Integer.parseInt(scanner.nextLine());
        int[] resultados = new int[casosPrueba];
        
        for (int contCasos = 0; contCasos < casosPrueba; contCasos++) {
            int cantNumeros, colados = 0;
            int[] arrayNumeros;
            String cadenaNumeros;
            
            cantNumeros = Integer.parseInt(scanner.nextLine());
            cadenaNumeros = scanner.nextLine();
            
            arrayNumeros = enArrayInt(cadenaNumeros);
            
            if (cantNumeros == arrayNumeros.length) {
                for (int i = 0; i < arrayNumeros.length; i++) {
                    int iSiguiente = i + 1;
                
                    if (iSiguiente < arrayNumeros.length) {
                        if (arrayNumeros[i] > arrayNumeros[iSiguiente]) {
                            colados++;
                        }
                    }                
                }
            
                resultados[contCasos] = colados;
            } else {
                System.err.println("Error");
            }
           
        }
        
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
        
    }
    
    /*
        *
        *
    */
    public static int[] enArrayInt(String cadena) {
        String[] arrayNumerosTmp = cadena.split(" ");
        int[] arrayNumeros = new int[arrayNumerosTmp.length];
            
        for (int iNumTmp = 0; iNumTmp < arrayNumerosTmp.length; iNumTmp++) {
            arrayNumeros[iNumTmp] = Integer.parseInt(arrayNumerosTmp[iNumTmp]);
        }
           
        return arrayNumeros;
    }
    
}
