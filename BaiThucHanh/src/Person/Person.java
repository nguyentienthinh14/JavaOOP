package Person;

import java.util.Scanner;

//cac thuoc tinh 
public class Person {
    public String FullName,Ten;
    public int Age;
    public String Address;
    

//cac phuong thuc 
    public void XuatTen(String n){
        Ten = n ;
        System.out.println("\n*** "+Ten+" ***");
    }
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        FullName =sc.nextLine();

        System.out.print("Dia Chi: ");
        Address=sc.nextLine();

        System.out.print("Nhap tuoi: ");
        Age=sc.nextInt();
    }

    public void XuatThongTin(){
        System.out.println("Ho va Ten: " +FullName);
        System.out.println("Dia Chi " +Address);
        System.out.println("Tuoi: "+Age);
    }
}