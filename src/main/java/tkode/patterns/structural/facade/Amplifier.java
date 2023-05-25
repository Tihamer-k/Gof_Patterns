package tkode.patterns.structural.facade;

class Amplifier {
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }

    public void setVolume(int volume) {
        System.out.println("Setting amplifier volume to " + volume);
    }
}
