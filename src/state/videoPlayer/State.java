package state.videoPlayer;

public interface State {
    void play(VideoPlayer player);
    void stop(VideoPlayer player);
}
