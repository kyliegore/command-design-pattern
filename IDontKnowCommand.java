public class IDontKnowCommand implements Command {
    private MilitaryCadence cadence;
    
    public IDontKnowCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    @Override
    public void execute() {
        cadence.singIDontKnow();
    }
}
