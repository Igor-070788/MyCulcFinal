import java.util.Scanner;

class MyInputConsole implements MyInput {
    private Scanner scanner = new Scanner(System.in);
    private String dataInput(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }
    public String input() {
        return dataInput("Input: ");
    }
    public void output(String out) {
        System.out.println("Output: " + '\n' + out + '\n' + "--------");
    }
}
