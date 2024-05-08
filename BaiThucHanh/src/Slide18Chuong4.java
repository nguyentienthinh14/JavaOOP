import java.util.ArrayList;

public class Slide18Chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();

        arrListInteger.add(8);
        arrListInteger.add(6);
        arrListInteger.add(14);
        arrListInteger.add(0);

        System.out.println("cac phan tu co trong arrListInteger la: ");
        for (int number : arrListInteger) {
            System.out.println(number + "\t");
        }
    }    
}
