public class ScanService {
    public static void scan(Profile profile){
        try{
            printWithDelay(">> INITIATING SCAN...", 800);
            printWithDelay(">> BYPASSING SECURITY...", 2000);
            printWithDelay(">> ACCESS GRANTED\n", 3700);

            printWithDelay("Name: " + profile.getName(), 700);
            printWithDelay("Age: " + profile.getAge(), 600);
            printWithDelay("Occupation: " + profile.getOccupation(), 800);
            printWithDelay("Income: $" + profile.getIncome(), 600);
            printWithDelay("Hobby: " + profile.getHobby(), 700);

            printWithDelay(
                    "Risk Level: " + getColoredRisk(profile.getRiskLevel()),
                    1900
            );

            printWithDelay("\n⚠ HIDDEN DETAIL DETECTED ⚠", 1000);
            printWithDelay(profile.getSecret(), 1200);

            printWithDelay("\n>> SCAN COMPLETE", 500);

        }catch(InterruptedException e){
            System.out.println("Scan interrupted");
        }
    }
    private static void printWithDelay(String text, int delay) throws InterruptedException {
        System.out.println(text);
        Thread.sleep(delay);
    }
    private static String getColoredRisk(String riskLevel) {
        return switch (riskLevel) {
            case "LOW" -> AnsiColor.GREEN + riskLevel + AnsiColor.RESET;
            case "MEDIUM" -> AnsiColor.YELLOW + riskLevel + AnsiColor.RESET;
            case "HIGH" -> AnsiColor.ORANGE + riskLevel + AnsiColor.RESET;
            case "CRITICAL" -> AnsiColor.RED + riskLevel + AnsiColor.RESET;
            default -> riskLevel;
        };
    }
}
