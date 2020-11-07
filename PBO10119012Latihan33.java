
package pbo119012latihan33;
import java.util.Scanner;

/**
 *NAMA  : DAMAI SAPUTRA LAOLI
 *KELAS : IF-1
 *NIM   :10119012
 * @author damai
 */

public class PBO119012Latihan33{

 private static String usName, passWord;  
    
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        usName = scanner.nextLine();
        System.out.print("Masukkan Password : ");
        passWord = scanner.nextLine();
        User user1 = new User();
        user1.pengecekkanLogin(usName,passWord);
    }
}

