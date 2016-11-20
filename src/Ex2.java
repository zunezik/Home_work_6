import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Висота: ");
        rectangle.height = sc.nextDouble();
        System.out.print("Ширина: ");
        rectangle.width = sc.nextDouble();

        System.out.println(rectangle.getArea());
    }
}
