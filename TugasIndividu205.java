import java.util.Scanner;

public class TugasIndividu205 {
    public static void main(String[] args) {
        String username = "nanda1212",inputusername, password = "lonewolf", inputpassword;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Username: ");
        inputusername = input.nextLine();
        System.out.println("Masukan Password: ");
        inputpassword = input.nextLine();

        if (inputusername.equals(username) && inputpassword.equals(password)) {
            System.out.println("Anda Telah Berhasil Login");
        } else {
            System.out.println("Username atau Password Anda Salah, Silahkan Coba Lagi");
        }
    }
}
