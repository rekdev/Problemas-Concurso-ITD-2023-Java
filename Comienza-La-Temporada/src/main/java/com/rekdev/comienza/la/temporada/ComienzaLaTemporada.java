/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rekdev.comienza.la.temporada;

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
