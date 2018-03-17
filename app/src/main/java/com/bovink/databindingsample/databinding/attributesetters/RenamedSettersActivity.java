package com.bovink.databindingsample.databinding.attributesetters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.databinding.RenamedSettersActBinding;


/**
 * @author bovink
 * @since 2018/3/15
 */

public class RenamedSettersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RenamedSettersActBinding binding = RenamedSettersActBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
