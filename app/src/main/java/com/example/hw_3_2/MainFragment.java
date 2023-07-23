package com.example.hw_3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainFragment extends Fragment {
    private TextView textView;
    private Button btn_plus1, btn_minus1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = requireActivity().findViewById(R.id.tv_0);
        btn_plus1 = requireActivity().findViewById(R.id.btn_plus_1);
        btn_minus1 = requireActivity().findViewById(R.id.btn_minus_1);

        btn_plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value = Double.parseDouble(textView.getText().toString());
                value = value + 1;
                textView.setText(String.valueOf(value));


            }
        });

        btn_minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value = Double.parseDouble(textView.getText().toString());
                value = value - 1;
                textView.setText(String.valueOf(value));

            }
        });
    }
}
