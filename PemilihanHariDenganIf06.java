import java.util.Scanner;
public class PemilihanHariDenganIf06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tolong masukkan angka :");
        int bilanganBulat = sc.nextInt();

        if (bilanganBulat == 1) {
            System.out.println(bilanganBulat + " adalah hari senin dan termasuk kedalam kategori weekday");
        } else if (bilanganBulat == 2) {
            System.out.println(bilanganBulat + " adalah hari selasa dan termasuk kedalam kategori weekday");
        } else if (bilanganBulat == 3) {
            System.out.println(bilanganBulat + " adalah hari rabu dan termasuk kedalam kategori weekday");
        } else if (bilanganBulat == 4) {
            System.out.println(bilanganBulat + " adalah hari kamis dan termasuk kedalam kategori weekday");  
        } else if (bilanganBulat == 5) {
            System.out.println(bilanganBulat + " adalah hari jum'at dan termasuk kedalam kategori weekday"); 
        } else if (bilanganBulat == 6) {
            System.out.println(bilanganBulat + " adalah hari sabtu dan termasuk kedalam kategori weekend");  
        } else if (bilanganBulat == 7) {
            System.out.println(bilanganBulat + " adalah hari minggu dan termasuk kedalam kategori weekend");    
        } else {
            System.out.println(bilanganBulat + " Invalid Number");
        }
    }
}