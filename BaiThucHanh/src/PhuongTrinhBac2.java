import java.util.Scanner;

public class PhuongTrinhBac2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap he so a:");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b:");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c:");
        double c = scanner.nextDouble();

        if(a == 0) {
            if(b == 0){
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co nghiem: x="+(-c/b) );
            } 
            return;}
            double delta=b*b-4*a*c; //tinh delta            
            double x1;
            double x2;

            if(delta == 0){
                x1=(-b/(2*a));
                System.out.println("Phuong trinh co nghiem kep: x1=x2"+x1);
            } else if( delta > 0){
                x1= ((-b + Math.sqrt(delta))/(2*a));
                x2= ((-b - Math.sqrt(delta))/(2*a));
                System.out.println("Phuong trinh co 2 nghiem: x1=" + x1 + "va x2=" +x2);
            } else{
                System.out.println("Phuong trinh vo nghiem!");
            }   

        }
    }
    
