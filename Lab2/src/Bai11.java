import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap so luong phan tu: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Nhap du lieu mang:");
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Mang ban dau:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nMang da sap xep:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
