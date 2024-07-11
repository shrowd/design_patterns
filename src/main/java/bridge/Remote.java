package bridge;

public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeUp() {
        int volume = device.getVolume();
        device.setVolume(volume + 1);
    }

    public void volumeDown() {
        int volume = device.getVolume();
        device.setVolume(volume - 1);
    }

    public void channelUp() {
        int channel = device.getChannel();
        device.setChannel(channel + 1);
    }

    public void channelDown() {
        int channel = device.getChannel();
        device.setChannel(channel - 1);
    }

    public void setDevice(Device newDevice) {
        device = newDevice;
    }

    protected Device getDevice() {
        return device;
    }
}
