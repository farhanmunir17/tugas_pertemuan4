import java.util.Scanner;

class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Hitung Luas Bangun Datar ==");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("Masukan pilihan 1/2/3");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                // luas persegi
                System.out.println("Masukan Panjang Sisi:");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas Persegi:" + luasPersegi);
                break;
            case 2:
                // luas segitiga
                System.out.println("Masukan Alas:");
                double alas = input.nextDouble();
                System.out.println("Masukan Tinggi:");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * (alas * tinggi);
                System.out.println("Luas Segitiga:" + luasSegitiga);
                break;
            case 3:
                // luas lingkaran
                double pi = 3.14;
                System.out.println("Masukan Jari-Jari:");
                double jariJari = input.nextDouble();
                double luasLingkaran = 2 * (pi * jariJari);
                System.out.println("Luas Lingkaran:" + luasLingkaran);
                break;
            default:
                System.out.println("Tidak Valid");
                break;

        }
    }
}
