
import java.util.concurrent.TimeUnit;

public class InputHandler {
    private Command[] commands;

    public InputHandler(MilitaryCadence cadence) {
        commands = new Command[3];
    }
    public boolean playCadence(int num) {
        if (num < 0 || num > 2) {
            
            commands[num].execute();
        }
        else if (num = 0) {
            
        }
        return true;
    }
}
