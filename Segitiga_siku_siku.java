import java.util.Scanner;
public class Segitiga_siku_siku {
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
        keliling = 3 * sisi;
        System.out.println("luas Segitiga Siku siku adalah: " + luas);
        System.out.println("keliling Segitiga Siku siku adalah: " + keliling);
    }

}
    
