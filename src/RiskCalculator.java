public class RiskCalculator {

    public static String calculateRisk(Profile profile) {
        int riskScore = 0;

        String occupation = profile.getOccupation().toLowerCase();
        if (occupation.contains("security")) {
            riskScore += 2;
        }
        if (occupation.contains("data") || occupation.contains("it")) {
            riskScore += 1;
        }
        String hobby = profile.getHobby().toLowerCase();
        if(hobby.contains("lockpicking")){
            riskScore +=2;
        }

        String secret = profile.getSecret().toLowerCase();
        if (secret.contains("investigation")) {
            riskScore += 3;
        }
        if (secret.contains("gang")) {
            riskScore += 3;
        }
        if (secret.contains("blackmail")) {
            riskScore += 2;
        }
        if (secret.contains("fake")) {
            riskScore += 2;
        }
        if (secret.contains("fraud")) {
            riskScore += 2;
        }
        if(secret.contains("restricted")){
            riskScore += 1;
        }
        if(secret.contains("bypassed")){
            riskScore += 2;
        }

        return mapScoreToRiskLevel(riskScore);
    }

    private static String mapScoreToRiskLevel(int score) {
        if (score >= 7) {
            return "CRITICAL";
        } else if (score >= 5) {
            return "HIGH";
        } else if (score >= 3) {
            return "MEDIUM";
        } else {
            return "LOW";
        }
    }
}
