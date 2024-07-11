package bridge;

import java.util.List;

public class Radio implements Device {

    private int volume = 30;
    private double channel = 1;
    private boolean enabled = false;
    private boolean muted = false;
    private List<Double> savedFrequencies = List.of(105.2, 112.4, 102.5);

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
        return (int) channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "volume=" + volume +
                ", channel=" + channel +
                ", enabled=" + enabled +
                ", muted=" + muted +
                ", savedFrequencies=" + savedFrequencies +
                '}';
    }
}
