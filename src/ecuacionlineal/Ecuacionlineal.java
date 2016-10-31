/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionlineal;

import java.util.Scanner;

public class Ecuacionlineal {
    
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        double x=0;
        double y=0;      
        int denominador;
        System.out.println("Ingrese los siguientes valores");
        System.out.println("Ingrese el valor de a");
        a= teclado.nextInt();
        System.out.println("Ingrese el valor de b");
        b= teclado.nextInt();
        System.out.println("Ingrese el valor de c");
        c= teclado.nextInt();
        System.out.println("Ingrese el valor de d");
        d= teclado.nextInt();
        System.out.println("Ingrese el valor de e");
        e= teclado.nextInt();
        System.out.println("Ingrese el valor de f");
        f= teclado.nextInt();
        denominador= (a*e)-(b*d);
        if (((denominador<0 )||(denominador>0))){
           x= (double) ((c*e)-(b*f))/(denominador);
           y= (double) ((a*f)-(c*d))/(denominador);
           
           System.out.println(("el valor de X es = " + (double) Math.round(x*100)/100) +" y el de Y = " + (double) Math.round(y*100)/100) ;
        }else{
            System.out.println("No hay solución debido a que el denominador es :" + denominador);
        }
       
    }


    
}

