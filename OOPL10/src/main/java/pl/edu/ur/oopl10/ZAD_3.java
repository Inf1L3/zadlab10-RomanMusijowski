/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class ZAD_3 {
        public class ArithmeticThrow extends Exception {
        public void test(){
            double dzielna = 10;
            double dzielnik = 0;
            double wynik;

            try{
                wynik = dzielna / dzielnik;
            }
            catch(ArithmeticException e){
                System.out.println("Przechwycono ArithmeticException (dzielenie przez zero)");
            }
        }
    }   
}
