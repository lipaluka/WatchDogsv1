import com.ctos.profiler.generator.ProfileGenerator;
import com.ctos.profiler.model.Profile;

public class Main {
    public static void main(String[] args) {
        Profile profile = ProfileGenerator.generateProfile();
        System.out.println(profile);
    }
}