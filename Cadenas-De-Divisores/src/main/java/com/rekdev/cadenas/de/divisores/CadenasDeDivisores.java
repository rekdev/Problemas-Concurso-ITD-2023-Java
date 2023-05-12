/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rekdev.cadenas.de.divisores;

import java.util.Scanner;
/**
 *
 * @author rekdev
 */
public class CadenasDeDivisores {

    public static void main(String[] args) {
        int cantCasosPrueba, sumaCasos = 0;
        double[] cadenaDiv;
        String cadenaCasos;
        Scanner scanner = new Scanner(System.in);
        
        cantCasosPrueba = Integer.parseInt(scanner.nextLine());
        cadenaCasos = scanner.nextLine();
        
        String[] arrayCasosPrueba = cadenaCasos.split(" ");
        int[] arrayResultados = new int[cantCasosPrueba];
                
        //Se verifica si la cantidad de casos ingresados coincide con la longitud del array de casos de prueba
        if (cantCasosPrueba == arrayCasosPrueba.length) {
            
            for (int i = 0; i < arrayCasosPrueba.length; i++) {
                cadenaDiv = crearCadenaDiv(Double.parseDouble(arrayCasosPrueba[i]));
                
                //Se realiza la suma de los divisores
                for (int j = 0; j < cadenaDiv.length; j++) {
                    sumaCasos = (int) (sumaCasos + cadenaDiv[j]);
                }
                
                arrayResultados[i] = sumaCasos;
                sumaCasos = 0;
            }
            
            //Imprimir resultados
            for (int k = 0; k < arrayResultados.length; k++) {
                //Con error pa q resalte
                System.out.print(arrayResultados[k] + " ");
            }
            
        } else {
            System.err.println("Error");
        }
        
    }
    
    /*
        * Crea un array con los divisores mas grandes de un numero
    */
    public static double[] crearCadenaDiv(double num){
        double[] cadenaDiv = new double[100];
        double div2, div3, divSiMismo;
        int i = 1;
        
        //Se asigna el numero como tal al primer indice
        cadenaDiv[0] = num;
        
        do {            
            div2 = (double) num / 2;
            div3 = (double) num / 3;
            divSiMismo = num / num;
            /* */
            num = esDivisible(div2) ? div2 : esDivisible(div3) ? div3 : divSiMismo;
            /* */
            //Se asigna el valor al array de divisores
            cadenaDiv[i] = num;
            i++;
            
        } while (num != 1);
        
        return cadenaDiv;
    }
    
    /*
        * Te dice si un numero es divisble
    */
    private static boolean esDivisible(double num){
        return (double) (num * 10000) % 10000 == 0;
    }
    
}
