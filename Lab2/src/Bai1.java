import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //nhap 2 so bat ky tu ban phim

        System.out.print("Nhap so thu nhat: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = scanner.nextDouble();
       
        //yeu cau 1: tinh tong hieu...
        double tong= a+b;
        double hieu= a-b;
        double tich= a*b;
        double thuong= a/b;
        double chiadu= a%b;
        
        //in ket qua
        System.out.println("Tong cua 2 so la: " +tong);
        System.out.println("Hieu cua 2 so la: " +hieu);
        System.out.println("Tich cua 2 so la: " +tich);
        if(b == 0){
            System.out.println("Khong the hien thi ket qua!");
        }else{         
        System.out.println("Thuong cua 2 so la: " +thuong);}
        if(b == 0){
            System.out.println("Khong the hien thi ket qua!");
                } else{
        System.out.println("Chia co du cua 2 so la: " +chiadu);
            }
       
        //yeu cau 2: so sanh 2 so
        if( a > b){
            System.out.println("So thu nhat lon hon so thu hai! ");
        } else if (a < b){
            System.out.println("So thu nhat nho hon so thu hai! ");
        }else if( a == b){
            System.out.println("So thu nhat bang so thu hai!");
        }
    }
}
