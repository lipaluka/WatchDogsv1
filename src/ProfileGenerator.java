import java.util.List;
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
        int income = random.nextInt(80000) + 20000;
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
}