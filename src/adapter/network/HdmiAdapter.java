package adapter.network;

public class HdmiAdapter implements DisplayAdapter {
    private final Hdmi hdmi;
    private final int resolution;

    public HdmiAdapter(Hdmi hdmi, int resolution) {
        this.hdmi = hdmi;
        this.resolution = resolution;
    }

    @Override
    public void display() {
        hdmi.connectWithHdmiCable(resolution);
    }
}
