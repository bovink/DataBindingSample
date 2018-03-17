package com.bovink.databindingsample.databinding.layoutdetails;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.CustomBindActBinding;
import com.bovink.databindingsample.model.Person;


/**
 * @author bovink
 * @since 2018/03/14
 */

public class CustomBindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomBindActBinding binding = CustomBindActBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Person person = new Person();
        person.setName("super man");
        person.setSex("male");

        binding.setPerson(person);

    }
}
