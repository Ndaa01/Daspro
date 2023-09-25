import java.util.Scanner;

public class PemilihanPercobaan205 {
    public static void main(String[] args) {
    Scanner input05 = new Scanner(System.in);
    System.out.println("Nilai Uas: ");
    float Uas = input05.nextFloat();
    System.out.println("Nilai Uts: ");
    float Uts = input05.nextFloat();
    System.out.println("Nilai Kuis: ");
    float Kuis = input05.nextFloat();
    System.out.println("Nilai Tugas: ");
    float Tugas = input05.nextFloat();
    
    float total = (Uas * 0.40F) + (Uts * 0.30F) + (Kuis * 0.10F) + (Tugas * 0.20F);
    String message = total <65 ? "Remidi" : "Tidak Remidi";
    System.out.println("Nilai Akhir = " + total + " Keterangan: " + message );
    }
}
