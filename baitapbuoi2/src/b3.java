import java.util.Scanner;
public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine().trim();
        boolean so = false;
        boolean chu = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= '0' && ch <= '9') {
                so = true;
            }
            if (ch >= 'A' && ch <= 'Z') {
                chu = true;
            }
            if (password.length() >= 8 && so && chu) {
                System.out.println("Mat khau hop le.");
            } else {
                System.out.println("Mat khau khong hop le!");
            }
            if (password.length() < 8) {
                System.out.println("Mật khẩu phải có độ dài tối thiểu là 8 ký tự. ");
            }
            if (!so) {
                System.out.println("Mật khẩu phải chứa ít nhất 1 chữ số.");
            }
            if (!chu) {
                System.out.println("Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa.");
            }
        }
    }
}