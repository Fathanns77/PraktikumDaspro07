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
        }
    }
}