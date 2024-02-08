import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String chuoi;
        System.out.print("Nhap chuoi bat ky: ");
        chuoi = Scanner.nextLine();
        int so = 0, chuhoa = 0, chuthuong = 0;
        for(int i=0; i< chuoi.length(); i++){
            if (chuoi.charAt(i)>=48 && chuoi.charAt(i)<=57) {
                ++so;
            }else if(chuoi.charAt(i)>=65 && chuoi.charAt(i)<=90){
                ++chuhoa;
            }else if (chuoi.charAt(i)>=97 && chuoi.charAt(i)<=122) {
                ++chuthuong;
            }else{
                System.out.println("Chuoi co chua ki tu khong hop le!");
            }
        }
        System.out.println("So ki tu so la: "+so);
        System.out.println("So ki tu chu hoa la: "+chuhoa);
        System.out.println("So ki tu chu thuong la: "+chuthuong);
    }

}
