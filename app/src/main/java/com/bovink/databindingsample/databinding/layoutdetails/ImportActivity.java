package com.bovink.databindingsample.databinding.layoutdetails;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.databinding.ActImportBinding;
import com.bovink.databindingsample.model.User;
import com.bovink.databindingsample.model.View;


/**
 * @author bovink
 * @since 2018/03/08
 */

public class ImportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActImportBinding binding = ActImportBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        User user = new User("Bruce", "Wayne", true);
        binding.setUser(user);

        View view = new View("#000000");
        binding.setViewAlias(view);
    }
}
