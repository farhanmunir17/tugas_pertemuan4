import java.util.Scanner;

class tugasP3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("=== DATA NILAI MAHASISWA ===");

        // Input NAMA
        System.out.print("NAMA: ");
        String nama = input.nextLine();

        // Input NIM
        System.out.print("NIM: ");
        int NIM = input.nextInt();

        // Input Nilai TUGAS
        System.out.print("NILAI TUGAS: ");
        int TUGAS = input.nextInt();

        // Input Nilai UTS
        System.out.print("NILAI UTS: ");
        int UTS = input.nextInt();

        // Input Nilai UAS
        System.out.print("NILAI UAS: ");
        int UAS = input.nextInt();

        // Input Nilai Akhir
        double Nilai_Akhir = (TUGAS * 0.3f + UTS * 0.3f + UAS * 0.3);
        System.out.println("Nilai_Akhir = " + Nilai_Akhir);

        // if condition
        if (Nilai_Akhir >= 60) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }

        // Grade Nilai
        if (Nilai_Akhir >= 80) {
            System.out.print("A");
        } else if (Nilai_Akhir >= 70) {
            System.out.print("B");
        } else if (Nilai_Akhir >= 60) {
            System.out.print("C");
        } else if (Nilai_Akhir >= 50) {
            System.out.print("D");
        } else if (Nilai_Akhir < 50) {
            System.out.print("E");
        }

    }
}
