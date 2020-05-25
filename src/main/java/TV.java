public class TV {
    private boolean _isOn;
    private int _volume=1;
    private IPossibleStates _currentState;

    public IPossibleStates getCurrentState(){
        return _currentState;
    }

    public void setCurrentState(IPossibleStates newState){
        _currentState = newState;
    }

    public TV() {
        _currentState = new OffState(this);
    }

    public void powerOn() {
        _currentState.On(this);
    }

    public void powerOff() {
        _currentState.Off(this);
    }

    public void mute() {
        _currentState.Mute(this);
    }

    /*public void volumeUp() {
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
    }*/
}
