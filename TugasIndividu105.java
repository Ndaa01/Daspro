import java.util.Scanner;
public class TugasIndividu105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jarak;
        System.out.println("Masukan Jarak: ");
        jarak = input.nextInt();
        if (jarak < 5) {
            System.out.println("Menggunakan Melee Weapon");
        } else {
            System.out.println("Menggunakan Ranged Weapon");
        }
    }
}
