import java.util.Random;

public class ProfileGenerator {

    private static final Random random = new Random();

    private static final String[] NAMES = {
            "Alex Moreno",
            "Jordan Blake",
            "Maya Chen",
            "Liam Novak",
            "Sofia Alvarez",
            "Ethan Brooks"
    };

    private static final String[] OCCUPATIONS = {
            "Freelance IT Technician",
            "Bike Courier",
            "Private Security Contractor",
            "Data Analyst",
            "Drone Repair Specialist",
            "Night Shift Warehouse Worker"
    };

    private static final String[] HOBBIES = {
            "Urban Exploration",
            "Lockpicking",
            "Street Photography",
            "Online Gaming",
            "DIY Electronics",
            "Fitness Training"
    };

    private static final String[] SECRETS = {
            "Under investigation for data fraud",
            "Owes money to a local fixer",
            "Uses fake identity online",
            "Former gang affiliate",
            "Blackmailed by unknown party",
            "No criminal record detected"
    };

    private static final String[] RISK_LEVELS = {
            "LOW",
            "MEDIUM",
            "HIGH",
            "CRITICAL"
    };

    public static Profile generateProfile() {
        String name = getRandomElement(NAMES);
        int age = random.nextInt(43) + 18; // 18–60
        String occupation = getRandomElement(OCCUPATIONS);
        int income = random.nextInt(80000) + 20000; // 20k–100k
        String hobby = getRandomElement(HOBBIES);
        String secret = getRandomElement(SECRETS);
        String riskLevel = getRandomElement(RISK_LEVELS);

        return new Profile(
                name,
                age,
                occupation,
                income,
                hobby,
                riskLevel,
                secret
        );
    }

    private static String getRandomElement(String[] array) {
        return array[random.nextInt(array.length)];
    }
}