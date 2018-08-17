import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class XoSo {

    public static void main(String[] args) {
	// write your code here
        System.out.println("-----Chuong trinh Xo So -----");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhập vào số đầu tiên la: ");
        int guessDigit1 = sc.nextInt();
        System.out.println("Nhập vào số thứ 2 la:");
        int guessDigit2 = sc.nextInt();
        Random rd = new Random();
        int lottery = rd.nextInt(99);
        System.out.println("Giải đặc biệt là: " + lottery);

        int num1 = lottery / 10;
        int num2 = lottery % 10;

        if (guessDigit1 == num1) {
            if (guessDigit2 == num2) {
                System.out.println("Giai nhat la 10000$ ");
            } else {
                System.out.println("Giải ba 1000$ rồi đó");
            }
        } else if (guessDigit2 == num1) {
            if (guessDigit1 == num2) {
                System.out.println("Giải nhì nhận được 3000$");
            } else {
                System.out.println("Giải ba mang về 1000$");
            }
        } else {
            System.out.println("Chúc bạn may mắn lần sau");
        }
    }
}
