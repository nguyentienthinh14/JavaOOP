import java.util.LinkedHashSet;
import java.util.Scanner;

public class Slide60Chuong4 {
    public static void main(String[] args) {
        String Ten;
        LinkedHashSet<String> linkedHashSetStr = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        linkedHashSetStr.add("Thinh");
        linkedHashSetStr.add("Quan");
        linkedHashSetStr.add("Son");
        linkedHashSetStr.add("ABC");
        System.out.println("Phan tu trong linkerHashSetStr la: ");
        for (String str : linkedHashSetStr){
            System.out.println(str);
        }

        System.out.print("Nhap phan tu can xoa: ");
        Ten = sc.nextLine();

        if(linkedHashSetStr.contains(Ten)){
            linkedHashSetStr.remove(Ten);
            System.out.println("Xoa phan tu "+Ten+" thanh cong!");
            System.out.println("Cac phan tu sau khi xoa la: ");
            System.out.println(linkedHashSetStr);
        }else{
            System.out.println("Xoa khong thanh cong!");
        }
    }
}
