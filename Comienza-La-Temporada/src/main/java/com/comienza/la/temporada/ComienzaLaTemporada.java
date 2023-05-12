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

package com.comienza.la.temporada;

import java.util.Scanner;

/**
 *
 * @author rekdev
 */
public class ComienzaLaTemporada {

    public static void main(String[] args) {
        int[] argumentos, jugadores, uniformes;
        int coincidencias = 0,  cantJug = 0, casosPrueba;
        Scanner scanner = new Scanner(System.in);
        
        casosPrueba = Integer.parseInt(scanner.nextLine());
        int[] resutados = new int[casosPrueba];
        /*
            ***
            *
        */
        for (int iCasos = 0; iCasos < casosPrueba; iCasos++) {
            //
            argumentos = separarCadenaEnteros(scanner.nextLine());
            jugadores = separarCadenaEnteros(scanner.nextLine());
            uniformes = separarCadenaEnteros(scanner.nextLine());
            
            
            if(argumentos[0] == jugadores.length && argumentos[1] == uniformes.length) {
                //
                //
                for (int iJug = 0; iJug < jugadores.length; iJug++) {
                    
                    for (int iUni = 0; iUni < uniformes.length; iUni++) {
                        if (jugadores[iJug] == uniformes[iUni] || jugadores[iJug] + 1 == uniformes[iUni]) {
                            coincidencias++;
                            uniformes[iUni] = 0;
                        }
                    }
                    cantJug = iJug + 1;
                }
                
                //
                //Array resultados  
                //
                resutados[iCasos] = cantJug - coincidencias;
                coincidencias = 0;
                
            } else {
                System.err.println("Error");
            }
            
            //
        }
        /*
            **
            *
        */
        //Impresion de los resultados
        for (int iRes = 0; iRes < resutados.length; iRes++) {
            System.out.println(resutados[iRes]);
        }
    }
    
    public static int[] separarCadenaEnteros(String args) {
        String[] argsArrayCadena = args.split(" ");
        int[] argsArrayInt = new int[argsArrayCadena.length];
        
        for (int i = 0; i < argsArrayCadena.length; i++) {
            argsArrayInt[i] = Integer.parseInt(argsArrayCadena[i]);
        }
        
        return argsArrayInt;
    }
}
