import java.util.Scanner;

public class PemilhanPercobaan305 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        double angka, angka2, hasil;
        char operator;

        System.out.print("Masukan Angka Pertama: ");
        angka = input05.nextDouble();
        System.out.print(" Masukan Angka Kedua: ");
        angka2 = input05.nextDouble();
        System.out.print("Masukan Operator (+ - * /): ");
        operator = input05.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka + angka2;
                System.out.println(angka + " + " + angka2 + " = " + hasil);
                
        
            case '-':
                hasil = angka - angka2;
                System.out.println(angka + " - " + angka2 + " = " + hasil);
                break;
            
            case '*':
                hasil = angka * angka2;
                System.out.println(angka + "  " + angka2 + " = " + hasil);
                break;

            case '/':
                hasil = angka / angka2;
                System.out.println(angka + " / " + angka2 + " = " + hasil);
                break;
        }
    }
}
