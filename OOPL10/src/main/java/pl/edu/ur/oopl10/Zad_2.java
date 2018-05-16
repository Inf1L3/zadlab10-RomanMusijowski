/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zad_2 {
    public static void main(String[] args) {
        
         int[] arr = {10, 20, 30, 40, 50};
         
        Scanner x = new Scanner(System.in);
        
        System.out.println("Który element tablicy wyświetlić?");
        int y = x.nextInt();
        x.close();
        
        try {
            int c;
            System.out.println(arr[y]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("INDEKS POZA TABELICĄ");
        }
    }   
}
