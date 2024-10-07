package adapter.network;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        Usb usb = new Usb();
        Hdmi hdmi = new Hdmi();
        Vga vga = new Vga();

        List<DisplayAdapter> adapters = new ArrayList<>();
        adapters.add(new UsbAdapter(usb, "Video Data"));
        adapters.add(new HdmiAdapter(hdmi, 1080));
        adapters.add(new VgaAdapter(vga, true));

        for (DisplayAdapter adapter : adapters) {
            adapter.display();
        }
    }
}
