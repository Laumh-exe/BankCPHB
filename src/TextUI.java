import java.util.Scanner;

public class TextUI {

    private Scanner scanner;

    public TextUI() {
        scanner = new Scanner(System.in);
    }

    public String getInput(String msg) {
        System.out.println(msg);
        String input = scanner.nextLine();
        return input;
    }
}
