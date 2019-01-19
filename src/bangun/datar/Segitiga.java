package bangun.datar;

import java.util.Scanner;

public class Segitiga extends BangunDatar {

    public static void main(String[] args) {
        int alas, tinggi, sisi2, sisi3;

        Segitiga segi = new Segitiga();
        Scanner input = new Scanner(System.in);

        System.out.println("========");
        System.out.println("Segitiga");
        System.out.println("========");

        System.out.print("Masukkan Alas(cm) : ");
        alas = input.nextInt();
        System.out.print("\nMasukkan Tinggi(cm) : ");
        tinggi = input.nextInt();
        System.out.print("\nMasukkan Sisi 2(cm) : ");
        sisi2 = input.nextInt();
        System.out.print("\nMasukkan Sisi 3(cm) : ");
        sisi3 = input.nextInt();

        int totsi = alas + sisi2 + sisi3;
        System.out.println("===========================");
        System.out.println("Luas     : " + segi.hitungluas(alas, tinggi) + " cm");
        System.out.println("Keliling : " + segi.hitungkeliling(totsi) + " cm");
        System.out.println("===========================");

        System.out.println("\nPhytagoras : mencari sisi Miring ( sisi c)");
        int sis1 = 0;
        int sis2 = 0;
        System.out.print("\nMasukkan sisi b(cm) : ");
        sis1 = input.nextInt();
        System.out.print("\nMasukkan sisi a(cm) : ");
        sis2 = input.nextInt();

        System.out.println("");
        System.out.println("===========================");
        System.out.println("Hasil phytagoras : " + segi.Phytagoras(sis1, sis2) + " cm");
        System.out.println("===========================");
    }

    @Override
    public double hitungluas(double f1, double f2) {
        double hasil = (f1 * f2) / 2;
        return hasil;
    }

    @Override
    public double hitungkeliling(double f1) {
        double hasil = f1;
        return hasil;
    }

    @Override
    public int Phytagoras(int f1, int f2) {
        int pitagoras = ((f1 * f1) + (f2 * f2));
        int hasil = (int) Math.sqrt(pitagoras);
        return hasil;
    }

}
