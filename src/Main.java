import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BootScreen.show();
        System.out.println("=== PROFILER SYSTEM ONLINE ===");

        while (true) {

            System.out.println("\nPress ENTER to scan next target");
            System.out.println("Type 'q' and press ENTER to quit");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("\nShutting down profiler system...");
                break;
            }

            Profile profile = ProfileGenerator.generateProfile();
            ScanService.scan(profile);
        }

        scanner.close();
    }
}
