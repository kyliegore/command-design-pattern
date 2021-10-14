import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class InputHandler {
    private ArrayList<Command> commands;
    /**
     * The InputHandler Constructor initializes the array list of commands and creates new instances of the command classes. Then, the classes
     * are added to the array list.
     */
    public InputHandler(MilitaryCadence cadence) {
        commands = new ArrayList<Command>();
        Command com0 = new IDontKnowCommand(cadence);
        commands.add(com0);
        Command com1 = new InArmyCommand(cadence);
        commands.add(com1);
        Command com2 = new EverywhereCommand(cadence);
        commands.add(com2);
    }
    /**
     * PlayCadence takes in the user's inputted number as a parameter. If the number is valid, it will get the index of the array list of commands the number corresponds to and plays the song.
     * @param num the number of cadence that you want to play
     * @return false if the number is invalid, true if the number is valid
     */
    public boolean playCadence(int num) {
        if (num < 0 || num > 2) {
            return false;
        }
        commands.get(num).execute();
        return true;
    }
}
