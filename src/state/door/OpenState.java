package state.door;

public class OpenState implements State{
    @Override
    public void open(Door door) {
        System.out.println("Door is already Open.");
    }

    @Override
    public void close(Door door) {
        System.out.println("Door is now Closed.");
        door.setState(new ClosedState());
    }
}
