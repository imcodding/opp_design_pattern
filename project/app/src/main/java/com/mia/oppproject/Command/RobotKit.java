package com.mia.oppproject.Command;

pubilc class RobotKit {
    private Robot robot = new Robot();
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command _command) {
        commands.add(_command);
    }

    public void start() {
        for(Command command : commands) {
            command.setRobot(robot);
            command.excute();
        }
    }
}
/*
RobotKit robotKit = new RobotKit();

robotKit.addCommand(new MoveForwardCommand(2));
robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
robotKit.addCommand(new MoveForwardCommand(1));
robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
robotKit.addCommand(new PickupCommand());

전략 패턴은 같은 일을 하되, 그 방식이 갈아끼워지는 것이라면
커맨드 패턴은 하늘 일 자체가 다른 것이라고 보면 된다.

모드 변경에 따라 명령을 갈아기우는 방식
스위치 처럼 꺼졌다 켜졌다 할 때마다 명령을 갈아끼우는 방식
여러 개의 명령을 목록으로 실어보내서 차례대로 실행되도록 하는 방식

 */