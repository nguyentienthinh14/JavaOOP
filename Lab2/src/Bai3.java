import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();

        if( tuoi <16 ){
            System.out.println("Ban " +ten+ " o do tuoi vi thanh nien!");
        }else if( tuoi>=16 & tuoi<18){
            System.out.println("Ban " +ten+ " o do tuoi truong thanh!");
        }else if(tuoi>=18){
            System.out.println("Ban " +ten+ " da gia!");
        }
    }
}
