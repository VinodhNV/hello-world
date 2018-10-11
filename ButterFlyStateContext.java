public class ButterFlyStateContext {

    private ButterFlyState currentState;

    public ButterFlyStateContext() {
        currentState = new Caterpillar();
    }

    public void perform(){
        currentState.perform(this);
    }

    public void metamorphosis(){
        currentState = new Butterfly();
    }

    public ButterFlyState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ButterFlyState currentState) {
        this.currentState = currentState;
    }
}
