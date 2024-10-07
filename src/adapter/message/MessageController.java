package adapter.message;

public class MessageController {
    public static void main(String[] args) {
        OldMessageSender oldSystem = new OldMessageSystem();
        ModernMessageSender adapter = new MessageAdapter(oldSystem);

        adapter.sendMessage("Hello, World!", "john@example.com");
    }
}
