import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        BootScreen.show();

        boolean running = true;
        Profile activeProfile = null;

        while (running) {

            System.out.println("\n=== ctOS MAIN MENU ===");
            System.out.println("1) Profiler");
            System.out.println("2) System Hacks");
            System.out.println("q) Quit");

            System.out.print("> ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1" -> {
                    activeProfile = ProfileGenerator.generateProfile();
                    ScanService.scan(activeProfile);
                    profilerMenu(scanner, activeProfile);
                }

                case "2" -> {
                    systemHackMenu(scanner);
                }

                case "q", "Q" -> {
                    System.out.println("\nShutting down ctOS...");
                    running = false;
                }

                default -> System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }

    // ---------------- PROFILER MENU ----------------

    private static void profilerMenu(Scanner scanner, Profile profile) {

        boolean inProfiler = true;

        while (inProfiler) {

            System.out.println("\n--- PROFILER INTERFACE ---");
            System.out.println("textView");
            System.out.println("callIntercept");
            System.out.println("moneyWire");
            System.out.println("q) Exit Profiler");

            System.out.print("> ");
            String input = scanner.nextLine();

            switch (input) {

                case "System.app.textView" ->ProfilerHacks.textSpying(profile);
                case "System.app.callIntercept" ->ProfilerHacks.callInterception(profile);
                case "System.app.moneyWire"->ProfilerHacks.moneyWiring(profile);
                case "q", "Q" -> inProfiler = false;

                default -> System.out.println("Invalid profiler command.");
            }
        }
    }

    // ---------------- SYSTEM HACK MENU ----------------

    private static void systemHackMenu(Scanner scanner) throws InterruptedException {

        boolean inSystem = true;

        while (inSystem) {

            System.out.println("\n--- SYSTEM/TERMINAL ACCESS ---");
            System.out.println("cameraView");
            System.out.println("dataDownload");
            System.out.println("q) Exit System Access");

            System.out.print("> ");
            String input = scanner.nextLine();

            switch (input) {

                case "Terminal.access.cameraView" -> SystemHacks.cameraAccess();
                case "Terminal.access.dataDownload"->SystemHacks.dataDownload();

                case "q", "Q" -> inSystem = false;

                default -> System.out.println("Invalid system command.");
            }
        }
    }
}