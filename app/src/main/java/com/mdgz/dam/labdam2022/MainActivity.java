package com.mdgz.dam.labdam2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;
import com.mdgz.dam.labdam2022.databinding.ActivityMainBinding;
import com.mdgz.dam.labdam2022.databinding.FragmentBusquedaBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MaterialToolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        toolbar = binding.materialToolbar;
        setSupportActionBar(toolbar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}