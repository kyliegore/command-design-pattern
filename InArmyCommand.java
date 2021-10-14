/**
 * @author Christian Rios, Anton Aarnink, Jack Hempstead, Kylie Gore
 */
public class InArmyCommand implements Command {
    /**
     * The parameter cadence is the instance of Military Cadence which 
     * is eventually used to execute singInArmy in the execute method
     */
    private MilitaryCadence cadence;
    /**
     * Below is the constructor for InArmyCommand. It sets this.cadence equal to 
     * the cadence entered into the constructor
     */
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    /**
     * Below is the method implemented from the interface. The execute method calls
     * the sing in army which is found in the military cadence class.
     */
    @Override
    public void execute() {
        cadence.singInArmy();
    }
}
