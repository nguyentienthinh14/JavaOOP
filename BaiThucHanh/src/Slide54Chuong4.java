import java.util.HashSet;
import java.util.Scanner;

/**
 * Slide54Chuong4
 */
public class Slide54Chuong4 {

    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInt = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetInt.add(0);
        hashSetInt.add(3);
        hashSetInt.add(1);
        hashSetInt.add(4);
        hashSetInt.add(2);
        hashSetInt.add(8);

        System.out.println("cac phan tu trong hashSetInteger: ");
        System.out.println(hashSetInt);
        System.out.print("Nhap phan tu can them: ");
        number = sc.nextInt();

        if(!hashSetInt.contains(number)){
            hashSetInt.add(number);
            System.out.println("Them "+number+" thanh cong!");
            System.out.println("Cac phan tu tron hashSetInteger sau khi them: ");
            System.out.println(hashSetInt);
        } else {
            System.out.println("Them khong thanh cong!");
        }
    }
}