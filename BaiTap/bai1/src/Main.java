import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc 2 : ax2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị a:");
        double a = scanner.nextDouble();
                if(a==0){
                    System.out.println("không thể giải phương trình nếu a=o");
                    return;
                }
        System.out.println("nhap giá trị b");
                double b = scanner.nextDouble();
        System.out.println("nhap gia trị c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("delta ="+ quadraticEquation.getDelta());
        if (quadraticEquation.getDelta() == 0){
            System.out.println("phương trình có 1 nghiệm là " + quadraticEquation.motNghiem());
        }else if (quadraticEquation.getDelta()<0){
            System.out.println("phương trình vô nghiệm");
        }else if (quadraticEquation.getDelta()>0){
            System.out.println("phương trình có 2 nghiệm là: ");
            System.out.println("Nghiệm 1 la" + quadraticEquation.getRoo1()+ "\n Nghiệm 2 là : " +quadraticEquation.getRoot2() );
        }

    }

}