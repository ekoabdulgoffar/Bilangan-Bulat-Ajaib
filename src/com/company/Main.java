package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka antara 1 - 100: ");
        String input_user = input.nextLine();

        if (cek_angka(input_user)) {
            int angka = Integer.parseInt(input_user);
            if (angka >= 1 && angka <= 100) { // kondisi hanya angka bulat positif 1 - 100
                if (angka % 2 != 0) {
                    System.out.println("AJAIB");
                } else if (angka % 2 == 0 && angka >= 2 && angka <= 5 | angka > 20) {
                    System.out.println("Tidak AJAIB");
                } else if (angka % 2 == 0 && angka >= 6 && angka <= 20) {
                    System.out.println("AJAIB");
                }
            } else {
                System.out.println("Maaf, hanya untuk bilangan bulat positif Integer antara 1 - 100.");
            }
        } else {
            System.out.println("Maaf, yang ada inputkan ada yang bukan angka.");
        }
    }

    static boolean cek_angka(String digit) {
        // validasi untuk cek apakah bukan angka
        boolean isdigit = true;
        for (char c : digit.toCharArray()) {
            if (!Character.isDigit(c)) { // cek jika buka angka
                isdigit = false;
                break;
            }
        }
        return isdigit;
    }
}
