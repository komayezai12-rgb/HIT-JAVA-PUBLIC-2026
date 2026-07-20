import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String raw = sc.nextLine().trim();

        String[] info = raw.split("-");

        String ma = info[0].trim().toUpperCase();
        String ten = info[1].trim();
        int namSinh = Integer.parseInt(info[2].trim());
        String phongBan = info[3].trim();

        ten = ten.toLowerCase();
        String[] words = ten.split("\\s+");
        String hoTen = "";

        for (int i = 0; i < words.length; i++) {
            hoTen += Character.toUpperCase(words[i].charAt(0))
                    + words[i].substring(1);
            if (i != words.length - 1) {
                hoTen += " ";
            }
        }

        int tuoi = 2026 - namSinh;

        String pb = phongBan.toLowerCase();
        if (pb.contains("kỹ thuật") || pb.contains("ky thuat")) {
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        } else {
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }

        System.out.println("Mã nhân viên: " + ma  + " | Họ và tên: " + hoTen  + " | Tuổi: " + tuoi  + " | Bộ phận: " + phongBan);
    }
}
