package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        Ten= "Hinh Vuong";
    }
    public void NhapCanhHV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Canh HV= ");
        Dai= Rong= sc.nextFloat();
    }
}
