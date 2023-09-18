import java.util.Scanner;
public class Lingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double phi;
        int r;
        int luas, keliling;
        System.out.println("Masukan phi: ");
        phi = sc.nextDouble();
        System.out.println("Masukan jari-jari: ");
        r = sc.nextInt();
        luas =  (int)phi * r * r;
        keliling = 2 * r * r;
        System.out.println("luas Lingkaran adalah: " + luas);
        System.out.println("keliling Lingkaran adalah: " + keliling);
    }

}

