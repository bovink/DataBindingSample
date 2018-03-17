package com.bovink.databindingsample.databinding.expression;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bovink.databindingsample.databinding.ResourceActBinding;
import com.bovink.databindingsample.model.Person;


/**
 * @author bovink
 * @since 2018/03/14
 */

public class ResourceActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ResourceActBinding binding = ResourceActBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Person person = new Person();
        person.setName("jack");
        person.setSex("man");
        person.setAdult(false);

        binding.setPerson(person);

    }
}
