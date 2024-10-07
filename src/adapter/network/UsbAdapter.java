package adapter.network;

public class UsbAdapter implements DisplayAdapter {
    private final Usb usb;
    private final String data;

    public UsbAdapter(Usb usb, String data) {
        this.usb = usb;
        this.data = data;
    }

    @Override
    public void display() {
        usb.connectWithUsbCable(data);
    }
}
