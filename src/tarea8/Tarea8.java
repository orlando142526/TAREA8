
package tarea8;

import java.util.Scanner;

/**
 *
 * @author orlan
 */

public class Tarea8 {

   
    public static void main(String[] args) {
        
     Integer[][] array1 = {{5,2,9,6},{7,2,1,4}};

        System.out.println("Valor mínimo: " + values.valorMinimo(array1));
        System.out.println("Valor máximo: " + values.valorMaximo(array1));

        System.out.print("Introduce un valor a buscar: ");
        Integer valor = new Scanner(System.in).nextInt();
        values.buscarValor(array1, valor);

        System.out.print("Introduce un valor a eliminar: ");
        valor = new Scanner(System.in).nextInt();
        values.borrarValor(array1, valor);
        values.buscarValor(array1, valor);
    }
}