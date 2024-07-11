package bridge;

public class Main {

    public static void main(String[] args) {

        Device tv = new Tv();
        Device radio = new Radio();
        Device dvdPlayer = new DvdPlayer();

        AdvancedRemote remote = new AdvancedRemote(tv);

        //TV REMOTE
        System.out.println(tv);
        remote.togglePower();
        remote.channelUp();
        remote.volumeDown();
        remote.mute();
        remote.volumeUp();
        System.out.println(tv);
        remote.togglePower();

        // RADIO REMOTE
        remote.setDevice(radio);
        System.out.println(radio);
        remote.togglePower();
        System.out.println(radio);
        remote.togglePower();

        // DVD REMOTE
        remote.setDevice(dvdPlayer);
        System.out.println(dvdPlayer);
        remote.togglePower();
        remote.volumeUp();
        remote.channelUp();
        remote.volumeUp();
        System.out.println(dvdPlayer);
        remote.togglePower();
    }
}

