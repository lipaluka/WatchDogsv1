import java.util.concurrent.ThreadLocalRandom;

public class SystemHacks {

    public static void cameraAccess() {

        System.out.println("\n[ ctOS SYSTEM ACCESS ]");
        System.out.println("Node detected: City Surveillance Network");

        simulateDelay();

        System.out.println("Establishing encrypted uplink...");
        simulateDelay();

        System.out.println("Accessing available camera feeds:");
        System.out.println("• Traffic Intersection Camera — ONLINE");
        System.out.println("• Retail Store Security Cam — ONLINE");
        System.out.println("• Residential Building Camera — LIMITED");

        simulateDelay();

        System.out.println("\nFeed status: LIVE");
        System.out.println("Trace level: LOW");
    }
    public static void dataDownload() throws InterruptedException {
        System.out.println("Device storage detected...");
        simulateDelay();
        int dataSize = ThreadLocalRandom.current().nextInt(1, 100);
        System.out.println("Calculated estimate: "+dataSize+"GB");
        System.out.println("Download initiated est. 20Gbps");
        if(dataSize<=20){
            Thread.sleep(1500);

        }
        else if(dataSize>20&&dataSize<=40){
            Thread.sleep(3000);
        }
        else if(dataSize>40&&dataSize<=60){
            Thread.sleep(4500);
        }
        else if(dataSize>60&&dataSize<=80){
            Thread.sleep(6000);
        }
        else if(dataSize>80&&dataSize<=100){
            Thread.sleep(7500);
        }
        else{
            System.out.println("There has been an issue...");
        }
        if(dataSize>=1&&dataSize<=100){
            System.out.println("Download complete");
        }

    }

    private static void simulateDelay() {
        try {
            Thread.sleep(900);
        } catch (InterruptedException ignored) {
        }
    }
}