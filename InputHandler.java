import java.util.ArrayList;

public class InputHandler {
    private ArrayList<Command> commands;

    public InputHandler(MilitaryCadence cadence) {
        commands = new ArrayList<Command>();
    }
    public boolean playCadence(int num) {
        if (num < 0 || num > 2) {
            return false;
        }
        else if (num = 0) {
            
        }
        return true;
    }
}
