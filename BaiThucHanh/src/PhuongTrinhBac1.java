import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        scanner.close();
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phuong trinh co vo so nghiem");
            } else {
                System.out.print("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.print("Nghiem cua phuong trinh la: x = " +x);
        }
        scanner.close();
    }
}
