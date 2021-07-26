package com.mia.oppproject.Command;

import java.util.ArrayList;

public class RobotKit {
    private Robot robot = new Robot();
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command _command) {
        commands.add(_command);
    }

    public void start() {
        for(Command command : commands) {
            command.setRobot(robot);
            command.execute();
        }
    }
}
