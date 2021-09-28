/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20zadanie2mikhailkostenkov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20Zadanie2MikhailKostenkov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите трехзначное число: ");
        int n = scanner.nextInt();
        int s = 0, m = 1;
            for(int i = 0; i < n; i++) {
                m %= n % 10;
                s += n % 10;
                n /= 10;
            }
            System.out.println("Сумма: "+ s);
    }
    
}
