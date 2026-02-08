public class ProfilerHacks {

    public static void textSpying(Profile profile) {
        System.out.println("\n[ ctOS PROFILER ACCESS ]");
        System.out.println("Target: " + profile.getName());

        simulateDelay();

        System.out.println("Intercepting text messages...");
        simulateDelay();
        System.out.println("• Message content partially recovered");
        simulateDelay();
        System.out.println("• Metadata logged");
    }
    public static void callInterception(Profile profile){
        System.out.println("\n[ ctOS PROFILER ACCESS ]");
        System.out.println("Target: " + profile.getName());

        simulateDelay();

        System.out.println("Intercepting call...");
        simulateDelay();
        System.out.println("Call audio intercepted");
        simulateDelay();
        System.out.println("Call log recovered");
    }
    public static void moneyWiring(Profile profile){
        System.out.println("\n[ ctOS PROFILER ACCESS ]");
        System.out.println("Target: " + profile.getName());

        simulateDelay();

        System.out.println("Bank account accessed");
        simulateDelay();
        System.out.println("Wiring money into crypto account");
        simulateDelay();
        System.out.println("Crypto added to wallet");

    }

    private static void simulateDelay() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException ignored) {
        }
    }
}
