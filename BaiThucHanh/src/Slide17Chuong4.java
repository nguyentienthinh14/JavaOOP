import java.util.ArrayList;

public class Slide17Chuong4 {
    public static void main(String[] args) {
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("Thinh");
        arrListString.add("Tien");
        arrListString.add("Nguyen");
        arrListString.add("Dunw");

        System.out.println("Cac phan tu trong arrListString la:");
        for (int i = 0; i<arrListString.size();i++){
            System.out.println(arrListString.get(i)+ "\t");
        }
    }
}
