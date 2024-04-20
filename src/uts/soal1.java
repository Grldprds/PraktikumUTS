/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.Scanner;

/**
 *
 * @author Geral
 */
public class soal1 {

     public static boolean isPalindrome(int angka) {
        int digit1 = angka / 100;
        int digit3 = angka % 10;
        
        return (digit1 == digit3);
    }
     
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
       
        System.out.print("Masukkan tiga digit integer: ");
        int angka = scanner.nextInt();
        
        if(isPalindrome(angka)) {
            System.out.println(angka + " adalah bilangan palindrom.");
        } else {
            System.out.println(angka + " bukan bilangan palindrom.");
        }
    }
}
