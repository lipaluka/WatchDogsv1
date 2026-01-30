import java.util.Random;

public enum IncomeTier {

    LOW(28000, 45000),          // entry / physical / clerical
    MID(50000, 95000),          // stable professional
    HIGH(100000, 180000),       // high-skill / security / IT
    ELITE(200000, 450000);

    private final int min;
    private final int max;

    IncomeTier(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int generateIncome(Random random) {
        return random.nextInt(max - min + 1) + min;
    }
}
