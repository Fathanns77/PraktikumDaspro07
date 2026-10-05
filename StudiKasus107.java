
/**
 * StudiKasus107
 */
import java.util.Scanner;

public class StudiKasus107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang yang dibayar: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        if (totalHarga > 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: Rp" + totalHarga);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total bayar: Rp" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
    }
}