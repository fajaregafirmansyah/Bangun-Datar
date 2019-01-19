package bangun.datar;

import java.util.Scanner;

public class Lingkaran extends BangunDatar {

    static double phi = 3.14;

    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();
        Scanner input = new Scanner(System.in);

        double r;

        System.out.println("=========");
        System.out.println("Lingkaran");
        System.out.println("=========");

        System.out.print("Masukkan jari-jari(cm) : ");
        r = input.nextInt();
        double kel = 2 * phi * r;

        System.out.println("");
        System.out.println("Luas lingkaran     : " + ling.hitungluas(r, r) + " cm");
        System.out.println("Keliling lingkaran : " + ling.hitungkeliling(kel) + " cm");
    }

    @Override
    public double hitungluas(double f1, double f2) {
        double hasil = 0.5 * phi * f1 * f2;
        return hasil;
    }

    @Override
    public double hitungkeliling(double f1) {
        double hasil = f1;
        return hasil;
    }

}
