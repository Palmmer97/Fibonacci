/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author 65676
 */
public class Fibonacci {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa Un Numero Para Calcular La Serie De Fibonacci:\n");
        long num = sc.nextLong();
        
        fibonacci2 fb = new fibonacci2();
        System.out.println("[ITERATIVO] Fibonacci creado:  "+ fb.calcularFibonacciI(num)+"\n");
        System.out.println("[RECURSIVO] Fibonacci creado:  "+ fb.calcularFibonacciR(num)+"\n");
         
    }
    
}
