public class InArmyCommand implements Command {
    /**
     * The parameter cadence is the instance of Military Cadence which 
     * is eventually used to execute singInArmy in the execute method
     */
    private MilitaryCadence cadence;
    /**
     * Below is the constructor for InArmyCommand. It sets this.cadence equal to the
     * cadence entered into the constructor
     */
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    /**
     * Below is the method implemented from the interface. 
     */
    @Override
    public void execute() {
        cadence.singInArmy();
    }
}
