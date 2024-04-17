package GEvaSE;

/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {
        //**day la main cua HinhTron.java
        HinhTron ht = new HinhTron();
        ht.setR(10);

        float ChuVi=ht.tinhCV();
        float DienTich=ht.tinhDT();
        System.out.println("----HinhTron----");
        System.out.println("-Chu vi hinh tron= " +ChuVi+ "\n-Dien tich hinh tron= " +DienTich);

        //**day la main cua SinhVien.java
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        //Set thong tin sinh vien
        sv1.setTen(""); 
        sv1.setTuoi(23);

        sv2.setTen("Thinh");
        sv2.setTuoi(20);

        //in thong tin sinh vien
        System.out.println("\n----SinhVien----");
        System.out.println("-Ten sinh vien 1= " +sv1.getTen()+" "+ sv1.getTuoi()+" Tuoi!");
        System.out.println("-Ten sinh vien 2= " +sv2.getTen()+" "+ sv2.getTuoi()+" Tuoi!");

        //**Day la main cua ToaDo.java
        ToaDo A = new ToaDo();
        //set toa do
        A.setX(6);
        A.setY(8);

        //in toa do 
        System.out.println("\n----ToaDo----");
        System.out.println("-Toa do diem A= ("+A.getX()+";"+A.getY()+")");
    }
}