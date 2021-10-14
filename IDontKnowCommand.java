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
    /**
     * Below is the method implemented from the interface. The execute method calls
     * the sing i dont know which is found in the military cadence class.
     */
    @Override
    public void execute() {
        cadence.singIDontKnow();
    }
}
