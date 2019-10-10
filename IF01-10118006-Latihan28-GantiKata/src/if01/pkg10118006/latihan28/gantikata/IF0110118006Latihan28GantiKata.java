
package if01.pkg10118006.latihan28.gantikata;
import java.util.Scanner;
/*
 * Nama      : Alfarizi Rizki Pane
 * Kelas     : IF-1
 * NIM       : 10118006
 * Deskripsi : Mengganti kata yang dipilih
 */

public class IF0110118006Latihan28GantiKata {
    public static void main(String[] args) {

         String kalimatawal, kalimatbaru, cari, ganti;

        Scanner masuk = new Scanner(System.in);

        //input
        System.out.println("=====Program Mengganti Kata=====");
        System.out.print("Masukkan Kalimat\t: ");
        kalimatawal = masuk.nextLine();
        System.out.print("Ganti Kata\t\t: ");
        cari = masuk.nextLine();
        System.out.print("Menjadi Kata\t\t: ");
        ganti = masuk.nextLine();
        //output
        kalimatbaru = kalimatawal.replace(cari, ganti);
        System.out.println("\n======Hasil Formatting=====");
        System.out.printf("Kalimat awal\t: %s%n", kalimatawal);
        System.out.printf("Kalimat baru\t: %s%n", kalimatbaru);
    }
    
}