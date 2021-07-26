package com.mia.oppproject.Command;

abstract class Command {
    protected Robot robot;

    public void setRobot(Robot _robot) {
        this.robot = _robot;
    }

    public abstract void excute();
}

class MoveForwardCommand extends Command {
    int space;
    public MoveForwardCommand(int _space) {
        this.space = _space;
    }
    public void excute() {
        robot.moveForward(space)
    }
}

class TurnCommand extends Command {
    Robot.Direction direction;
    public TurnCommand(int _direction) {
        this.direction = _direction;
    }
    public void excute() {
        robot.turn(direction);
    }
}

class PickupCommand extends Command {
    public void excute() {
        robot.pickup();
    }
}
