/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kernivel.vector_02;

/**
 *
 * @author Roberto Calero
 */
        /*
        Realice un programa que cuente el número de elementos impares en posiciones
        pares de un vector.
        */
public class Vector_02 {

    public static void main(String[] args) {
        
        //Creamos un vector, ya que ejercicio no dice de que longitud o cantidad, lo delimitaremos a 20
        int valores [] = new int [20];
        //Creamos el contador inicioalizado en cero
        int cont = 0;
         //Creamos el ciclo repetitivo for para recorrer las posiciones del vector
        for(int x = 0 ; x < 20 ; x++){
            //Llenamos la posicion x del vector con un numero aleatorio
            //Math.random es una funcionalidad de java que da numeros aleatorios ente 0.0 y 1
            //El 10 determina el valor maximo del numero random y 1 determina la cantidad minima del raondom
            // (int) esto comvierte los valores random en enteros, recordemos que los valores random obtenidos son double
            valores [x] = (int)(Math.random() * 100) + 1;
        }
        
        /*Podemos verificar las condiciones del problema en el monento de llenar el vector pero para fines de estudio
          realizares el proceso por separado
        */
        //Creamos otro ciclo for para realizar las directrices del problema
        //1. número de elementos impares
        //2. en posiciones pares de un vector
        for(int x = 0 ; x < 20 ; x++){
            //Primero como deternino si la posicion es par o impar del vector?, esto lo hacemos con la variable x
            //Creamos una condicion donde obtenemos el residuo de x y verificamos que sea cero
            // % es mod en programacion una operacion que obtiene el reciduo de una division
            //Recordemos que si el residuo es cero es par
            if(x % 2 == 0){
                //Una vez determino que la posicion es par
                //Verificamos si el valor de esta pocision en impar, esto con el mod % si el residuo es diferente de cero
                if(valores [x] % 2 != 0){
                    //Contamos + 1
                    cont++;
                }
            }
            //Imprimimos los valores del vector
            System.out.println("Posicion: " + x + "- Valor: "+valores [x]);
        }
        //Salida de resultados
        System.out.println("La cantidad de valores impares en las posiciones pares del vector son: " + cont);
        
    }
}
