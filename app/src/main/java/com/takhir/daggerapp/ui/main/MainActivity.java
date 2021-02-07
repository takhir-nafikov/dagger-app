package com.takhir.daggerapp.ui.main;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.takhir.daggerapp.BaseActivity;
import com.takhir.daggerapp.R;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Created", Toast.LENGTH_SHORT).show();
    }
}
