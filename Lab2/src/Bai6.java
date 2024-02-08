import java.util.Scanner;

public class Bai6 {
     public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n, giaithua=1;
      System.out.print("Nhap n = ");
      n = scanner.nextInt();
      for(int i=1;i<=n;i++)
      {
          giaithua *= i;
      }
      System.out.print("n! = "+n+"! = "+giaithua);
  }
 } 
