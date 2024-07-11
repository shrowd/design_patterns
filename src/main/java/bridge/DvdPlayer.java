package bridge;

public class DvdPlayer implements Device {

    private int volume = 40;
    private int channel = 1;
    private boolean enabled = false;
    private String currentMovie = "No movie";

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    public String getCurrentMovie() {
        return currentMovie;
    }

    @Override
    public String toString() {
        return "DVDPlayer{" +
                "volume=" + volume +
                ", channel=" + channel +
                ", enabled=" + enabled +
                ", currentMovie='" + currentMovie + '\'' +
                '}';
    }

}
