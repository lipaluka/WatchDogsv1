import java.util.List;
import java.util.Map;
import java.util.Random;

public class ProfileGenerator {

    private static final Random random = new Random();

    private static final List<String> NAMES =
            DataLoader.loadLines("C:\\Users\\PC6\\IdeaProjects\\ctOS app\\src\\names.txt");

    private static final List<String> OCCUPATIONS =
            DataLoader.loadLines("C:\\Users\\PC6\\IdeaProjects\\ctOS app\\src\\occupations.txt");

    private static final List<String> HOBBIES =
            DataLoader.loadLines("C:\\Users\\PC6\\IdeaProjects\\ctOS app\\src\\hobbies.txt");

    private static final List<String> SECRETS =
            DataLoader.loadLines("C:\\Users\\PC6\\IdeaProjects\\ctOS app\\src\\secrets.txt");

    private static final String[] RISK_LEVELS = {
            "LOW",
            "MEDIUM",
            "HIGH",
            "CRITICAL"
    };

    public static Profile generateProfile() {

        String name = getRandomElement(NAMES);
        int age = random.nextInt(43) + 18;
        String occupation = getRandomElement(OCCUPATIONS);
        int income = generateIncome(occupation);
        String hobby = getRandomElement(HOBBIES);
        String secret = getRandomElement(SECRETS);

        Profile profile = new Profile(
                name,
                age,
                occupation,
                income,
                hobby,
                "",        // temporary empty risk level
                secret
        );

        String riskLevel = RiskCalculator.calculateRisk(profile);

        profile.setRiskLevel(riskLevel);

        return profile;
    }

    private static String getRandomElement(List<String> list) {
        return list.get(random.nextInt(list.size()));
    }
    private static final Map<String, IncomeTier> JOB_INCOME_MAP = new java.util.HashMap<>();

    static {
        // LOW income
        JOB_INCOME_MAP.put("Bike Courier", IncomeTier.LOW);
        JOB_INCOME_MAP.put("Night Shift Warehouse Worker", IncomeTier.LOW);
        JOB_INCOME_MAP.put("Parking Enforcement Officer", IncomeTier.LOW);
        JOB_INCOME_MAP.put("Data Entry Clerk", IncomeTier.LOW);
        JOB_INCOME_MAP.put("Call Center Quality Monitor", IncomeTier.LOW);
        JOB_INCOME_MAP.put("Municipal Records Clerk", IncomeTier.LOW);
        JOB_INCOME_MAP.put("Environmental Data Collector", IncomeTier.LOW);

        // MID income
        JOB_INCOME_MAP.put("Freelance IT Technician", IncomeTier.MID);
        JOB_INCOME_MAP.put("Network Maintenance Worker", IncomeTier.MID);
        JOB_INCOME_MAP.put("City Infrastructure Analyst", IncomeTier.MID);
        JOB_INCOME_MAP.put("Junior Software Tester", IncomeTier.MID);
        JOB_INCOME_MAP.put("Public Transit Supervisor", IncomeTier.MID);
        JOB_INCOME_MAP.put("Insurance Claims Adjuster", IncomeTier.MID);
        JOB_INCOME_MAP.put("Telecommunications Installer", IncomeTier.MID);
        JOB_INCOME_MAP.put("Traffic Systems Operator", IncomeTier.MID);
        JOB_INCOME_MAP.put("Utility Grid Inspector", IncomeTier.MID);
        JOB_INCOME_MAP.put("Corporate Compliance Assistant", IncomeTier.MID);
        JOB_INCOME_MAP.put("Digital Marketing Analyst", IncomeTier.MID);
        JOB_INCOME_MAP.put("HR Background Screener", IncomeTier.MID);
        JOB_INCOME_MAP.put("Logistics Coordination Officer", IncomeTier.MID);
        JOB_INCOME_MAP.put("Urban Planning Assistant", IncomeTier.MID);
        JOB_INCOME_MAP.put("Behavioral Research Assistant", IncomeTier.MID);
        JOB_INCOME_MAP.put("Warehouse Operations Analyst", IncomeTier.MID);
        JOB_INCOME_MAP.put("Public Safety Dispatcher", IncomeTier.MID);
        JOB_INCOME_MAP.put("Social Media Trend Analyst", IncomeTier.MID);
        JOB_INCOME_MAP.put("Private Investigation Assistant", IncomeTier.MID);

        // HIGH income
        JOB_INCOME_MAP.put("Private Security Contractor", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Data Analyst", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Drone Repair Specialist", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Surveillance Camera Technician", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Retail Loss Prevention Agent", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Drone Operations Technician", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Cybersecurity Intern", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Vehicle Telemetry Analyst", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Contract Risk Assessor", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Digital Forensics Technician", IncomeTier.HIGH);
        JOB_INCOME_MAP.put("Smart Home Systems Integrator", IncomeTier.HIGH);

        // ELITE income
        JOB_INCOME_MAP.put("Smart City Systems Engineer", IncomeTier.ELITE);
        JOB_INCOME_MAP.put("Infrastructure Procurement Agent", IncomeTier.ELITE);

    }
    private static int generateIncome(String job) {
        IncomeTier tier = JOB_INCOME_MAP.getOrDefault(job, IncomeTier.MID);
        return tier.generateIncome(random);
    }
}