public class OffState implements IPossibleStates {
    private TV _tvContext;
    public OffState(TV context)
    {
        _tvContext = context;
        System.out.println("Tv set off");
    }

    @Override
    public void On(TV context) {
        _tvContext.setCurrentState(new OnState(context));
    }

    @Override
    public void Off(TV context) {
        System.out.println("The TV is off already");
    }

    @Override
    public void Mute(TV context) {
        System.out.println("The tv is off and cannot be mutted");
    }
}
