package com.example.guest.myapplication;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.moodDialogButton)
    Button moodDialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        moodDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                MoodDialogFragment moodDialogFragment = new MoodDialogFragment();
                moodDialogFragment.show(fm, "Sample Fragment");
            }


        });

    }

}
