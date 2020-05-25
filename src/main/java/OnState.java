public class OnState implements IPossibleStates {
    private TV _tvContext;
    public OnState(TV tvContext)
    {
        _tvContext=tvContext;
        System.out.println("TV is on now");
    }

    @Override
    public void On(TV context) {
        System.out.println("The TV is already on");
    }

    @Override
    public void Off(TV context) {
        _tvContext.setCurrentState(new OffState(context));
    }

    @Override
    public void Mute(TV context) {
        _tvContext.setCurrentState(new MuteState(context));
    }
}
