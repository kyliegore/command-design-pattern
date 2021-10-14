public class IDontKnowCommand implements Command {
    /**
     * The parameter cadence is the instance of Military Cadence which 
     * is eventually used to execute singIDontKnowCommand in the execute method
     */
    private MilitaryCadence cadence;
    /**
     * Below is the constructor for IDontKnowCommand. It sets this.cadence equal to the
     * cadence entered into the constructor
     */
    public IDontKnowCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    @Override
    public void execute() {
        cadence.singIDontKnow();
    }
}
