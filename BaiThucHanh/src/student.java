import java.util.Scanner;

public class student {
    public String name;
    public String ID, Class; 
    public float DiemA, DiemB, DiemC,TB;

void NhapThongTin(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten: ");
    name = sc.nextLine();

    System.out.print("Nhap MSV: ");
    ID = sc.nextLine();

    System.out.print("Nhap lop: ");
    Class = sc.nextLine();

    System.out.print("Nhap diem A: ");
    DiemA = sc.nextFloat();
    
    System.out.print("Nhap diem B: ");
    DiemB = sc.nextFloat();

    System.out.print("Nhap diem C: ");
    DiemC = sc.nextFloat();
    
}
public float TinhdiemTB() 
{
    TB = DiemA*0.6f + DiemB*0.3f +DiemC*0.1f;
    return TB;
}
void XuatThongTin(){
    System.out.println(ID+ "-" +name+ "-" +Class);
    System.out.println("Diem thanh phan:A= " +DiemA+ ";B=" +DiemB+ ";C=" +DiemC );
    System.out.println("Diem trung binh mon= "+TB);
}
}