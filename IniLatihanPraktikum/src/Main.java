import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
        public static void main(String[] args) {
            // Membuat objek Scanner untuk input dari pengguna
            Scanner scanner = new Scanner(in);
            /**
             * Membuat objek Scanner untuk input dari pengguna
             */

            // Meminta pengguna untuk memasukkan panjang sisi persegi
            out.print("Masukkan panjang sisi persegi: ");
            double panjangSisi = scanner.nextDouble();
            /**
             * Meminta pengguna untuk memasukkan panjang sisi persegi
             */

            // Menghitung luas persegi
            double luas = panjangSisi * panjangSisi;

            // Menampilkan hasil
            out.println("Luas persegi dengan panjang sisi " + panjangSisi + " adalah: " + luas);

            // Menutup Scanner
            scanner.close();
        }
    }