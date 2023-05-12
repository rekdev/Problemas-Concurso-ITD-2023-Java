/*
 * Copyright (C) 2023 rekdev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.se.ha.colado;

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
