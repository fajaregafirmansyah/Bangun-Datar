package bangun.datar;

import java.util.Scanner;

public class Persegi extends BangunDatar {

    public static void main(String[] args) {
        int sisi;

        Persegi segi4 = new Persegi();
        Scanner input = new Scanner(System.in);

        System.out.println("========");
        System.out.println("Persegi");
        System.out.println("========");
        System.out.print("Masukkan sisi(cm) : ");
        sisi = input.nextInt();

        int totsi = sisi * 4;

        System.out.println("");
        System.out.println("Luas     : " + segi4.hitungluas(sisi, sisi) + " cm");
        System.out.println("Keliling : " + segi4.hitungkeliling(totsi) + " cm");
    }

    @Override
    public double hitungluas(double f1, double f2) {
        double hasil = f1 * f2;
        return hasil;
    }

    @Override
    public double hitungkeliling(double f1) {
        double hasil = f1;
        return hasil;
    }

}
