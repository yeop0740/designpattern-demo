package state.videoPlayer;

public class VideoPlayer {
    private State state;

    public VideoPlayer() {
        this.state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        this.state.play(this);
    }

    public void stop() {
        this.state.stop(this);
    }
    /*
    public void playWithCondition() {
        if (state.equals("Stopped")) {
            System.out.println();
            state = "Playing";
        } else if (state.equals("Playing")) {
            System.out.println();
        } else if (state.equals("Paused")) {
            System.out.println("");
            state = "Playing";
        }
    }

    public void stopWithCondition() {
        if (state.equals("Playing")) {
            System.out.println();
            state = "Paused";
        } else if (state.equals("Paused")) {
            System.out.println();
            state = "Stopped";
        } else if (state.equals("Stopped")) {
            System.out.println();
        }
    }*/
}
