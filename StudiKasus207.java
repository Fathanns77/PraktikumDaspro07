import java.util.Scanner;

public class StudiKasus207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        String pesan = "Status: ";
        byte jumlahDokumen, peringkat;
        int statusPendanaan;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = sc.nextByte();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            peringkat = sc.nextByte();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    pesan += "Dana penghargaan diberikan.";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    pesan += "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                pesan += "Hanya Juara 1, 2, atau 3 yang mendapat dana penghargaan.";
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {
                if (jumlahDokumen == 4) {
                    pesan += "Dana penghargaan diberikan.";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    pesan += "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                pesan += "Program PKM tidak lolos pendanaan.";
            }

        } else {
            pesan += "Jenis kegiatan tidak memperoleh dana penghargaan.";
        }

        System.out.println();
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : " + jenisKegiatan);
        System.out.println("Jumlah dokumen : " + jumlahDokumen);
        System.out.println(pesan);

    }
}