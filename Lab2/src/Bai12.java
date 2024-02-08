import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int m = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int n = scanner.nextInt();
        int[][] matran = new int[m][n];
        System.out.println("Nhap du lieu cho ma tran:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap phan tu [" + (i + 1) + "," + (j + 1) + "]: ");
                matran[i][j] = scanner.nextInt();
            }
        }
        int max = matran[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matran[i][j] > max) {
                    max = matran[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat cua matran: " + max);
    }
    }
