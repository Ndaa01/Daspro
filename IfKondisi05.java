import java.util.Scanner;

public class IfKondisi05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.println("Masukan Suhu :");
        int suhu = sc05.nextInt();

        if (suhu <16){
            System.out.println("Silahkan Menggunakan Jaket");
        }
        if (suhu <20){
            System.out.println("Silahkan Menggunakan Baju Tebal");
        }
        else{
            System.out.println("Silahkan Pakai Topi");
        }
    }
}
