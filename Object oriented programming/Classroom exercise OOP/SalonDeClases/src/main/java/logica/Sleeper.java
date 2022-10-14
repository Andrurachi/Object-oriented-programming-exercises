package logica;

public interface Sleeper {
    public static void waitXSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds * 100));
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
