import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int n, sum = 0;
        String strResult = "";
        Scanner sc = new Scanner(System.in);
        while (sum <=100){
            System.out.print("Nhap vao so nguyen n: ");
            n = sc.nextInt();
            sum +=n;
            strResult = strResult + n +" + ";
        }
        System.out.println(strResult.substring(0,strResult.length()-2)+" = "+sum);

    }
    
}