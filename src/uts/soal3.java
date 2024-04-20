/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;
import java.util.Scanner;

/**
 *
 * @author Geral
 */
public class soal3 {
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
    
    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int number = scanner.nextInt();
        
        if(isPalindrome(number)) {
            System.out.println(number + " adalah bilangan palindrom.");
        } else {
            System.out.println(number + " bukan bilangan palindrom.");
        }
    }
}
