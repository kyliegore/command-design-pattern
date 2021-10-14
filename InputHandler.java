import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class InputHandler {
    private ArrayList<Command> commands;

    public InputHandler(MilitaryCadence cadence) {
        commands = new ArrayList<Command>();
        Command com0 = new IDontKnowCommand(cadence);
        commands.add(com0);
        Command com1 = new InArmyCommand(cadence);
        commands.add(com1);
        Command com2 = new EverywhereCommand(cadence);
        commands.add(com2);
    }
    public boolean playCadence(int num) {
        if (num < 0 || num > 2) {
            return false;
        }
        commands.get(num).execute();
        return true;
    }
}
