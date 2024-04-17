import java.util.Scanner;

public class Slide90Chuong2 {
    public static void main(String[] args) {
        String chuoi;
        char KyTu;
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        chuoi = Scanner.nextLine();
        System.out.println("cac ky tu co trong chuoi la: ");
        for (int i= 0; i < chuoi.length(); i++ ){
            KyTu = chuoi.charAt(i);
            System.out.println(KyTu);
        }
    }
}
