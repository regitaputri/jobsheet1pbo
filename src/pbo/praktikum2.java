/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class praktikum2 {
       public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double c = 78;
        System.out.print("Suhu yang dikonversi: "+c+ "C\n ");
        int pilihan;
        do{
            System.out.println("\nMENU KONVERSI SUHU");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Reamur");
            System.out.println("3. Kelvin");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan = scan.nextInt();
            switch(pilihan){
                case 1: double f = c*9/5+32;
                    System.out.println("Konversi celcius ke fahrenheit");
                    System.out.print(c+" 'C "+"= "+f+" 'F");
                    System.out.println();
                    break;
                case 2: double r = c*4/5;
                    System.out.println("Konversi celcius ke reamur");
                    System.out.print(c+" 'C"+"= "+r+" 'R");
                    System.out.println();
                    break;
                case 3: double k = c+273;
                    System.out.println("Konversi celcius ke kelvin");
                    System.out.print(c+" 'C"+"= "+k+" K");
                    System.out.println();
                    break;
            }
        }while(pilihan !=4);
            }
        }
 