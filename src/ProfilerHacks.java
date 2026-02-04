public class ProfilerHacks {

    public static void textSpying(Profile profile) {
        System.out.println("\n[ ctOS PROFILER ACCESS ]");
        System.out.println("Target: " + profile.getName());

        simulateDelay();

        System.out.println("Intercepting text messages...");
        System.out.println("• Message content partially recovered");
        System.out.println("• Metadata logged");
    }

    private static void simulateDelay() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException ignored) {
        }
    }
}
