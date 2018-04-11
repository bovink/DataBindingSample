package com.bovink.databindingsample.databinding.layoutdetails;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.databinding.IncludeActBinding;
import com.bovink.databindingsample.model.User;


/**
 * @author bovink
 * @since 2018/03/14
 */

public class IncludeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IncludeActBinding binding = IncludeActBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        User user = new User("Bruce", "Wayne", true);
        binding.setUser(user);
    }
}
