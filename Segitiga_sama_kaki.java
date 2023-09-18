import java.util.Scanner;
public class Segitiga_sama_kaki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi, alas , tinggi;
        float luas, keliling;
        System.out.println("Masukan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukan tinggi: ");
        tinggi = sc.nextInt();
         System.out.println("Masukkan sisi: ");
        sisi = sc.nextInt();
        luas =  alas * tinggi / 2;
        keliling = sisi + sisi + sisi;
        System.out.println("luas Lingkaran adalah: " + luas);
        System.out.println("keliling Lingkaran adalah: " + keliling);
    }

}