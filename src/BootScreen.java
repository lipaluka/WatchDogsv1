public class BootScreen {

    public static void show() {
        try {
            printLogo();
            printLine("Initializing profiler OS...");
            sleep(600);

            printLine("Loading core modules...");
            sleep(700);

            printLine("Establishing secure connection...");
            sleep(800);

            printLine("Syncing city surveillance network...");
            sleep(700);

            showProgressBar();

            printLine("\nSystem ready.");
            sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Boot sequence interrupted.");
        }
    }

    private static void printLogo() throws InterruptedException {
        System.out.println("""
                ================================
                  PROFILER OS v1.0
                  Central Surveillance System
                ================================
                """);
        sleep(800);
    }

    private static void showProgressBar() throws InterruptedException {
        System.out.print("\n[");
        for (int i = 0; i < 30; i++) {
            System.out.print("#");
            sleep(80);
        }
        System.out.println("] 100%");
    }

    private static void printLine(String text) {
        System.out.println("> " + text);
    }

    private static void sleep(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }
}

