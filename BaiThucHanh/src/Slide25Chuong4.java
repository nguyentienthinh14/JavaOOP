import java.util.ArrayList;
import java.util.Scanner;

public class Slide25Chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();
        for ( int i=0 ; i<n ; i++){
            System.out.print("Nhap phan tu thu " +i+ ": ");
            number = sc.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);

        for (int i =1; i<arrListInteger.size(); i++){
            if(arrListInteger.get(i).compareTo(max)>0){
                max = arrListInteger.get(i);
            }
        }
        System.out.println("phan tu lon nhat tron arrListInteger = " + max);
    }
}
