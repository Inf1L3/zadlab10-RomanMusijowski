/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {
    
    public static void main(String[] args) {
        int intValue;
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Podaj liczbe int: ");
            intValue = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Wprowadzono nieprawidlowy typ danych!");
        }
    }
        
        
}
