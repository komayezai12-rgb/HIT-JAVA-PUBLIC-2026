import java.util.Scanner;
public class b2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap c: ");
        int c = scanner.nextInt();
        if( a+b>c || b+c>a || a+c>b){
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tam giac can");
            } else {
                System.out.println("Tam giac thuong");
            }
        }
        else {
            System.out.println("Khong phai tam giac");
        }
        double p;
        p = (a+b+c)/2;
        System.out.print("Chu vi: ");
        System.out.printf("%.2f", p*2);
        double s;
        s= Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println();
        System.out.print("Dien tich: ");
        System.out.printf("%.2f", s);
    }
}
