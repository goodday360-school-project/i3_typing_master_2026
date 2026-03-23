import java.util.Scanner;

public class welcome_menu_screen {
    public static void main(String[] args) {
        System.out.println("------------- Welcome to I3 Typing Master v2026 -------------");
        System.out.println("To begin, please select one of the following options:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Typing Test");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Choose an option: - ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            System.out.println("Not Implemented yet.");
        }
    }
}
