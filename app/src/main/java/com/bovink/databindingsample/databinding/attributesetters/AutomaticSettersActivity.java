package com.bovink.databindingsample.databinding.attributesetters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.databinding.AutomaticSettersActBinding;


/**
 * @author bovink
 * @since 2018/3/15
 */

public class AutomaticSettersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AutomaticSettersActBinding binding = AutomaticSettersActBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
