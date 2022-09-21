package com.haidar.praktikumpbo.pertemuan6.unguided;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pil;
        double x, y;
        Scanner input = new Scanner(System.in);

        System.out.println("Calculator untuk menghitung luas dan keliling bangun datar");
        System.out.println("========================================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Keliling Segitiga");
        System.out.println("4. Luas Segitiga");
        System.out.println("5. Lingkaran");
        System.out.println("========================================\n");

        System.out.print("Pilih menu (1 - 5) : ");
        pil = input.nextInt();

        switch (pil) {
            case 1:
                System.out.println("\nMenghitung bangun datar 'Luas dan Keliling Persegi'");

                System.out.print("Masukkan sisi : ");
                x = input.nextDouble();

                Persegi persegi = new Persegi(x);
                System.out.println("Luas persegi " + persegi.luas());
                System.out.println("Keliling persegi " + persegi.keliling());

                break;
            case 2:
                System.out.println("\nMenghitung bangun datar 'Luas dan Keliling Persegi Panjang'");

                System.out.print("Masukkan panjang : ");
                x = input.nextDouble();
                System.out.print("Masukkan lebar : ");
                y = input.nextDouble();

                PersegiPanjang persegiPanjang = new PersegiPanjang(x, y);
                System.out.println("Luas persegi panjang " + persegiPanjang.luas());
                System.out.println("Keliling persegi panjang " + persegiPanjang.keliling());

                break;
            case 3:
                System.out.println("\nMenghitung bangun datar 'Keliling Segitiga'");

                System.out.print("Masukkan sisi : ");
                x = input.nextDouble();

                KelSegitiga kelSegitiga = new KelSegitiga(x);
                System.out.println("Keliling segitiga " + kelSegitiga.keliling());

                break;
            case 4:
                System.out.println("\nMenghitung bangun datar 'Luas Segitiga'");

                System.out.print("Masukkan alas : ");
                x = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                y = input.nextDouble();

                LuSegitiga luSegitiga = new LuSegitiga(x, y);
                System.out.println("Luas segitiga " + luSegitiga.luas());

                break;
            case 5:
                System.out.println("\nMenghitung bangun datar 'Luas dan Keliling Lingkaran'");

                System.out.print("Masukkan jari - jari : ");
                x = input.nextDouble();

                Lingkaran lingkaran = new Lingkaran(x);
                System.out.println("Luas lingkaran " + lingkaran.luas());
                System.out.println("Keliling lingkaran " + lingkaran.keliling());

                break;

            default:
                System.out.println("Maaf inputan yang anda masukkan salah");
                break;
        }
    }
}
