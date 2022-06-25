package com.example.bottomnavigationbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.bottomnavigationbar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    private NavHostFragment navHostFragment;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        startNavigation();
    }

    private void startNavigation(){
        navHostFragment=(NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragContainer);
        navController=navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController);
    }
}