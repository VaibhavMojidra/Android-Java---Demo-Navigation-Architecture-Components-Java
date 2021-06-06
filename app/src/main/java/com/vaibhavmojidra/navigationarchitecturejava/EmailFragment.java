package com.vaibhavmojidra.navigationarchitecturejava;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.vaibhavmojidra.navigationarchitecturejava.databinding.FragmentEmailBinding;

public class EmailFragment extends Fragment {

    private FragmentEmailBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_email, container, false);
        binding.submit.setOnClickListener(v -> {
            String email=binding.emailTextBox.getText().toString();
            if(!TextUtils.isEmpty(email)){
                Bundle bundle =getArguments();
                bundle.putString("email", email);
                Navigation.findNavController(v).navigate(R.id.action_emailFragment_to_mainScreen,bundle);
            }else{
                Toast.makeText(getActivity(), "Please enter email", Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}