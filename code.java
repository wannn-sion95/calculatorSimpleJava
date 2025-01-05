import java.util.Scanner;

public class Sion {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------");
        System.out.println("Kalkulator Sederhana");
        System.out.println("--------------------");
        
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan angka Pertama: ");
        int angkaPertama = angka.nextInt();
        
        Scanner angka2 = new Scanner(System.in);
        System.out.print("Masukkan angka Kedua: ");
        int angkaKedua = angka2.nextInt();

        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Akar Kuadrat");

        Scanner pilihan = new Scanner(System.in);
        System.out.print("Masukkan pilihan: ");
        int pilihanOperasi = pilihan.nextInt();
        
        if (pilihanOperasi == 1) {
            
            int kalkulatorSederhana = angkaPertama + angkaKedua;
            System.out.println("Hasil penjumlahan: " + kalkulatorSederhana);
        }
        else if (pilihanOperasi == 2) {
            
            int kalkulatorSederhana2 = angkaPertama - angkaKedua;
            System.out.println("Hasil pengurangan: " + kalkulatorSederhana2);   
        }

        else if (pilihanOperasi == 3) { 
            
            int kalkulatorSederhana3 = angkaPertama * angkaKedua;
            System.out.println("Hasil perkalian: " + kalkulatorSederhana3);
        }
        
        else if (pilihanOperasi == 4) {
        int kalkulatorSederhana4 = angkaPertama / angkaKedua;
        System.out.println("Hasil pembagian: " + kalkulatorSederhana4);
        
    }

    else if (pilihanOperasi == 5) {
        double kalkulatorSederhana5 = Math.sqrt(angkaPertama);
        double kalkulatorSederhana6 = Math.sqrt(angkaKedua);
        System.out.println("Hasil akar kuadrat angka pertama: " + kalkulatorSederhana5);
        System.out.println("Hasil akar kuadrat angka kedua: " + kalkulatorSederhana6);
    }
    System.out.println("---------------------------------------------------------");
        System.out.println("Terima kasih karena sudah menggunakan kalkulator kami ^_^");
    System.out.println("---------------------------------------------------------");
}
}
