import java.util.Scanner;

public class Slide30Chuong2 {
    public static void main(String[] args) {
        int n, SoDu, Tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        while (n>0) {
            SoDu= n%10 ;
            n= n/10 ;
            Tong +=SoDu;
        }
        System.out.println("Tong cac so trong n=" +Tong);
    }
}
