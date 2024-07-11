package bridge;

public class Tv implements Device {

    private int volume = 50;
    private int channel = 1;
    private boolean enabled = false;
    private boolean muted = false;
    private String imageSettings = "Standard";

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

    @Override
    public String toString() {
        return "TV{" +
                "volume=" + volume +
                ", channel=" + channel +
                ", enabled=" + enabled +
                ", muted=" + muted +
                ", imageSettings='" + imageSettings + '\'' +
                '}';
    }
}
