import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.print("Phan tu thu "+(i+1)+ " la: ");
            number = sc.nextInt();
            arrListInteger.add(number);
        }
        System.out.println("Cac phan tu la: ");
        System.out.println(arrListInteger);

        //tim max 
        int max = arrListInteger.get(0);

        for (int i=1; i< arrListInteger.size(); i++){
            if(arrListInteger.get(i).compareTo(max)>0){
                max = arrListInteger.get(i);
            }
        }
        System.out.println("max= "+max);

        //xoa phan tu
        System.out.print("Nhap phan tu can xoa: ");
        int m = sc.nextInt();
        if(arrListInteger.contains(m)){
            for(int i = 0 ; i < arrListInteger.size() ; i++){
                if (m == arrListInteger.get(i)) {
                    arrListInteger.remove(i) ;
                }
            }
            System.out.println("So phan tu con lai trong mang la: ");
            System.out.println(arrListInteger);
        }
        else{
            System.out.println("Xoa khong thanh cong! ");
        }

        //sap xep
        System.out.println("ArrayList sau khi sap xep: ");
        arrListInteger.sort((o1,o2)-> o2-o1);
        System.out.println(arrListInteger);
   }
}