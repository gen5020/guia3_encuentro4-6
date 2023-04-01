/*
8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
*/
package Ejercicios;

import java.util.Scanner;

public class E8_Cuadro_Asterisco {

    public static void main(String[] args) {
   Scanner leer= new Scanner(System.in); 
        System.out.println("Ingrese Número:");     
   int n= leer.nextInt();
        
    for(int l=1;l<(n);l++){
        System.out.println("*");
        for(int ls=0;ls<(l);ls++){
        System.out.print("o");
            for(int li=0;li<(ls);li++){
              System.out.print("i"); 
              for(int ld=1;ld<(ls);ld++){
                   System.out.print("-");
              }
            }
        }
    }
    
}
}
