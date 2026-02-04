public class SystemHacks {

    public static void cameraAccess() {

        System.out.println("\n[ ctOS SYSTEM ACCESS ]");
        System.out.println("Node detected: City Surveillance Network");

        simulateDelay();

        System.out.println("Establishing encrypted uplink...");
        simulateDelay();

        System.out.println("Accessing available camera feeds:");
        System.out.println("• Traffic Intersection Camera — ONLINE");
        System.out.println("• Retail Store Security Cam — ONLINE");
        System.out.println("• Residential Building Camera — LIMITED");

        simulateDelay();

        System.out.println("\nFeed status: LIVE");
        System.out.println("Trace level: LOW");
    }

    private static void simulateDelay() {
        try {
            Thread.sleep(900);
        } catch (InterruptedException ignored) {
        }
    }
}