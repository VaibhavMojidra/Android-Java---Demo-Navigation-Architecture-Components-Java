package com.vaibhavmojidra.navigationarchitecturejava;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vaibhavmojidra.navigationarchitecturejava.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false);
        binding.terms.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_termsFragment));
        binding.signUp.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_nameFragment));
        return binding.getRoot();
    }
}