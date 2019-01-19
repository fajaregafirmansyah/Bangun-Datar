package bangun.datar;

import java.util.Scanner;

public class PersegiPanjang extends BangunDatar {

    public static void main(String[] args) {
        int p, l;

        PersegiPanjang panjang = new PersegiPanjang();
        Scanner input = new Scanner(System.in);

        System.out.println("===============");
        System.out.println("Persegi Panjang");
        System.out.println("===============");
        System.out.print("Masukkan panjang(cm) : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar(cm)   : ");
        l = input.nextInt();

        int totsi = (p + l) * 2;

        System.out.println("");
        System.out.println("Luas     : " + panjang.hitungluas(p, l) + " cm");
        System.out.println("Keliling : " + panjang.hitungkeliling(totsi) + " cm");
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
