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

package com.en.que.volumen;

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
