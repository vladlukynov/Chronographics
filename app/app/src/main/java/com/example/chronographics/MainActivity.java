package com.example.chronographics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.main_activity_container);
        if (fragment == null) {
            fragment = new AllDoneFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_activity_container, fragment)
                    .commit();
        }
    }
}
