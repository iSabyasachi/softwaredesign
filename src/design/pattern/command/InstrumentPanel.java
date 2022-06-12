package design.pattern.command;

public class InstrumentPanel {
	// Only two commands for now
    Command[] commands = new Command[2];

    public InstrumentPanel() {

    }
    
    public void setCommand(int i, Command command) {
        commands[i] = command;
    }
    
    public void lowerLandingGear() {
        // Assuming that the client correctly sets the first
        // index to be the landing gear lower command
        commands[0].execute();
    }

    public void retractLandingGear() {
        commands[1].execute();
    }
}
