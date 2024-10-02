import java.util.Scanner;

public class PemilihanBilangan06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka : ");
        int angka = sc.nextInt();
        System.out.print("Masukkan angka pembagi : ");
        int bilangan = sc.nextInt();
        int nomor = angka / bilangan;

        System.out.println("Jika angka " + angka + " dibagi dengan " + bilangan + " maka hasilnya adalah " + nomor);
        String hasil = (nomor % 2 == 0) ? "Sehingga angka " + nomor + " termasuk ke dalam bilangan genap " :
        "Sehingga angka " + nomor + " termasuk ke dalam bilangan ganjil ";

        System.out.println(hasil);
    }
}