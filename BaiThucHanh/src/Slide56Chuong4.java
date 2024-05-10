import java.util.HashSet;
import java.util.Scanner;

public class Slide56Chuong4 {
    public static void main(String[] args) {
        String name;
        HashSet <String> hashSetStr = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetStr.add("Dinh Quan");
        hashSetStr.add("Hoang Son");
        hashSetStr.add("Tien Thinh");
        hashSetStr.add("Tien Thinh");
        hashSetStr.add("Van A");
        hashSetStr.add("Van B");

        System.out.println("Cac phan tu trong hashSetStr la: ");
        System.out.println(hashSetStr);
        System.out.print("Phan tu can xoa: ");
        name = sc.nextLine();

        if(hashSetStr.contains(name)){
            hashSetStr.remove(name);
            System.out.println("Xoa phan tu "+name+" thanh cong!");
            System.out.println("Cac phan tu trong hashSetStr sau khi xoa la: ");
            System.out.println(hashSetStr);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }

    }
}
