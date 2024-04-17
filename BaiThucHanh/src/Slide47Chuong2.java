import java.util.Scanner;

public class Slide47Chuong2 {
    public static void main(String[] args) {
        int n , sum = 0 ;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Nhap vao so bat ky: ");
            n = sc.nextInt() ;
            sum = sum + n ;
        }while(sum <= 100) ;{
            System.out.println("Tong cac so vua nhap la: " +sum);
        }
    }
}

