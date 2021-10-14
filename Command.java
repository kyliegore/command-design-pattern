/**
 * @author Anton, Christian, Kylie
 */
public interface Command {
    /**
     * the execute command, implemented by the separate command classes, will access the sing methods in MilitaryCadence
     * and allow the terminal to output the songs.
     */
    public void execute();
}
