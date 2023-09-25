import java.util.Scanner;

public class PemilihanPercobaan105 {
    public static void main(String[] args) {
    Scanner input05 = new Scanner(System.in);
    System.out.println("Masukan Angka: ");
    int angka = input05.nextInt();
    String hasil = (angka %2 == 0) ? "Angka" +angka+ "Bilangan Genap" : "Angka" +angka+ "Bilangan Ganjil";
    System.out.println(hasil);
    }
    
}
