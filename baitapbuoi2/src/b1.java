import java.util.Scanner;
public class b1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap x1: ");
        int x1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap x2: ");
        int x2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap y1: ");
        int y1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap y2: ");
        int y2 = Integer.parseInt(scanner.nextLine());
        double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.print("Khoang cach giua 2 diem A va B la: ");
        System.out.printf("%.2f", d);

    }
}
