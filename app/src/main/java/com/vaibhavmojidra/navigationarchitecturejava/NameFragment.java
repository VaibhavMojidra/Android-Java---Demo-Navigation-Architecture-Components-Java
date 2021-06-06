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

import com.vaibhavmojidra.navigationarchitecturejava.databinding.FragmentNameBinding;


public class NameFragment extends Fragment {

    private FragmentNameBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_name, container, false);
        binding.nextBtn.setOnClickListener(v -> {
            String name=binding.nameTextBox.getText().toString();
            if(!TextUtils.isEmpty(name)){
                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                Navigation.findNavController(v).navigate(R.id.action_nameFragment_to_emailFragment,bundle);
            }else{
                Toast.makeText(getActivity(), "Please enter name", Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}