package adapter.network;

// Adaptee
public class Vga {
    void connectWithVgaCable(boolean highQuality) {
        System.out.println("Displaying via VGA with high quality: " + highQuality);
    }
}
