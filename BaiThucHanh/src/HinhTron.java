import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        InnerHinhTron ht = new HinhTron() . new InnerHinhTron();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
    }
    /**
     * InnerHinhTron
 
     */
    public class InnerHinhTron { 
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;
    
    void nhapBanKinh() {
        System.out.print("Nhap Ban Kinh cua hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r =sc.nextFloat();

    }
    void tinhChuVi() {
        cv = 2*PI*r;
    }
    void tinhDienTich(){
        dt= PI*r*r;
    }
    void inChuVi() {
        System.out.println("Chu vi Hinh Tron la: " +cv);
    }
    void inDienTich(){
        System.out.println("Dien tich hinh tron la: "+dt);
    }
    }
}
