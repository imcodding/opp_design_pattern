package com.mia.oppproject.State;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mia.oppproject.BaseActivity;
import com.mia.oppproject.databinding.ActivityStateBinding;

public class StateActivity extends BaseActivity {

    ActivityStateBinding binding;
    ModeSwitch modeSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initListener();

        modeSwitch = new ModeStateLight();
    }

    public void initListener() {
        binding.modeSwitchBtn.setOnClickListener(v->{
            modeSwitch.toggle();
        });
    }

    public void setModeSwitch(ModeSwitch _modeSwitch) { modeSwitch = _modeSwitch; }

    class ModeStateLight implements ModeSwitch {

        @Override
        public void toggle() {
            showToast("FROM LIGHT TO DARK");
            setModeSwitch(new ModeStateDark());
        }
    }

    class ModeStateDark implements ModeSwitch {

        @Override
        public void toggle() {
            showToast("FROM DARK TO LIGHT");
            setModeSwitch(new ModeStateLight());
        }
    }
}