public class Profile {

    private String name;
    private int age;
    private String occupation;
    private int income;
    private String hobby;
    private String riskLevel;
    private String secret;

    public Profile(String name,
                   int age,
                   String occupation,
                   int income,
                   String hobby,
                   String riskLevel,
                   String secret) {

        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.income = income;
        this.hobby = hobby;
        this.riskLevel = riskLevel;
        this.secret = secret;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getIncome() {
        return income;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public String getSecret() {
        return secret;
    }

    @Override
    public String toString() {
        return "PROFILE SCAN RESULT\n" +
                "-------------------\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Occupation: " + occupation + "\n" +
                "Income: $" + income + "\n" +
                "Hobby: " + hobby + "\n" +
                "Risk Level: " + riskLevel + "\n" +
                "Hidden Detail: " + secret;
    }
}