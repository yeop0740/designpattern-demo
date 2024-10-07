package adapter.network;

public class VgaAdapter implements DisplayAdapter {
    private final Vga vga;
    private final boolean highQuality;

    public VgaAdapter(Vga vga, boolean highQuality) {
        this.vga = vga;
        this.highQuality = highQuality;
    }

    @Override
    public void display() {
        vga.connectWithVgaCable(highQuality);
    }
}
