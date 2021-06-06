package com.vaibhavmojidra.navigationarchitecturejava;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vaibhavmojidra.navigationarchitecturejava.databinding.FragmentMainScreenBinding;


public class MainScreen extends Fragment {
    private FragmentMainScreenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_main_screen, container, false);
        Bundle b=getArguments();
        binding.name.setText(b.getString("name"));
        binding.mainScreenTerms.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_mainScreen_to_termsFragment));
        binding.mainHomeBtn.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_mainScreen_to_homeFragment));
        return binding.getRoot();
    }
}