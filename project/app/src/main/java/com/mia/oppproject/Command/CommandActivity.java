package com.mia.oppproject.Command;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mia.oppproject.databinding.ActivityCommandBinding;


public class CommandActivity extends AppCompatActivity {

    ActivityCommandBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCommandBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RobotKit robotKit = new RobotKit();

        robotKit.addCommand(new MoveForwardCommand(2));
        robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
        robotKit.addCommand(new MoveForwardCommand(3));
        robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
        robotKit.addCommand(new MoveForwardCommand(1));
        robotKit.addCommand(new PickupCommand());

        robotKit.start();
    }
}