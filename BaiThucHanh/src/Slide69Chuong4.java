import java.util.Scanner;
import java.util.TreeSet;

public class Slide69Chuong4 {
    public static void main(String[] args) {
    int number;
    TreeSet<Integer> treeSetInt = new TreeSet<>();
    Scanner sc = new Scanner(System.in);

    treeSetInt.add(0);
    treeSetInt.add(3);
    treeSetInt.add(5);
    treeSetInt.add(9);
    treeSetInt.add(7);
    treeSetInt.add(8);

    System.out.println("Cac phan tu trong TreeSetInt la: ");
    System.out.println(treeSetInt);
    System.out.print("Nhap phan tu can them: ");
    number = sc.nextInt();
    
    if(!treeSetInt.contains(number)){
        treeSetInt.add(number);
        System.out.println("Them "+number+" thanh cong!");
        System.out.println("Cac phan tu sau khi them: ");
        System.out.println(treeSetInt);
    }else{
         System.out.println("Phan tu "+number+" da ton tai!");
    }
    }
}
