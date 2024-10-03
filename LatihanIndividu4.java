import java.util.Scanner;

public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variable
        int usia;
        String kateogriUsia;

        //Input
        System.out.print("Masukkan berapa usia anda : ");
        usia = sc.nextInt();

        //Kategori Usia
        if (usia >= 0 && usia <= 12) {
            kateogriUsia = "Anak";
        }
        else if (usia >= 13 && usia <= 19) {
            kateogriUsia = "Remaja";
        }
        else if (usia >= 20 && usia <= 64) {
            kateogriUsia = "Dewasa";
        }
        else if (usia >= 65) {
            kateogriUsia = "Lansia";
        }
        else {
            kateogriUsia = "Input tidak valid";
        }

        // Output
        System.out.println("Usia anda adalah " + usia + " tahun");
        System.out.println("Usia anda termasuk ke dalam kateogri usia " + kateogriUsia);
    }
}