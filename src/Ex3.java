import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human human = new Human();

        System.out.print("Введіть ім'я: ");
        human.name = sc.nextLine();
        System.out.print("Введіть прізвище: ");
        human.surname = sc.nextLine();
        System.out.print("Введіть вік: ");
        human.age = sc.nextInt();

        human.printInfo();
    }
}
