public class TV {
    private boolean _isOn;
    private int _volume;

    public TV() {

    }

    public void powerOn() {
        if (_isOn) {
            System.out.println("Is already on");
            return;
        }

        _isOn = true;
        System.out.println("Powered on the TV");
    }

    public void powerOff() {
        if (_isOn) {
            _isOn = false;
            System.out.println("Powered off the TV");
            return;
        }

        System.out.println("Is already off");
    }

    public void mute() {
        if (!_isOn) {
            System.out.println("Tv is off");
            return;
        }

        if (_volume == 0) {
            System.out.println("Is already on mute");
            return;
        }

        _volume = 0;
    }

    public void volumeUp() {
        if (!_isOn) {
            System.out.println("Tv is off");
            return;
        }

        if (_volume == 100) {
            System.out.println("TV is on max volume already");
            return;
        }

        _volume++;
    }

    public void volumeDown() {
        if (!_isOn) {
            System.out.println("Tv is off");
            return;
        }

        if (_volume == 0) {
            System.out.println("TV is on mute");
            return;
        }

        _volume--;
    }
}
