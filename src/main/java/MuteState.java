public class MuteState implements IPossibleStates {
    private TV _tvContext;

    public MuteState(TV context){
        _tvContext = context;
        System.out.println("TV set on mutes");
    }


    @Override
    public void On(TV context) {
        System.out.println("Tv is on already");
    }

    @Override
    public void Off(TV context) {
        _tvContext.setCurrentState(new OffState(context));
    }

    @Override
    public void Mute(TV context) {
        System.out.println("Is already on mute");
    }
}
