
/**
 * StudiKasus207
 */
import java.util.Scanner;

public class StudiKasus207 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        boolean LayakDana = false;
        String alasan = "";

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
                jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {

                if (jumlahDokumen == 4) {
                    LayakDana = true;
                    alasan = "Mahasiswa meraih Juara " + peringkat + " dan dokumen lengkap.";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    alasan = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                alasan = "Hanya Juara 1, 2, atau 3 yang mendapat dana penghargaan.";
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {
                if (jumlahDokumen == 4) {
                    LayakDana = true;
                    alasan = "Tim PKM lolos pendanaan dan dokumen lengkap.";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    alasan = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                alasan = "Program PKM tidak lolos pendanaan.";
            }

        } else {
            alasan = "Jenis kegiatan tidak memperoleh dana penghargaan.";
        }

        System.out.println("\n--- Hasil Evaluasi ---");
        System.out.println("Nama Mahasiswa : " + nama);
        if (LayakDana) {
            System.out.println("Status : Dana penghargaan diberikan. (" + alasan + ")");
        } else {
            System.out.println("Status : " + alasan);
        }

    }
}