public class EverywhereCommand implements Command{
    /**
     * The parameter cadence is the instance of Military Cadence which 
     * is eventually used to execute singEverywhereWeGo in the execute method
     */
    private MilitaryCadence cadence;
    /**
     * Below is the constructor for EverywhereCommand. It sets this.cadence equal to the
     * cadence entered into the constructor
     */
    public EverywhereCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    @Override
    public void execute() {
        cadence.singEverywhereWeGo();
    }
}
