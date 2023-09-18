import java.util.Scanner;
public class Persegi_panjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar;
        float luas, keliling;
        System.out.println("Masukan panjang: ");
        panjang = sc.nextInt();
        System.out.println("Masukan lebar: ");
        lebar = sc.nextInt();
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
        System.out.println("luas Persegi Panjang adalah: " + luas);
        System.out.println("keliling Persegi Panjang adalah: " + keliling);
    }

}