/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {

        Scanner scanner= new Scanner(System.in);

//        int intValue;
//        Scanner scanner = new Scanner(System.in);
//
//        try{
//            System.out.print("Podaj liczbe int: ");
//            intValue = scanner.nextInt();
//        }
//        catch(InputMismatchException e){
//            System.out.println("Wprowadzono nieprawidlowy typ danych!");
//        }



    public wprowadzZKonsoli(){}

    public void wprowadzInt(){
        int liczba
        System.out.println("podaj liczbe ");
        try {
            liczba = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Zly typ");
        }
    }

    public void wprowadzstring(){
        String wyraz;

        System.out.println("Podaj wyraz ");

        try {
            wyraz = scanner.nextLine();
        }catch (InputMismatchException e){
            System.out.println("Zly typ");
        }
    }

    public void wprowadzFloat(){
        float liczba;

        System.out.println("Podaj liczbe");
        try {
            liczba = scanner.nextFloat();
        }catch (InputMismatchException e){
            System.out.println("Zly typ");
        }
    }

    public void wprowadzLong(){
        long liczba;

        System.out.println("Podaj liczbe");
        try {
            liczba = scanner.nextLong();
        }catch (InputMismatchException e){
            System.out.println("Zly typ");
        }
    }

    public void wprowadzChar(){
        char znak;

        System.out.println("Podaj znak");
        try {
            znak = scanner.next().charAt(0);
        }catch (InputMismatchException e){
            System.out.println("Zly typ");
        }
    }

    public void wprowadzShort(){
        short liczba;

        System.out.println("Podaj liczbe");
        try {
            liczba = scanner.nextShort();
        }catch (InputMismatchException e){
            System.out.println("Zly typ");
        }
    }


    public void ToFiletext() throws IOException{
        String nazwaPliku;
        System.out.println("Podaj nazwe plku");
        nazwaPliku=scanner.nextLine();

        try{
            FileWriter nadpis = new FileWriter(nazwaPliku+".txt");
            BufferedWriter bufor = new BufferedWriter(nadpis);
            String text;
            System.out.println("wpisujemy text  do pliku ");
            text = scanner.nextLine();
            bufor.write(text);
            bufor.newLine();
            bufor.close();
        }catch (IOException e){
            System.out.println("BLAD zapisu do plik");
        }
    }

    public void FromFileText() throws FileNotFoundException, IOException{
        String nazwapliku;
        System.out.println("Z jakiego pliku chcesz odczytac ?");
        nazwapliku = scanner.nextLine();
        try{
            FileReader odczyt = new FileReader(nazwapliku + ".txt");
            BufferedReader bufor = new BufferedReader(odczyt);

            String text = bufor.readLine();

            do{
                System.out.println(text);
                text = bufor.readLine();
            } while (text != null);
        } catch (FileNotFoundException e){
            System.out.println("Nie ma takiego pliku");
        }

    }
}
