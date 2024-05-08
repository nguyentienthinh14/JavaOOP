import java.util.ArrayList;
import java.util.Iterator;

public class Slide19Chuong4 {
    public static void main(String[] args) {
    ArrayList<Float> arrListFloat = new ArrayList<>();

    arrListFloat.add(0.7f);
    arrListFloat.add(0.6f);
    arrListFloat.add(8.6f);
    arrListFloat.add(14.2f);

    Iterator<Float> iterator = arrListFloat.iterator();

    System.out.println("cac phan tu co trong arrListFloat la: ");
    while (iterator.hasNext()) {
        System.out.println(iterator.next() + "\t");
    }

    }
}
