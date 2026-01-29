public class Main {
    public static void main(String[] args) {
        Profile profile = ProfileGenerator.generateProfile();
        ScanService.scan(profile);

    }
}